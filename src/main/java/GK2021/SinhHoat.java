package GK2021;

import java.util.List;

public class SinhHoat extends KhachHang {
	public Double dinhMuc;
	
	public SinhHoat() {}
	
	public SinhHoat(String maKH, String tenKH, String diaChi, Integer donGia, List<TieuThuNuoc> lstTieuThu, Double dinhMuc) {
		super(maKH, tenKH, diaChi, donGia, lstTieuThu);
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public void xuat() {
		lstTieuThu.forEach(e -> {
			if (kiemTraDinhMuc(e) && e.ngay.equals("3/2021")) {
				System.out.println("Ma KH: " + maKH);
				System.out.println("Ten KH" + tenKH);
				System.out.println("Dia chi: " + diaChi);
				System.out.println("Dinh muc: " + dinhMuc);
				System.out.println("Thanh tien: " + tinhTienNuoc(e));
			}
		});
		
	}
	
	@Override
	public Double tinhTienNuoc(TieuThuNuoc tieuThu) {
		return (tieuThu.soNuoc <= dinhMuc) ? (tieuThu.soNuoc * donGia) : (tieuThu.soNuoc * donGia * dinhMuc + (tieuThu.soNuoc - dinhMuc) * donGia * 2);
	}
	
	public boolean kiemTraDinhMuc(TieuThuNuoc tieuThu) {
		return (tieuThu.soNuoc > dinhMuc) ? true : false;
	}
}

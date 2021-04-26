package GK2021;

import java.util.List;

public class SanXuat extends KhachHang {
	
	public SanXuat() {}
	
	public SanXuat(String maKH, String tenKH, String diaChi, Integer donGia, List<TieuThuNuoc> lstTieuThu) {
		super(maKH, tenKH, diaChi, donGia, lstTieuThu);
	}
	
	@Override
	public void xuat() {
		System.out.println("Ma KH: " + maKH);
		System.out.println("Ten KH" + tenKH);
		System.out.println("Dia chi: " + diaChi);
		lstTieuThu.forEach(e -> {
			System.out.println("Ngay: " + e.ngay);
			System.out.println("Thanh tien: " + tinhTienNuoc(e));
		});
		
	}

	@Override
	public Double tinhTienNuoc(TieuThuNuoc tieuThu) {	
		return (tieuThu.soNuoc > 500) ? (tieuThu.soNuoc * donGia - tieuThu.soNuoc * donGia * 0.03) : (tieuThu.soNuoc * donGia);
	
	}
}

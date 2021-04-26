package GK2021;

import java.util.List;

public abstract class KhachHang {
	public String maKH;
	public String tenKH;
	public String diaChi;
	public Integer donGia;
	List<TieuThuNuoc> lstTieuThu;
	
	public KhachHang() {};
	
	public KhachHang(String maKH, String tenKH, String diaChi, Integer donGia, List<TieuThuNuoc> lstTieuThu) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.donGia = donGia;
		this.lstTieuThu = lstTieuThu;
	}
	
	public abstract Double tinhTienNuoc(TieuThuNuoc tieuThu);
	
	public abstract void xuat();
}

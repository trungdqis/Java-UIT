package GK2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import GK1819.WorkDay;

public class GK2021_Main {

	public static void main(String[] args) {
		// Cau a
		List<KhachHang> lstKH = new ArrayList<>();
		
		List<TieuThuNuoc> lstTieuThu1 = Arrays.asList(
				new TieuThuNuoc("3/2021", 600.0),
				new TieuThuNuoc("4/2021", 750.5),
				new TieuThuNuoc("5/2021", 462.7));
				
		SinhHoat kh1 = new SinhHoat("KH01", "Van A", "Linh Trung - Thu Duc", 27000, lstTieuThu1, 500.0);
		
		lstKH.add(kh1);
		
		// cau b
		// du lieu test
		List<TieuThuNuoc> lstTieuThu2 = Arrays.asList(
				new TieuThuNuoc("3/2021", 400.0),
				new TieuThuNuoc("4/2021", 750.5));
				
		SinhHoat kh2 = new SinhHoat("KH02", "Van B", "Phu Huu - Quan 9", 24000, lstTieuThu2, 450.0);
		
		lstKH.add(kh2);
		
		List<TieuThuNuoc> lstTieuThu3 = Arrays.asList(
				new TieuThuNuoc("3/2021", 520.0),
				new TieuThuNuoc("4/2021", 490.5));
				
		SinhHoat kh3 = new SinhHoat("KH03", "Van C", "Dau Tieng - Binh Duong", 22000, lstTieuThu3, 470.0);
		
		lstKH.add(kh3);
		
		List<TieuThuNuoc> lstTieuThu4 = Arrays.asList(
				new TieuThuNuoc("3/2021", 429.6),
				new TieuThuNuoc("4/2021", 625.7));
				
		SanXuat kh4 = new SanXuat("KH04", "Van D", "Phuoc Long B - Quan 9", 26000, lstTieuThu4);
		
		lstKH.add(kh4);
		
		lstKH.forEach(e -> {
			if (e.getClass().equals(SinhHoat.class)) {
				e.xuat();
				System.out.println();
			}		
		});

	}

}

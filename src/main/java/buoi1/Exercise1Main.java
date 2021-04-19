package buoi1;

import java.util.Scanner;

public class Exercise1Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scan = new Scanner(System.in);
		menu();
		
		scan.close();
	}
	
	public static double getCircumference(int radius) {
		return (double) Math.round(Math.PI * radius * 100) / 100;
	}
	
	public static double getDividend(int num1, int num2) {
		return (double) Math.round(num1 / num2 * 1000) / 1000;
	}
	
	public static void getTask4(String str1, String str2) {
		System.out.println("Length of str1: " + str1.length());
		System.out.println("First three characters of str1: " + str1.substring(0, 3));
		System.out.println("Last three character of str1: " + str1.substring(str1.length() - 3));
		System.out.println("6th character of str1:" + str1.charAt(6));
		System.out.println("New string: " + str1.substring(0, 3) + str2.substring(str2.length() - 3));
		System.out.println(("Str1 equal Str2? " + str1.equals(str2)));
		System.out.println("Str1 equal Str2 (Ignore Case)" + str1.equalsIgnoreCase(str2));
		System.out.println("Str1 contain Str2? " + str2.indexOf(str1));
	}
	
	public static int getElectricalFee(int powerNum) {
		if (powerNum <= 50) {
			return powerNum * 2000;
		} else if (powerNum > 50 && powerNum <= 100) {
			return (powerNum - 50) * 2000 + (powerNum - (powerNum - 50)) * 2500;
		} else {
			return (powerNum - 50) * 2000 + (powerNum - (powerNum - 50)) * 3500;
		}
	}
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		int optional;
		System.out.println("1. Bài 1: Tính chu vi đường tròn.");
		System.out.println("2. Bài 2: Chia 2 số bất kỳ.");
		System.out.println("3. Bài 3: Thao tác với phân số.");
		System.out.println("4. Bài 4: Thao tác với chuỗi.");
		System.out.println("5. Bài 5: Tính tiền điện.");
		System.out.println("0. Thoát.");
		
		while (true) {
			System.out.println("Nhập lựa chọn: ");
			optional = scan.nextInt();
			
			switch (optional) {
			case 1:
			{	
				System.out.println("Bài 1: Tính chu vi đường tròn.");
				int radius;
				System.out.println("Input radius: ");
				radius = scan.nextInt();
				System.out.println("Chu vi đường tròn có bán kính = " + radius + " là: " + getCircumference(radius));
				//scan.nextLine();
			}
				break;
			case 2:
			{
				System.out.println("Bài 2: Chia 2 số bất kỳ.");
				int num1, num2;
				System.out.println("Input first number: ");
				num1 = scan.nextInt();
				System.out.println("Input second number: ");
				num2 = scan.nextInt();
				System.out.println(num1 + " / " + num2 + " = " + getDividend(num1, num2));
			}
				break;
			case 3:
			{
				System.out.println("Bài 3: Thao tác với phân số.");
				Fraction f1 = new Fraction(2, 5);
				Fraction f2 = new Fraction(4, 6);
				
				System.out.println("Addition: " + f1 + " + " + f2 + " = " + f1.add(f2).toString());
				System.out.println("Subtraction: " + f1 + " - " + f2 + " = " + f1.subtract(f2).toString());
				System.out.println("Multiplication: " + f1 + " x " + f2 + " = " + f1.multiply(f2).toString());
				System.out.println("Division: " + f1 + " : " + f2 + " = " + f1.devide(f2).toString());
			}
				break;
			case 4:
			{
				System.out.println("Bài 4: Thao tác với chuỗi.");
				String str1;
				String str2;
				System.out.println("Input Str1: ");
				str1 = scan.nextLine();
				System.out.println("Input Str2: ");
				str2 = scan.nextLine();
				getTask4(str1, str2);
			}
				break;
			case 5:
			{
				System.out.println("Bài 5: Tính tiền điện.");
				int powerNum;
				System.out.println("Input power number: ");
				powerNum = scan.nextInt();
				System.out.println("Electricical fee: " + getElectricalFee(powerNum));
			}
				break;
			case 0:
				System.out.println("Thoát.");
				return;
			default:
				break;
			}
		}	
	}
}

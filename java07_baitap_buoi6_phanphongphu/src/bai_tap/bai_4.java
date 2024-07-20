package bai_tap;
import java.util.Scanner;

public class bai_4 {
	public static void main(String[] args) {
		 
		int luaChon;
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Vui lòng chọn phép tính\n1. +\n2. -\n3. *\n4. /");
		// nhập lựa chọn nhỏ hơn 1 hoặc lớn hơn 4 cho nhập lại
		do {
			 System.out.print("Lựa chọn: ");
			 luaChon = banPhim.nextInt();
		} while (luaChon < 1 || luaChon > 4);
		 
		System.out.print("Nhập vào số nguyên thứ nhất: ");
		int soA = banPhim.nextInt();

		System.out.print("Nhập vào số nguyên thứ hai: ");
		int soB = banPhim.nextInt();
		
		phepTinh(luaChon, soA, soB);
		 
		banPhim.close();
	}
	public static void phepTinh(int luaChon, int soA, int soB) {
		double ketQua = 0;
			switch (luaChon) {
			case 1:
				ketQua = cong(soA, soB);
				break;
			case 2:
				ketQua = tru(soA, soB);
				break;
			case 3:
				ketQua = nhan(soA, soB);
				break;
			case 4:
				ketQua = chia(soA, soB);
				break;
			default:
				
				break;
			}
		System.out.print("Kết quả " + ketQua);
	}
	public static double cong(int soA, int soB) {
		return soA + soB;
	}
	public static double tru(int soA, int soB) {
		return soA - soB;
	}
	public static double nhan(int soA, int soB) {
		return soA * soB;
	}
	public static double chia(int soA, int soB) {
		return (double)soA / soB;
	}
}
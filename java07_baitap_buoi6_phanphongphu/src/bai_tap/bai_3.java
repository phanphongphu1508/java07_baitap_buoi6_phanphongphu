package bai_tap;
import java.util.Scanner;
public class bai_3 {
	public static void main(String[] args) {
		
		int[] soNguyen = new int[3];
		nhap(soNguyen);
		tinhTong(soNguyen);
	}
	public static void nhap(int[] soNguyen) {	
		Scanner banPhim = new Scanner(System.in);
		for (int i = 0; i < soNguyen.length; i++) {
			System.out.print("Nhập vào số nguyên thứ " + (i + 1) + ": ");
			soNguyen[i] = banPhim.nextInt();
		}
		banPhim.close();
	}
	public static void tinhTong(int[] soNguyen) {
		int tong = 0;
		// dùng vòng lặp for-each để duyệt qua từng phần tử trong mảng và gán cho so
		for (int so: soNguyen) {
			tong += so;
		}
		System.out.print("Tổng 3 số là: " + tong);
	}
}
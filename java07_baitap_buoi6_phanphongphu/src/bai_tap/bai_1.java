package bai_tap;
import java.util.Scanner;

public class bai_1 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập vào số A: ");
		int soA = banPhim.nextInt();
		
		System.out.print("Nhập vào số B: ");
		int soB = banPhim.nextInt();
		
		System.out.print("Nhập vào số C: ");
		int soC = banPhim.nextInt();
		
		banPhim.close();
		
		// gọi hàm soLonNhat
		soLonNhat(soA, soB, soC);
	}
	public static void soLonNhat(int soA, int soB, int soC) {
		int max = soA;
		
		if (max < soB) {
			max = soB;
		}
		if (max < soC) {
			max = soC;
		}
		System.out.print("Số lớn nhất là: " + max);
	}
}

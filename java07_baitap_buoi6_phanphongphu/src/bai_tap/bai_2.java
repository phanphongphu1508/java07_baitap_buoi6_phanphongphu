package bai_tap;
import java.util.Scanner;
public class bai_2 {
	public static void main(String[] args) {
		
		Scanner banPhim= new Scanner(System.in);
		System.out.print("Nhập vào số nguyên: ");
		int soNguyen = banPhim.nextInt();
		banPhim.close();
		
		kiemTra(soNguyen);
	}
	public static void kiemTra(int soNguyen) {
		if(soNguyen % 2 == 0) {
			System.out.print(soNguyen + " là số chẵn");
		}
		if(soNguyen % 2 != 0) {
			System.out.print(soNguyen + " là số lẻ");
		}
	}
}

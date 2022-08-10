package Bai1;

import java.util.Scanner;

public class May {
    private String maMay, kieuMay, tinhTrang;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Ma may:");
        maMay = scanner.nextLine();
        System.out.print("Nhap kieu may:");
        kieuMay = scanner.nextLine();
        System.out.print("Nhap tinh trang may:");
        tinhTrang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma May:" + maMay);
        System.out.println("Kieu May:" + kieuMay);
        System.out.println("Tinh Trang:" + tinhTrang);
    }
}

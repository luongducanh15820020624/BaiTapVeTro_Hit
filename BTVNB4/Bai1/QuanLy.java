package Bai1;

import java.util.Scanner;

public class QuanLy {
    private String maQL, hoTen;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Ma Quan Ly:");
        maQL = scanner.nextLine();
        System.out.print("Nhap Ho Ten QL:");
        hoTen = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma Quan Ly:" + maQL);
        System.out.println("Ho Ten Quan Ly:" + hoTen);
    }
}

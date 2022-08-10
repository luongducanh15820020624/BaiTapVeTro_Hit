package Bai1;

import java.util.Scanner;

public class PhongMay {
    private String maPhong, tenPhong;
    private double dienTich;
    QuanLy x = new QuanLy();
    May y = new May();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Ma Phong:");
        maPhong = scanner.nextLine();
        System.out.print("Nhap Ten Phong:");
        tenPhong = scanner.nextLine();
        System.out.print("Nhap Dien Tich Phong:");
        dienTich = scanner.nextDouble();
        x.nhap();
        y.nhap();
    }

    public void xuat() {
        System.out.println("Ma Phong:" + maPhong);
        System.out.println("Ten Phong:" + tenPhong);
        System.out.println("Dien Tich Phong:" + dienTich);
        x.xuat();
        y.xuat();
    }
}

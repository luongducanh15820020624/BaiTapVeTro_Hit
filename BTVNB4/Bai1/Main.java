package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        System.out.println("Nhap Thong Tin!");
        a.nhap();
        System.out.println();
        System.out.println("Hien Thi Thong Tin!");
        a.xuat();
    }
}

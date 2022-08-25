package KiemTra2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerSinhVien managerSinhVien = new ManagerSinhVien();
        while (true) {
            System.out.println("Enter 1: Them 1 sinh vien:");
            System.out.println("Enter 2: Hien thi danh sach sinh vien:");
            System.out.println("Enter 3: Tim kiem sinh vien co diem trung binh > 5:");
            System.out.println("Enter 4: Thoat!");
            System.out.println("Nhap lua chon:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerSinhVien.addSinhVien();
                    break;
                }
                case "2": {
                    managerSinhVien.xuat();
                    break;
                }
                case "3": {
                    managerSinhVien.timKiem().forEach(sinhVien -> System.out.println(sinhVien.toString()));
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    continue;
            }
        }
    }
}

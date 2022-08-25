package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerSinhVien managerSinhVien = new ManagerSinhVien();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 sinh vien vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các sinh vien");
            System.out.println("Enter 3: Xóa 1 sinh vien theo id");
            System.out.println("Enter 4: Sap xep tang dan theo ten:");
            System.out.println("Enter 5: Sap Xep tang dan theo gba:");
            System.out.println("Enter 6: Sua danh sach:");
            System.out.println("Enter 7: Thoat chuong trinh:");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerSinhVien.nhap();
                    break;
                }
                case "2": {
                    System.out.println("Danh sach sinh vien:");
                    managerSinhVien.xuat();
                    break;
                }
                case "3": {
                    System.out.print("Nhap id ban muon xoa:");
                    int id = managerSinhVien.inputID();
                    System.out.println(managerSinhVien.deleteSinhVien(id) ? "Xoa Thanh Cong" : "Khong co id ban muon xoa!");
                    System.out.println("Danh sach sinh vien sau khi xoa:");
                    managerSinhVien.xuat();
                    break;
                }
                case "4": {
                    System.out.println("Danh sach sinh vien sap xep tang dan theo ten:");
                    managerSinhVien.sortbyName();
                    break;
                }
                case "5": {
                    System.out.println("Danh sach sinh vien sap xep tang dan theo gba:");
                    managerSinhVien.sortbyGba();
                    break;
                }
                case "6": {
                    System.out.print("Nhap id can sua:");
                    int id = managerSinhVien.inputID();
                    managerSinhVien.edit(id);
                    break;
                }
                case "7": {
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    continue;
            }
        }
    }
}

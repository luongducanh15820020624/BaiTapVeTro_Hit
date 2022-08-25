package KiemTra;
import java.util.Scanner;
public class Main {
    public static int n;
    public static String maSV;
    public static SinhVien y = new SinhVien();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerSinhVien managerSinhVien = new ManagerSinhVien();
        while (true) {
            System.out.println("\tHELLO BẠN NHỎ");
            System.out.println("\t==========MENU=========");
            System.out.println("Enter 1: Add 1 sinh vien vào List tương ứng");
            System.out.println("Enter 2: Hiển thị danh sách các sinh vien");
            System.out.println("Enter 3: Xóa 1 sinh vien theo msv");
            System.out.println("Enter 4: Sua thong tin:");
            System.out.println("Enter 5: Sap xep tang dan theo khoa hoc");
            System.out.println("Enter 6: Sap xep giam dan ho ten:");
            System.out.println("Enter 7: Dừng chương trình");
            System.out.print("Nhap lua chon cua ban:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerSinhVien.addSinhVien();
                    break;
                }
                case "2": {
                    System.out.println("Danh sach các sinh viên:");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "Que Quan", "NaSV", "Khoa", "Khoa Hoc", "Ma Lop", "Ten Lop");
                    managerSinhVien.xuatSinhVien();
                    break;

                }
                case "3": {
                    System.out.println("Nhap ma sinh vien ban muon xoa:");
                    maSV = scanner.nextLine();
                        System.out.println(managerSinhVien.xoa(maSV) ? "Xoa thanh cong" : "That Bai");
                    System.out.println("Danh Sach sau khi Thuc Hien:");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "Que Quan", "NaSV", "Khoa", "Khoa Hoc", "Ma Lop", "Ten Lop");
                    managerSinhVien.xuatSinhVien();
                    break;
                }
                case "4": {
                    System.out.println("Danh sach sinh vien sau khi thay doi:");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "Que Quan", "NaSV", "Khoa", "Khoa Hoc", "Ma Lop", "Ten Lop");
                    managerSinhVien.change();
                    managerSinhVien.xuatSinhVien();
                    break;
                }
                case "5": {
                    System.out.println("Danh sach sinh vien tang dan theo khoa hoc:");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "Que Quan", "NaSV", "Khoa", "Khoa Hoc", "Ma Lop", "Ten Lop");
                    managerSinhVien.sortTang();
                    break;
                }
                case "6": {
                    System.out.println("Danh sach sinh vien giam dan theo ten:");
                    System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Ho ten", "Tuoi", "Que Quan", "NaSV", "Khoa", "Khoa Hoc", "Ma Lop", "Ten Lop");
                    managerSinhVien.sortGiam();
                    break;
                }
                case "7":{
                    return;
                }
                default:
                    System.out.println("Nhap sai!");
                    break;
            }
        }

    }
}

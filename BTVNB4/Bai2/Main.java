package Bai2;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int n;
    static Student[] a = new Student[n];

    public static void xuat(Student[] a, int n) {
        System.out.println("=================DANH SACH SINH VIEN==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }

    public static void timKiem(Student[] a, int n) {
        System.out.print("Nhap ID Sinh Vien  muon tim: ");
        int b = scanner.nextInt();
        System.out.println("=================DANH SACH SINH VIEN BAN MUON TIM KIEM==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < a.length; i++) {
            if (a[i].getId() == b) {
                a[i].xuat();
            }
        }
    }

    public static void thayDoi(Student a[], int n) {
        System.out.println("=================DANH SACH SINH VIEN SAU KHI THAY DOI ==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < n; i++) {
            a[i].x.setProvince(a[i].x.getProvince().replaceAll("ThanhHoa", "HaiPhong"));
            a[i].xuat();
        }
    }

    public static void xoa(Student a[], int n) {
        System.out.print("Nhap id can xoa:");
        int c = scanner.nextInt();
        System.out.println("=================DANH SACH SINH VIEN SAU KHI XOA==================");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s\n", "ID Add", "district", "province", "IDStudent", "name", "Age");
        for (int i = 0; i < n; i++) {
            if (a[i].getId() == c) {
                for (int j = i; j < n - 1; j++)
                    a[j] = a[j + 1];
            }
            n--;
            a[i].xuat();
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap n sinh vien:");
        int n = scanner.nextInt();
        Student a[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            a[i] = new Student();
            a[i].nhap();
        }
        int c;
        do {
            System.out.println("\n**********************************************************");
            System.out.println("1 Hien thi thong tin sinh vien");
            System.out.println("2 Tim kiem thong tin sinh vien");
            System.out.println("3 Thay doi thong tin sinh vien");
            System.out.println("4 Xoa Thong tin sinh vien muon chon");
            System.out.println("5 thoat khoi chuong trình ");
            System.out.println("**********************************************************");
            System.out.print("\nLua chon cua Nam Anh: ");
            c = scanner.nextInt();
            scanner.nextLine();

            switch (c) {
                case 1:
                    xuat(a, n);
                    break;
                case 2:
                    timKiem(a, n);
                    break;
                case 3:
                    thayDoi(a, n);
                    break;
                case 4:
                    xoa(a, n);
                    break;

                case 5:
                    System.out.println("Tam Biet!");
            }

        } while (c != 5);
    }
}
















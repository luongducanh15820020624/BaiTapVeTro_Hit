package KiemTra;

import java.util.Scanner;


public class LopHoc {
    Scanner scanner = new Scanner(System.in);
    private String maLop;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void nhap() {
        System.out.print("Nhap Ma Lop:");
        maLop = scanner.nextLine();
        System.out.print("Nhap Ten lop:");
        tenLop = scanner.nextLine();
    }

    @Override
    public String toString() {
        return  maLop + "\t\t   " + tenLop + "\t\t";
    }
}

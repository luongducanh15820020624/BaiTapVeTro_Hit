package KiemTra;
import java.util.Scanner;
public class SinhVien extends Nguoi {
    Scanner scanner = new Scanner(System.in);
    private String maSV;
    private String khoa;
    private double khoaHoc;
    LopHoc x = new LopHoc();

    public SinhVien() {
    }

    public SinhVien(String hoTen, int tuoi, String queQuan, String maSV, String khoa, double khoaHoc, LopHoc x) {
        super(hoTen, tuoi, queQuan);
        this.maSV = maSV;
        this.khoa = khoa;
        this.khoaHoc = khoaHoc;
        this.x = x;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public double getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(double khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public LopHoc getX() {
        return x;
    }

    public void setX(LopHoc x) {
        this.x = x;
    }

    void nhap() {
        System.out.print("Nhap ho ten:");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap que quan:");
        queQuan = scanner.nextLine();
        System.out.print("Nhap ma sv:");
        maSV = scanner.nextLine();
        System.out.print("Nhap Khoa:");
        khoa = scanner.nextLine();
        System.out.print("Nhap Khoa hoc:");
        khoaHoc = scanner.nextDouble();
        scanner.nextLine();
        x.nhap();
    }

    @Override
    public String toString() {
        return  hoTen + "\t   " + tuoi + "\t\t" + queQuan +"\t\t"  + maSV + "\t\t" + khoa + "\t\t" + khoaHoc + "\t " + x.toString();
    }
}

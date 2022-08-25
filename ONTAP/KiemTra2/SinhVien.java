package KiemTra2;
import java.io.Serializable;
import java.util.Scanner;

public class SinhVien extends Nguoi implements Serializable{
    public static Scanner scanner = new Scanner(System.in);
    private int id;
    Diem diem = new Diem();

    public SinhVien() {
    }

    public SinhVien(String hoten, int tuoi, String gioiTinh, int id, Diem diem) {
        super(hoten, tuoi, gioiTinh);
        this.id = id;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    public Double diemTB() {
        return diem.getDiemTB();
    }

    public void nhap() {
        System.out.print("Nhap ho ten:");
        hoten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh:");
        gioiTinh = scanner.nextLine();
        diem.nhap();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\t' + diem.toString() +
                '}';
    }
}

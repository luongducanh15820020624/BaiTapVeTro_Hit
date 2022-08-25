package KiemTra2;
import java.util.Scanner;
import java.io.Serializable;

public class Diem implements Serializable{
    public static Scanner scanner = new Scanner(System.in);
    private double diem1, diem2, diem3, diemTB;

    public Diem() {
    }

    public Diem(double diem1, double diem2, double diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDỉem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDiemTB() {
        diemTB = (diem1 + diem2 + diem3)/3;
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public void nhap(){
        System.out.print("Nhap diem 1:");
        diem1 = scanner.nextDouble();
        System.out.print("Nhap diem 2:");
        diem2 = scanner.nextDouble();
        System.out.print("Nhap diem 3:");
        diem3 = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diem3=" + diem3 +
                ", diemTB=" + getDiemTB() +
                '}';
    }
}

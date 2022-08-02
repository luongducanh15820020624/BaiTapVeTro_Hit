import java.util.Scanner;
public class NhanVien {
    public static int mnv = 0;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String boPLV;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, String boPLV) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.boPLV = boPLV;
    }

    public void xuat(){
        mnv++;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",mnv, ten, tuoi, diaChi, boPLV);
    }
    public static void main(String[] args){
        System.out.println("\t\t\tTHONG TIN CAC NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","MaNV","Ten" , "Tuoi", "Dia Chi", "BoPhan");
        NhanVien A = new NhanVien("A", 19, "CNTT","QLI" );
        NhanVien B = new NhanVien("B", 21, "HN", "QLI");
        NhanVien C = new NhanVien("C", 21, "HP", "CNTT");
        NhanVien D = new NhanVien("D", 24, "QLI", "CNTT");
        NhanVien E = new NhanVien("E", 24, "HN", "QLI");
        A.xuat();
        B.xuat();
        C.xuat();
        D.xuat();
        E.xuat();
    }
}

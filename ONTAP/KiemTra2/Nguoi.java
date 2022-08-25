package KiemTra2;
import java.io.Serializable;

public class Nguoi implements Serializable{
    protected String hoten;
    protected int tuoi;
    protected String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoten, int tuoi, String gioiTinh) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}

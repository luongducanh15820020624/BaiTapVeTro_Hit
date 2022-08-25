package KiemTra2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerSinhVien {
    private List<SinhVien> sinhViens;
    private SinhVienDAO sinhVienDAO;

    public ManagerSinhVien() {
        this.sinhViens = new ArrayList<>();
        this.sinhVienDAO = new SinhVienDAO();
    }

    public void addSinhVien() {
        SinhVien sinhVien = new SinhVien();
        int id = (sinhViens.size() > 0) ? (sinhViens.size() + 1) : 1;
        System.out.println("Ma sinh vien:" + id);
        sinhVien.nhap();
        this.sinhViens.add(sinhVien);
        sinhVienDAO.write(sinhViens);
    }

    public void xuat() {
        this.sinhViens = sinhVienDAO.read();
        this.sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }

    public List<SinhVien> timKiem() {
        this.sinhViens = sinhVienDAO.read();
        return this.sinhViens.stream().filter(sinhVien -> sinhVien.diemTB() >= 5).collect(Collectors.toList());
    }

}

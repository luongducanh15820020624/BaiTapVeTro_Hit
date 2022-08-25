package KiemTra;
import java.util.ArrayList;
import java.util.List;


public class ManagerSinhVien {
   private List<SinhVien> sinhViens;

   public ManagerSinhVien (){
       this.sinhViens= new ArrayList<>();
   }

    public void addSinhVien(){
       SinhVien sinhVien = new SinhVien();
       sinhVien.nhap();
       this.sinhViens.add(sinhVien);
    }
    public  void xuatSinhVien(){
       this.sinhViens.forEach(nguoi -> System.out.println(nguoi.toString()));
    }

    public boolean xoa(String maSV){
       Nguoi N = this.sinhViens.stream().filter(sinhVien -> sinhVien.getMaSV().equals(maSV)).findFirst().orElse(null);
       if (N == null){
           return false;
       }
       this.sinhViens.remove(N);
       return true;
    }
    public boolean Check(String maSV){
        Nguoi N = this.sinhViens.stream().filter(sinhVien -> sinhVien.getMaSV().equals(maSV)).findFirst().orElse(null);
        if (N == null){
            return false;
        }
        return true;
    }
    public void change(){
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getKhoa().equals("QTKD")) {
                sinhViens.get(i).setKhoa("CNTT");
            }
        }
    }
    public void sortTang(){
        sinhViens.sort(((o1, o2) -> Double.compare(o1.getKhoaHoc(), o2.getKhoaHoc())));
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }
    public void sortGiam(){
        sinhViens.sort(((o1, o2) -> CharSequence.compare(o2.getHoTen(), o1.getHoTen())));
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }

}

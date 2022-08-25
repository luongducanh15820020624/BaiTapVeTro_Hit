package Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManagerSinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> sinhViens;
    private SinhVienDao sinhVienDao;

    public ManagerSinhVien() {
        this.sinhViens = new ArrayList<>();
        this.sinhVienDao = new SinhVienDao();
    }

    public void nhap() {
            int id = (sinhViens.size() > 0) ? (sinhViens.size() + 1) : 1;
            System.out.println("student id = " + id);
            System.out.print("Nhap name:");
            String name = inputName();
            System.out.print("Nhap age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap address:");
            String address = inputAddress();
            System.out.print("Nhap gba:");
            Double gba = inputGpa();
            scanner.nextLine();
            SinhVien sinhVien = new SinhVien(id, name, age, address, gba);
            sinhViens.add(sinhVien);
            sinhVienDao.write(sinhViens);
    }

    public void xuat() {
        this.sinhViens = sinhVienDao.read();
        this.sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
    }

    public boolean deleteSinhVien(int id) {
        this.sinhViens = sinhVienDao.read();
        SinhVien SV = this.sinhViens.stream().filter(sinhVien -> sinhVien.getId() == id).findFirst().orElse(null);
        if (SV == null) {
            return false;
        } else {
            this.sinhViens.remove(SV);
            sinhVienDao.write(sinhViens);
            return true;
        }
    }

    public boolean checkID(int id) {
        SinhVien SV = this.sinhViens.stream().filter(sinhVien -> sinhVien.getId() == id).findFirst().orElse(null);
        if (SV == null) {
            return false;
        }
        return true;
    }

    public void sortbyName() {
        this.sinhViens = sinhVienDao.read();
        sinhViens.sort((o1, o2) -> CharSequence.compare(o1.getName(), o2.getName()));
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
        sinhVienDao.write(sinhViens);

    }

    public void sortbyGba() {
        this.sinhViens = sinhVienDao.read();
        sinhViens.sort((o1, o2) -> Double.compare(o1.getGba(), o2.getGba()));
        sinhViens.forEach(sinhVien -> System.out.println(sinhVien.toString()));
        sinhVienDao.write(sinhViens);
    }

    public void edit(int id) {
        this.sinhViens = sinhVienDao.read();
        if (checkID(id) == true) {
            for (int i = 0; i < sinhViens.size(); i++) {
                if (sinhViens.get(i).getId() == id) {
                    System.out.print("Nhap ten moi:");
                    scanner.nextLine();
                    sinhViens.get(i).setName(inputName());
                    System.out.print("Nhap tuoi moi:");
                    sinhViens.get(i).setAge(inputAge());
                    scanner.nextLine();
                    System.out.print("Nhap dia chi moi:");
                    sinhViens.get(i).setAddress(inputAddress());
                    System.out.print("Nhap gpa moi:");
                    sinhViens.get(i).setGba(inputGpa());
                    scanner.nextLine();
                    break;
                }
            }
            System.out.println("Sua Thanh Cong");
            sinhVienDao.write(sinhViens);
        } else {
            System.out.println("Khong co id ban can sua!");
        }
    }

    public int inputID() {
        return scanner.nextInt();
    }

    public String inputName() {
        return scanner.nextLine();
    }

    public int inputAge() {
        return scanner.nextInt();
    }

    public String inputAddress() {
        return scanner.nextLine();
    }

    public Double inputGpa() {
        return scanner.nextDouble();
    }

}

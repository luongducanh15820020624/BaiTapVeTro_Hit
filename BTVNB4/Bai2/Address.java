package Bai2;

import java.util.Scanner;

public class Address {
    private String id1, district, province;

    public Address() {
    }

    public Address(String id, String district, String province) {
        this.id1 = id;
        this.district = district;
        this.province = province;
    }

    public String getId() {
        return id1;
    }

    public void setId(String id) {
        this.id1 = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id Address: ");
        id1 = scanner.nextLine();
        System.out.print("Nhap district: ");
        district = scanner.nextLine();
        System.out.print("Nhap provonce: ");
        province = scanner.nextLine();
    }

    public void xuat() {
        System.out.printf("%-10s%-10s%-10s", id1, district, province);
    }
}

package Bai2;

import java.util.Scanner;

public class Student {
    private String name;
    private int id, age;
    Address x = new Address();

    public Student() {
    }

    public Student(String name, int id, int age, Address x) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void nhap() {
        x.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id Student: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap name: ");
        name = scanner.nextLine();
        System.out.print("Nhap age: ");
        age = scanner.nextInt();
    }

    public void xuat() {
        x.xuat();
        System.out.printf("%-10s%-10s%-10s", id, name, age);
        System.out.println();
    }

}

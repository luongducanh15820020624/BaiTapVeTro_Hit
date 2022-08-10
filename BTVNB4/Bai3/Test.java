package Bai3;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        int a;
        long b;
        float c;
        double d;
        Scanner sn = new Scanner(System.in);
        Prime A = new Prime();
        System.out.print("Nhap a: ");
        a = sn.nextInt();
        System.out.print("Nhap b: ");
        b = sn.nextLong();
        System.out.print("Nhap c: ");
        c = sn.nextFloat();
        System.out.print("Nhap d: ");
        d = sn.nextDouble();
        System.out.println("So a la so nguyen to: " + A.isPrime(a));
        System.out.println("So b la so nguyen to: " + A.isPrime(b));
        System.out.println("So c la so nguyen to: " + A.isPrime(c));
        System.out.println("So d la so nguyen to: " + A.isPrime(d));
    }
}

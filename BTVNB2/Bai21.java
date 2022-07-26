import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai21 {
    public static void SapXep(int []a)
    {  System.out.print("\nMang sau khi sap xep:");
        int temp = 0;
        for(int i = 0; i < a.length;i++)
        {
            for(int j = i+1; j < a.length; j++)
            {
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
    }

    public static boolean KtraNT(int n){
        int dem = 0;
        for( int i = 1; i <= n; i++)
            if(n%i == 0){
                dem++;
            }
        if(dem==2){
            return true;
        }
        return false;
    }
    public static void InSNT(int a[], int n) {
        System.out.print("\nCac so nguyen to co trong mang:");
        for (int i = 0; i < n; i++)
            if (KtraNT(a[i]) == true)
                System.out.print(a[i] + " ");
    }


    public static boolean KtSCP(int n){
        double sqr = sqrt(n);
        return (sqr*sqr == n);
    }
    public static void InSCP(int []a, int n){
        System.out.print("\nCac chinh phong co trong mang:");
        for (int i = 0; i < n; i++)
            if (KtSCP(a[i]) == true)
                System.out.print(a[i] + " ");
    }
    public static int Min(int []a, int n){
        int min = a[0];
        for( int i = 0; i < n; i++)
            if(min > a[i])
                min = a[i];
        return min;
    }
    public static void ViTriMin(int []a, int n){
        System.out.print("\nVi tri cac so nho nhat:");
        for (int i = 0; i < n; i++)
            if (a[i] == Min(a,n))
                System.out.print((i + 1) +  " ");
    }
    public static double TBC(int []a, int n){
        int dem=0;
        int tong=0;
        double tbc;
        for  ( int  i =  1 ; i <a.length; i = i + 2 ) {
            if(a[i]%2!=0)
                tong+=a[i];
            dem++;
    }
     return (double) (tbc=tong/dem);
}



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri n:");
        int n = scanner.nextInt();
        int []a = new int[n];
        for(int i = 0 ; i < n; i++)
        {
            System.out.print("a["+ (i+1) + "]=");
            a[i] = scanner.nextInt();
        }
        System.out.println("Hien thi mang:");
        for(int i = 0 ; i < a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
        SapXep(a);
        InSNT(a,n);
        InSCP(a,n);
        ViTriMin(a,n);
        System.out.print("\nTBC cac so le o VT chan:" + TBC(a,n));



    }

}

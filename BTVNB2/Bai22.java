import java.util.Scanner;
public class Bai22 {
    public static void main(String[] args) {
        String s = "        luoNg    duC    aNh 1580624!    ";
        System.out.println("\nChuỗi ban đầu: " + s);
        System.out.println("Xoa Cac So Co Trong Chuoi: ");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                s = s.replace(String.valueOf(s.charAt(i)), " ");
            }
        }
        System.out.println(s);
        System.out.println("Xoa Dau Cach Thua: ");
        String S1 = s.replaceAll("\\s+", " ").trim();
        System.out.println(S1);
        System.out.println("Viet Hoa Chu Cai Dau Cac Chu Cai Sau Viet Thuong: ");
        String[] words = S1.split(" ");
        S1 = "";
        for( int i = 0; i < words.length; i++){
            S1 += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(S1);
    }
}

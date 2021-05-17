package fs.apidef.identifyservice.java.class_4;

// Nhập vào một chuỗi và đếm số từ của chuỗi đó.
//Ví dụ “Học lập trình” có 3 từ

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lession_8 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int soTuTrongChuoi = stringTokenizer.countTokens();
        System.out.println("Số từ có trong chuỗi \"" + str + "\" là " + soTuTrongChuoi);
    }
}
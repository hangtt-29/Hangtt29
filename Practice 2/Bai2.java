package VariableType;

import java.util.Scanner;

public class Bai2 {
    //Nhập một chữ cái. Nếu là chữ thường thì đổi
    //sang chữ hoa, ngược lại đổi sang chữ thường.
    public void ChuyendoiString() {
            String str;
            Scanner sn = new Scanner(System.in);
            System.out.println("Nhập vào chữ cái sau:");
            str = sn.nextLine();
            String str1 = str.toLowerCase();
            String str2 = str.toUpperCase();
            if (str == str1) {
                System.out.println("In ra chữ thường:" + str2);
            } else {
                System.out.println("In ra chữ hoa:" + str1);
            }

    }
}

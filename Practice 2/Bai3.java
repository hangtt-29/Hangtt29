package VariableType;

import java.util.Scanner;

public class Bai3 {
    //Giải phương trình bậc nhất ax + b = 0.
    public void PhuongTrinhBacNhat() {
        while (true) {
            int a, b;
            float x;
            Scanner sn = new Scanner(System.in);
            System.out.println("Nhập vào số a:");
            a = sn.nextInt();
            System.out.println("Nhập vào số b: ");
            b = sn.nextInt();
            x=(-b/a);
            if (a==0){
                if (b==0){
                    System.out.println("Phương trình có vô số nghiệm");
                }else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }else {
                System.out.println("Phương trình có 1 nghiệm duy nhất:"+x);

            }


        }
    }
}

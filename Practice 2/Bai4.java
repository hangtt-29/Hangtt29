package VariableType;

import java.util.Scanner;

public class Bai4 {
    //Giải phương trình bậc hai ax2 + bx + c = 0.
    public void GiaiPhuongTrinhBacHai() {
        while (true) {
            int a, b, c, deta;
            double x1, x2;
            Scanner sn = new Scanner(System.in);
            System.out.println("Nhập vào số a:");
            a = sn.nextInt();
            System.out.println("Nhập vào số b:");
            b = sn.nextInt();
            System.out.println("Nhập vào số c:");
            c = sn.nextInt();
            deta = (b * b - 4 * a * c);
            x1 = -(b + Math.sqrt(deta)) / (2 * a);
            x2 = -(b - Math.sqrt(deta)) / (2 * a);
            System.out.println("Detal bằng: " + deta);
            if (deta > 0) {
                System.out.println("Phương trình có 2 nghiệm " + " x1= " + x1 + "x2= " + x2);
            } else if (deta == 0) {
                System.out.println("Phương trình có nghiệm kép:" + "x1=x2=" +(-b / 2 * a));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }

        }
    }
}

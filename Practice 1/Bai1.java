package OnTap;

import java.util.Calendar;
import java.util.Scanner;

public class Bai1 {

//Bài 5 Nhập vào 2 số a,b tính tổng, hiệu, tích, thương của 2 số đó.
    static float a, b;

    public void Sum() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sn.nextFloat();
        System.out.println("Nhập vào số b:");
        b = sn.nextFloat();
        float tong;
        tong=a+b;
        System.out.println("Tổng 2 số a+b = "+ tong);
    }
    public void Sub() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sn.nextFloat();
        System.out.println("Nhập vào số b:");
        b = sn.nextFloat();
        float tru;
        tru=a- b;
        System.out.println("Trừ 2 số a-b = "+ tru);
    }
    public void PRODUCT() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sn.nextFloat();
        System.out.println("Nhập vào số b:");
        b = sn.nextFloat();
        float nhan;
        nhan=a* b;
        System.out.println("Nhân 2 số a*b = "+ nhan);
    }
    public void MOD() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        a = sn.nextFloat();
        System.out.println("Nhập vào số b:");
        b = sn.nextFloat();
        float chia;
        chia=a/b;
        System.out.println("Chia 2 số a/b = "+ chia);
    }
}

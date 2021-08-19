package OnTap;

import java.util.Scanner;

public class Bai7 {
    //Nhập điểm thi và hệ số 3 môn toán lý hoa cua một học sinh. Tính điểm trung bình của học sinh đó

    float toan,ly, hoa;
    int heso1, heso2;
    public void Tinhtrungbinh(){
        Scanner sn= new Scanner(System.in);
        System.out.println("Điểm môn toán là:");
        toan= sn.nextFloat();
        System.out.println("Điểm môn hóa là:");
        hoa=sn.nextFloat();
        System.out.println("Điểm môn lý là:");
        ly=sn.nextFloat();
        System.out.println("Hệ số của toan+ hoa môn là :");
        heso1=sn.nextInt();
        System.out.println("Hệ số của môn lý là:");
        heso2=sn.nextInt();
        float trungbinh;
        trungbinh=((toan+hoa)*heso1+(ly*heso2))/(heso1+heso1+heso2);
        System.out.println("Điểm trung bình của học sinh đó là:"+trungbinh);

    }
}

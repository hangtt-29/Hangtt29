package OnTap;

import java.util.Scanner;

public class Bai8 {
    //Nhập vào bán kình của đường tròn. Tính chu vi và diện tích của hình tròn
    //công thức: Chu vi hình tròn= bán kính *2*3.14
    //Diện tích hình tròn= S= r*r*3.14

    int bankinh;
    public void hinhTron(){
        Scanner sn= new Scanner(System.in);
        System.out.println("Bán kinh của đường tròn là:");
        bankinh= sn.nextInt();
        float S,C;
        S= (bankinh*bankinh*3.14f);
        System.out.println("Diện tích của hình tròn là:"+S);
        C= (bankinh*2*3.14f);
        System.out.println("Chu vi của hình tròn là:"+C);

    }
}

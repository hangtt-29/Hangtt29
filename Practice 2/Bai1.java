package VariableType;

import java.util.Scanner;

public class Bai1 {
    //Nhập một số bất kỳ. Hãy đọc giá trị của số
    //nguyên đó nếu nó có giá trị từ 1 đến 9, ngược
    //lại thông báo không đọc được.
    public void FindNumber() {
        while (true) {
            int i;
            Scanner sn = new Scanner(System.in);
            System.out.println("Nhập vào số bất kỳ:");
            i = sn.nextInt();
            if (i >= 1 && i <= 9) {
                System.out.println("Số được in ra là: " + i);
           } else if (i > 9) {
                System.out.println("Không đọc được");
            } else {
                System.out.println("Cũng không đọc được đâu !!!!!");
            }
        }
    }
}

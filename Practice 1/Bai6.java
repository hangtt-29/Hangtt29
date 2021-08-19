package OnTap;

import java.util.Scanner;

public class Bai6 {
    String name;
    int amount;
    Long price;

   public void TinhTien(){
       Scanner sn= new Scanner(System.in);
       System.out.println("Nhập vào tên sản phẩm:");
       name=sn.nextLine();
       System.out.println("Nhập vào số lượng sản phẩm: ");
       amount=sn.nextInt();
       System.out.println("Nhập vào giá của sản phẩm:");
       price=sn.nextLong();
       Long tien;
       tien=amount*price;
       System.out.println("Giá tiền của sản phẩm: "+tien);

       float thue;
       thue=tien*10/100;
       System.out.println("Thuế giá trị gia tăng của sản sản phẩm:"+thue);

   }

}

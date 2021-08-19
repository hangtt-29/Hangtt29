package OnTap;

import java.util.Calendar;
import java.util.Scanner;

public class Bai4 {
    // Bài 4 Nhập vào năm sinh của một người, tính tuổi của người đó.
    public void TinhTuoi() {
        int year, age;
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào năm sinh của một người:");
        year = sn.nextInt();
        //Tính tuổi của 1 người
        age = Calendar.getInstance().get(Calendar.YEAR) - year;
        System.out.println("Tuổi hiện tại:" + age);
        if (age < 16) {
            System.out.println("Tuổi vị thành niên");
        } else if (age >= 16 && age < 25) {
            System.out.println("Tuổi trưởng thành");
        } else {
            System.out.println("Già quá rồi");
        }

    }
}

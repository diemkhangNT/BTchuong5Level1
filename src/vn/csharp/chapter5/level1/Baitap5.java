package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        // Viết chương trình cho nhập nhiều, mỗi lần 1 số nguyên.
        // In ra tổng các số vừa nhập. Quá trình nhập kết thúc khi nhập vào số 0
        Scanner input = new Scanner(System.in);
        int n = 1;
        int tong =0;
        System.out.println("Nhap cac so nguyen (ket thuc khi nhap vao so 0)  ");
        while (n != 0){
            n = input.nextInt();
            tong+=n;
        }
        System.out.println("Tong cac so = "+tong);
    }
}

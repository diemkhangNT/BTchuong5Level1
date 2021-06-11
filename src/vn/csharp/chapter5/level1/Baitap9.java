package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        // In ra bảng cửu chương từ 2 đến 9
        int kq=1;
        for(int i=2;i<=9;i++){
            System.out.println("Bang cuu chuong "+i);
            for (int j=1;j<=10;j++){
                kq=i*j;
                System.out.println(i+" * "+j+" = " + kq);
            }
            System.out.println();
        }
    }
}

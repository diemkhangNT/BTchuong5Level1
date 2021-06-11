package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        // Cho nhập số nguyên dương n (n>0). In ra bảng cửu chương của n
        Scanner input = new Scanner(System.in);
        System.out.print("Bang cuu chuong: ");
        int n = input.nextInt();
        int kq=1;
        for(int i=1;i<=10;i++){
            kq = i*n;
            System.out.println(n+" * "+i+" = " + kq);
        }
    }
}

package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n (>0). Liệt kê các số lẻ nhỏ hơn n (tính từ 1)
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n>0: ");
        int n = input.nextInt();
        System.out.print("Cac so le < n: ");
        for(int i=1;i<n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

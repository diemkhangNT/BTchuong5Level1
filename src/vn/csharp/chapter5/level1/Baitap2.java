package vn.csharp.chapter5.level1;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n (>0). Liệt kê các số chẵn nhỏ hơn n (tính từ 2)
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n > 0: ");
        int n = input.nextInt();
        System.out.print("Cac so chan < n: ");
        for(int i=2;i<n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

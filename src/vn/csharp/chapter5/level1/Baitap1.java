package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        // Cho nhập chuỗi ký tự s và số lần in n. In ra màn hình n lần chuỗi s
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao chuoi s: ");
        String s = input.nextLine();
        System.out.print("Nhap vao so lan in: ");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(s);
        }
    }
}

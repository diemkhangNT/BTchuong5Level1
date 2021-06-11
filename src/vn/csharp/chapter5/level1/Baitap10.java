package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 2 số nguyên dương n và m
        // sao cho số nhập sau m luôn lớn hơn số nhập trước n.
        // Nếu sai thì yêu cầu người dùng nhập lại.
        Scanner input = new Scanner(System.in);
        int n = 0;
        int m=1;
        while(n<m){
            System.out.print("Nhap vao so nguyen duong n: ");
            n = input.nextInt();
            System.out.print("Nhap vao so nguyen duong m: ");
            m = input.nextInt();
            if(n>m){
                System.out.println("Moi nhap lai! ");
                n=0;m=1;
                continue;
            }else break;
        }
    }
}

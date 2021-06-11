package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap11 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào 2 số nguyên dương a, b
        // sao cho số lớn nhất trong 2 số phải chia hết cho 7.
        // Nếu sai thì yêu cầu người dùng nhập lại cho đến khi đúng.
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;

        while(a<b){
            System.out.print("Nhap vao so nguyen duong a: ");
            a = input.nextInt();
            System.out.print("Nhap vao so nguyen duong b: ");
            b = input.nextInt();
            int max = b;
            if(a>max){
                max = a;
                a = b;
            }
            System.out.println("So lon nhat la: "+max);
            if(max%7==0){
                System.out.println("Thoa dieu kien! Ket thuc chuong trinh.");
                break;
            }else {
                System.out.println("Rat tiec! Moi nhap lai! ");
                a=0;b=1;
                continue;
            }
        }
    }
}

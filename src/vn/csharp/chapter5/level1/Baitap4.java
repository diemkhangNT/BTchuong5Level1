package vn.csharp.chapter5.level1;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        // Nhập số nguyên dương n (>0). Liệt kê các số nguyên nhỏ hơn n (tính từ 1)
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n>0: ");
        int n= input.nextInt();
        System.out.print("Cac so nguyen nho hon n: ");
        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
    }
}

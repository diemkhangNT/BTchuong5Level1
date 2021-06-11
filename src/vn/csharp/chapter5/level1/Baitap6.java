package vn.csharp.chapter5.level1;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào số nguyên dương n.
        // Liệt kê các số nguyên dương nhỏ hơn hay bằng n thoả ít nhất 1 trong 2 điều kiện
        //- Cùng chia hết cho 3 và 5
        //- Chia cho 3 thì dư 2 và chia cho 5 thì dư 3
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = input.nextInt();
        System.out.print("Cac so thoa dieu kien: ");
        for(int i=0; i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.print(i+" ");
            }else if(i%3==2 && i%5==3){
                System.out.print(i+" ");
            }
        }
    }
}

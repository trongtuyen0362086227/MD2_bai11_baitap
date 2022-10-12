package bai5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra Palindrome vao");
        String str = sc.nextLine();
        String[] arrstr = str.split("");
        boolean check = true;
        for (int i = 0; i <= arrstr.length/2; i++) {
            if (arrstr[i].equals(arrstr[arrstr.length-1-i])){
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("day la chuoi palindrome");
        } else {
            System.out.println("day khong phai la chuoi palindrome");
        }
    }
}

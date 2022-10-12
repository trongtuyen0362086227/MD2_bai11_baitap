package bai6;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> bStack = new Stack<>();
        Stack<String> aStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bieu thuc vao");
        String bieuthuc = sc.nextLine();
        String[] arrbieuthuc = bieuthuc.split("");
        for (int i = 0; i < arrbieuthuc.length; i++) {
            if (arrbieuthuc[i]=="("){
                bStack.push(arrbieuthuc[i]);
            } else if (arrbieuthuc[i]==")"){
                aStack.push(arrbieuthuc[i]);
            }
        }
        if (aStack.size()==bStack.size()){
            System.out.println("bieu thuc su dung dau ngoac dung");
        } else {
            System.out.println("bieu thuc sd dau ngoac sai");
        }
    }
}

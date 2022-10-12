package bai4;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thap phan can chuyen sang nhi phan vao");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> mystack = new Stack<>();
        while (number / 2 != 0) {
            int sodu = number % 2;
            mystack.push(sodu);
           number = number / 2;
        }

        mystack.push(1);
        System.out.println("Chuyen sang he nhi phan");
        while (mystack.size() != 0) {
            System.out.printf("%d\t",mystack.pop());
        }

    }
}


package bai1;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> mystack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap day so nguyuen");
        String a = sc.nextLine();
        String[] arr = a.split("");
        for (int i = 0; i < arr.length; i++) {
            mystack.push(arr[i]);
        }
       while (mystack.size()!=0){
           System.out.println(mystack.pop());
       }
    }
}

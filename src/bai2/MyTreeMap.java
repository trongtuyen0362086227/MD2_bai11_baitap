package bai2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap van ban vao");
        String str = sc.nextLine();
        String[] arrstr = str.toLowerCase().split(" ");
        TreeMap<String,Integer> mytreemap = new TreeMap<>();
        for (int i = 0; i < arrstr.length; i++) {
            if (mytreemap.containsKey(arrstr[i])){
                mytreemap.put(arrstr[i],mytreemap.get(arrstr[i])+1);
            } else {
                mytreemap.put(arrstr[i],1);
            }
        }
        for (String key:mytreemap.keySet()) {
            System.out.printf("%s xuat hien %d lan\n",key,mytreemap.get(key));
        }
    }
}

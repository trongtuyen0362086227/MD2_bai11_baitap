package bai7;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class StudentManage {
    static Student[] arrStudent = new Student[1000];
    static int index = 0;
    static Queue<Student> myqueue1 = new PriorityQueue<Student>() {
    };
    static Queue<Student> myqueue2 = new PriorityQueue<Student>() {
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap thong tin cho sinh vien %d\n", (i + 1));
            arrStudent[index] = new Student();
            arrStudent[index].inputData(sc);
            index++;
        }
        for (int i = 0; i < index; i++) {
            if (arrStudent[i].isSex()){
                myqueue1.offer(arrStudent[i]);
            } else {
                myqueue2.offer(arrStudent[i]);
            }
        }
        for (Student st:myqueue1) {
           System.out.printf("%s\n",st);
        }
        for (Student st:myqueue2) {
            System.out.printf("%s\n",st);
        }
    }
}

package bai7;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.Scanner;

public class Student implements Comparable<Student>{
    private String studentName;
    private boolean sex;
    private String birthDate;

    public Student() {
    }

    public Student(String studentName, boolean sex, Date birthDate) {
        this.studentName = studentName;
        this.sex = sex;
//        this.birthDate = birthDate;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void inputData(Scanner sc){
        System.out.println("nhap ten sinh vien");
        this.studentName = sc.nextLine();
        System.out.println("nhap gioi tinh sinh vien");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("nhap ngay thang nam sinh cua sinh vien");
        String date = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("ten sinh vien: %s - gioi tinh: %b - ngay sinh: %s",this.studentName,this.sex,this.birthDate);
    }

    @Override
    public int compareTo(Student o) {
        return getBirthDate().compareTo(o.getBirthDate());
    }
}

package day01;

public class School {

    public static void main(String[] args) {

        Students students = new Students();

        students.addHeight(20);
        students.addHeight(30);
        students.addHeight(40);
        students.addHeight(50);
        students.addHeight(10);
        students.addHeight(20);

        System.out.println(students.height);
        System.out.println(students.isHeightIncreasing());
    }
}
package lt.itacademy.java.basics;

import java.util.*;
import java.lang.Math;

public class Basics {

    public static void main(String[] args) {
        System.out.println("+++++++++++++++++Task 1+++++++++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, surname and age");
        String elementsLine = scanner.nextLine();
        String[] elements = elementsLine.split(" ");
        System.out.println("Hello I am " + elements[0]+ " " + elements[1] + " " + elements[2] +  ". I am attending IT Academy 2021!");
        System.out.println("+++++++++++++++++Task 2+++++++++++++++");
        int x  = 10;
        String city = "Vilnius";
        float value = 1.5f;
        char letter = 'a';
        boolean isTrue = false;
        System.out.println("int: " + x + " float: " + value + " String: " + city + " char: " + letter + " boolean:" + isTrue );
        System.out.println("+++++++++++++++++Task 3+++++++++++++++");
        calculate(10,20);

    }
    static void calculate(int x, int y){
        System.out.println("Sum: " + (x + y) );
        System.out.println("Difference: " + (x - y) );
        System.out.println("Product: " + (x * y) );
        System.out.println("Multiple: " + (x * y) );
        System.out.println("Distance: " + Math.abs(x - y) );
        System.out.println("Max: " + Math.max(x, y) );
        System.out.println("min: " + Math.min(x, y) );
    }
}
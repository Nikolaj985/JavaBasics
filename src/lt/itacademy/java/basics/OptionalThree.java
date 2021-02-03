package lt.itacademy.java.basics;
import java.util.Scanner;

public class OptionalThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values: ");
        String values = scanner.nextLine();
        String[] entryData = values.split(" ");
        System.out.println(Integer.parseInt(entryData[0])+Integer.parseInt(entryData[1]));
    }
}

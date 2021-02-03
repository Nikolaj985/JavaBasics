package lt.itacademy.java.basics;

import java.util.Scanner;

public class OptionalTwo {
    public static void main(String[] args) {
        System.out.println("+++++++++OptionalTwo+++++++++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle side values: ");
        String values = scanner.nextLine();
        String[] elements = values.split(" ");
        System.out.println(calcOccurrences(Long.parseLong(elements[0]), elements[1]));
    }
    static long calcOccurrences(long length, String string){
        long remainder = length%string.length();
        long fullStringOccurred =length/string.length();
        long occurrences = charOccurs(string, string.length())*fullStringOccurred+charOccurs(string, remainder);
        return occurrences;
    }
    static long charOccurs(String string, long length){
        long counter = 0 ;
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
}

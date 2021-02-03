package lt.itacademy.java.basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        String password = scanner.nextLine();
        String answer = checkPassword(password);
        System.out.println(answer);

    }

    static String checkPassword(String password) {

        if (password.length() < 10) {
            return "Password is to short, minimum 10 characters!";
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        boolean b = m.find();
        if (b) {
            return "Password must contain only numbers and digits";
        }
        int numberCount = 0;
        for(int i= 0; i<password.length();i++){
            if( stringContainsNumber(Character.toString(password.charAt(i)))){
            numberCount++;
            }
        }
        if(numberCount<2){
            return "Password must contain at least 2 digits!";
        }

        return "Password valid: " + password;
    }
    public static boolean stringContainsNumber( String s )
    {
        Pattern p = Pattern.compile( "[0-9]" );
        Matcher m = p.matcher( s );

        return m.find();
    }
}
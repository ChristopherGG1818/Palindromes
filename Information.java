import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.Stack;

public class Information {
    public void getinfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter users first and last Name: ");
        String input2 = scan.next();
        String a = checkinfo(input2);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter the user's birthday: ");
        String input3 = scan2.next();
        String b = checkinfo(input3);

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Please enter account password: ");
        String input4 = scan3.next();
        String c = checkPalindrome(input4);
        System.out.print(c);

        Scanner scan4 = new Scanner(System.in);
        System.out.println("\nEnter the 4 digit account pin: ");
        String input5 = scan4.next();
        String d = checkinfo(input5);

        System.out.println(input2 + "'s Account details:");
        System.out.println("Birthday: " + input3);
        System.out.println("Password: " + input4);
        System.out.println("Pin: " + input5);

        //System.out.println("Your password " + input4 + " is a palindrome");
        //System.out.println(input4 + checkPalindrome(input4));
        System.out.println("Your password " + input4 +" " + checkPalindrome(input4));
    }
    public static String checkPalindrome(String isP) {
        isP = isP.toLowerCase();
        Stack<Character> word = new Stack<>();
        for (int i = 0; i < isP.length(); i++) {
            word.push(isP.charAt(i));

        }
        for (int i = 0; i < isP.length(); i++) {
            if (word.pop() != isP.charAt(i)) {
                return "Is not a palindrome ";

            }
             //String(getstop());
            //tried to make system stop when inputted wrong palindrome

        }
        return "Is a palindrome ";
    }
    public static String checkinfo(String isw) {
        return isw;
    }
    public static String getstop(){
        //System in which palindrome would stop if it doesnt work
        //System.exit();
        return null;
    }
}


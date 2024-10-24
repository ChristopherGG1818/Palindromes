//This is where the plane information is located and how the information is stored.
//the loop sadly doesnt work.
import java.util.Scanner;
public class PlaneInfo {
    public String getinfo() {
        //while(scan!=5){
        Scanner scan = new Scanner(System.in);
        System.out.println("1: View available flights ");
        System.out.println("2: Book a ticket ");
        System.out.println("3: View your ticket ");
        System.out.println("4: Change your password ");
        System.out.println("5: Quit ");
        int answer = scan.nextInt();
        if (answer == 1) {
            String a = locations();
        }
        if (answer == 2) {
            String b= booking();
        }
        if (answer == 3) {
            String c= ticket();
        }
        if (answer == 4) {
            String d= change();
        }
        if (answer == 5) {
            System.out.println("quit bro");
            //return ending;
            String b= ending();
        }
        return getinfo();
    }
    public String locations(){
        System.out.println("Flight locations:");
        System.out.println("Texas to California, Delta 11:00am:");
        System.out.println("Texas to Paris, United 2:00pm:");
        System.out.println("Texas to Italy, Delta 9:00am:");
        return getinfo();
    }
    public String booking(){
        Scanner scanb = new Scanner(System.in);
        System.out.println("which # flight to book");
        System.out.println("1: Texas to California, Delta 11:00am:");
        System.out.println("2: Texas to Paris, United 2:00pm:");
        System.out.println("3: Texas to Italy, Delta 9:00am:");
        int answer = scanb.nextInt();
        if (answer == 1) {
            System.out.println("1: Texas to California, Delta 11:00am:");
            int answer1 = scanb.nextInt();
        }
        if (answer == 2) {
            System.out.println("2: Texas to Paris, United 2:00pm:");
            int answer2 = scanb.nextInt();
        }
        if (answer == 3) {
            System.out.println("3: Texas to Italy, Delta 9:00am:");
            int answer3 = scanb.nextInt();
        }
        return getinfo();
    }
    public String ticket() {
        System.out.println(booking());
        return getinfo();
    }
    public String change() {

        return getinfo();
    }
    public String ending() {
        return null;
    }
//}
}


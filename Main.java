/* Name: Christopher Garcia
# Date: 10/23/2023
# Class: CSC 1120
# Pledge: I have neither given nor received unauthorized aid on this
program.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Belmont's Airline Corporation");
        System.out.println("-----------------------------");

        Information toti= new Information();
        toti.getinfo();

        System.out.println("-----------------------------");
        System.out.println("Flight Schedule for today, 2023-10-23");
        PlaneInfo PI = new PlaneInfo();
        PI.getinfo();
    }
    public static String checkinfo(String isw){
        return isw;
    }
}
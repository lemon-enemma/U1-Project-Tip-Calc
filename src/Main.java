//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter your total bill in dollars and cents: $");
        double totalBill = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the percentage of the bill you want to tip: ");
        int tipPercentint = scan.nextInt();
        System.out.print("Enter the number of people in your party: ");
        int partyPeople = scan.nextInt();
        //input part ends. calc total tip below
        double tipUnrounded = (tipPercentint) * totalBill;
        int tipIncentsInt = (int) ((tipUnrounded % 100) + 0.5);
        int tipIndollarsInt = (int) (tipUnrounded - tipUnrounded % 100)/100;
        String tipIncentsString;
            if (tipIncentsInt < 10) {
                tipIncentsString = "0" + tipIncentsInt;
            System.out.println("The total tip is $" + tipIndollarsInt + "." + tipIncentsString + ".");}
            else {
            System.out.println("The total tip is $" + tipIndollarsInt + "." + tipIncentsInt + ".");}
        //calc total bill including tip
        double totalPlustipUnrounded = (totalBill + tipUnrounded/100) * 100;
        int totalPlustipCentsint = (int) ((totalPlustipUnrounded % 100) + 0.5);
        int totalPlustipDollarsint = (int) (totalPlustipUnrounded - totalPlustipUnrounded % 100)/100;
        String totalPlustipCentsstring;
            if (totalPlustipCentsint < 10) {
                totalPlustipCentsstring = "0" + totalPlustipCentsint;
                System.out.println("The total bill, plus the tip, is $" + totalPlustipDollarsint + "." + totalPlustipCentsstring + ".");
            }
            else {
                System.out.println("The total bill, plus the tip, is $" + totalPlustipDollarsint + "." + totalPlustipCentsint + ".");
            }
        //calc tip per person
        double tipPerpersonUnrounded = (tipUnrounded/100/partyPeople) * 100;
        int tipPerpersonCentsint = (int) ((tipPerpersonUnrounded % 100) + 0.5);
        int tipPerpersonDollarsint = (int) (tipPerpersonUnrounded - tipPerpersonUnrounded % 100)/100;
        String tipPerpersonCentsstring;
            if (tipPerpersonCentsint < 10) {
                tipPerpersonCentsstring = "0" + tipPerpersonCentsint;
                System.out.println("The tip per person is $" + tipPerpersonDollarsint + "." + tipPerpersonCentsstring + ".");
            }
            else {
                System.out.println("The tip per person is $" + tipPerpersonDollarsint + "." + tipPerpersonCentsint + ".");
            }
        //calc total per person
        double totalPerpersonUnrounded = (tipPerpersonUnrounded/100 + totalBill/partyPeople) * 100;
        int totalPerpersonCentsint = (int) ((totalPerpersonUnrounded % 100) + 0.5);
        int totalPerpersonDollarsint = (int) (totalPerpersonUnrounded - totalPerpersonUnrounded % 100)/100;
        String totalPerpersonCentsstring;
        if (totalPerpersonCentsint < 10) {
            totalPerpersonCentsstring = "0" + totalPerpersonCentsint;
            System.out.println("The total bill plus tip per person is $" + totalPerpersonDollarsint + "." + totalPerpersonCentsstring + ".");
        }
        else {
            System.out.println("The total bill plus tip per person is $" + totalPerpersonDollarsint + "." + totalPerpersonCentsint + ".");
        }
    }
}
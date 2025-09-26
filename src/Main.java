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
        double tipPercentdoub = (double) tipPercentint/100;
        System.out.print("Enter the number of people in your party: ");
        int partyPeople = scan.nextInt();
        //input part ends. calc total tip below
        double tipUnrounded = (tipPercentdoub) * totalBill;
        double tipIndollars = tipUnrounded % 100;
        double tipIncents = (tipUnrounded - tipUnrounded % 100) * 100;
        int tipIncentsRound = (int) (tipIncents + 0.5);
        double tipCents = tipIncentsRound/100;
        System.out.println("The total tip is $" + tipIndollars + "." + tipCents);
        //calc total bill including tip
        double totalPlustip = totalBill + tipIndollars;
        System.out.println("The total bill plus tip is $" + totalPlustip);
        //calc tip per person
        tipIndollars = 42.70;
        double individTipunrounded = tipIndollars / partyPeople * 100;
        double tipPerperson = ((double) ((int) individTipunrounded+5))/100;
        System.out.println(tipPerperson);
    }
}
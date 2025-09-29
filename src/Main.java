import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // User inputs bill, percentage of tip, and number of people in party here.
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter your total bill in dollars and cents: $");
        double totalBill = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the percentage of the bill you want to tip: ");
        int tipPercentint = scan.nextInt();
        System.out.print("Enter the number of people in your party: ");
        int partyPeople = scan.nextInt();
        // Input part ends. Calculate the total tip.
        double tipUnrounded = (tipPercentint) * totalBill;
        int tipIncentsInt = (int) ((tipUnrounded % 100) + 0.5); // Making each value an integer makes it easier to format the output properly.
        int tipIndollarsInt = (int) (tipUnrounded - tipUnrounded % 100)/100;
        String tipIncentsString;
            if (tipIncentsInt < 10) { // Need to put a zero before the cents integer if there's less than 10 cents. Ex. $0.03 instead of $0.3.
                tipIncentsString = "0" + tipIncentsInt; // If the value in cents is less than 10, this line creates a String variable that puts a 0 in front of the cents integer.
            System.out.println("The total tip is $" + tipIndollarsInt + "." + tipIncentsString + ".");}
            else {
            System.out.println("The total tip is $" + tipIndollarsInt + "." + tipIncentsInt + ".");}
        // Calculate the total bill including the tip.
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
        // Calculate the tip each person pays.
        double tipPerpersonUnrounded = (tipUnrounded/100/partyPeople) * 100;
        int tipPerpersonCentsint = (int) ((tipPerpersonUnrounded % 100) + 0.5);
        int tipPerpersonDollarsint = (int) (tipPerpersonUnrounded - tipPerpersonUnrounded % 100)/100;
        String tipPerpersonCentsstring;
            if (tipPerpersonCentsint < 10) {
                tipPerpersonCentsstring = "0" + tipPerpersonCentsint;
                System.out.println("The tip each person pays is $" + tipPerpersonDollarsint + "." + tipPerpersonCentsstring + ".");
            }
            else {
                System.out.println("The tip each person pays is $" + tipPerpersonDollarsint + "." + tipPerpersonCentsint + ".");
            }
        // Calculate the total each person pays.
        double totalPerpersonUnrounded = (tipPerpersonUnrounded/100 + totalBill/partyPeople) * 100;
        int totalPerpersonCentsint = (int) ((totalPerpersonUnrounded % 100) + 0.5);
        int totalPerpersonDollarsint = (int) (totalPerpersonUnrounded - totalPerpersonUnrounded % 100)/100;
        String totalPerpersonCentsstring;
            if (totalPerpersonCentsint < 10) {
                totalPerpersonCentsstring = "0" + totalPerpersonCentsint;
                System.out.println("The total bill, plus tip, per person is $" + totalPerpersonDollarsint + "." + totalPerpersonCentsstring + ".");
            }
            else {
                System.out.println("The total bill, plus tip, per person is $" + totalPerpersonDollarsint + "." + totalPerpersonCentsint + ".");
            }
    }
}
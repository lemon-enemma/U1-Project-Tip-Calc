import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // User inputs bill, percentage of tip, and number of people in party here.
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter your total bill in dollars and cents: $");
        double totalBill = scan.nextDouble(); // Total bill stored in double totalBill.
        scan.nextLine();
        System.out.print("Enter the percentage of the bill you want to tip: ");
        int tipPercent = scan.nextInt(); // The percentage of the bill the user wants to tip is stored in integer tipPercent.
        System.out.print("Enter the number of people in your party: ");
        int partyPeople = scan.nextInt(); // The number of people in the party is stored in integer partyPeople.
        // Input part ends. Calculate the total tip.
        double tipUnrounded = (tipPercent) * totalBill; // tipUnrounded stores the tip in cents. Ex. if the tip is $4.99, tipUnrounded will store 499.
        int tipInCentsInt = (int) ((tipUnrounded % 100) + 0.5); // tipInCentsInt is set to the number of cents in the tip, equal to tipUnrounded % 100, rounded to the nearest whole number, and cast as an integer.
        int tipInDollarsInt = (int) (tipUnrounded - tipUnrounded % 100)/100; // This line subtracts the cents from the total tip so that we have the number of dollars in cents. It is then divided by 100 to store the number of dollars as dollars in tipInDollarsInt.
        String tipInCentsString;
            if (tipInCentsInt < 10) { // Need to put a zero before the cents integer if there's less than 10 cents. Ex. $0.03 instead of $0.3.
                tipInCentsString = "0" + tipInCentsInt; // If the value in cents is less than 10, this line creates a String variable with a 0 in front of the tipIncentsInt integer.
            System.out.println("The total tip is $" + tipInDollarsInt + "." + tipInCentsString + ".");}
            else {
            System.out.println("The total tip is $" + tipInDollarsInt + "." + tipInCentsInt + ".");}
        // Calculate the total bill including the tip.
        double totalPlusTipUnrounded = (totalBill + tipUnrounded/100) * 100;
        int totalPlusTipCentsInt = (int) ((totalPlusTipUnrounded % 100) + 0.5); // totalPlusTipCentsInt is set to the number of cents in the total bill plus tip, equal to totalPlusTipUnrounded % 100, rounded to the nearest whole number, and cast as an integer.
        int totalPlusTipDollarsInt = (int) (totalPlusTipUnrounded - totalPlusTipUnrounded % 100)/100; // This line subtracts the cents from the total bill plus tip so that we have the number of dollars in cents. It is then divided by 100 to store the number of dollars as dollars in totalPlusTipDollarsInt.
        String totalPlusTipCentsString;
            if (totalPlusTipCentsInt < 10) { // Need to put a zero before the cents integer if there's less than 10 cents. Ex. $0.03 instead of $0.3.
                totalPlusTipCentsString = "0" + totalPlusTipCentsInt;
                System.out.println("The total bill, plus the tip, is $" + totalPlusTipDollarsInt + "." + totalPlusTipCentsString + "."); // If the value in cents is less than 10, this line creates a String variable with a 0 in front of the totalPlusTipCentsInt integer.
            }
            else {
                System.out.println("The total bill, plus the tip, is $" + totalPlusTipDollarsInt + "." + totalPlusTipCentsInt + ".");
            }
        // Calculate the tip each person pays.
        double tipPerPersonUnrounded = (tipUnrounded/100/partyPeople) * 100;
        int tipPerPersonCentsInt = (int) ((tipPerPersonUnrounded % 100) + 0.5); // tipPerPersonCentsInt is set to the number of cents in the total tip per person, equal to tipPerPersonUnrounded % 100, rounded to the nearest whole number, and cast as an integer.
        int tipPerPersonDollarsInt = (int) (tipPerPersonUnrounded - tipPerPersonUnrounded % 100)/100; // This line subtracts the cents from the tip per person so that we have the number of dollars in cents. It is then divided by 100 to store the number of dollars as dollars in tipPerPersonDollarsInt.
        String tipPerPersonCentsString;
            if (tipPerPersonCentsInt < 10) { // Need to put a zero before the cents integer if there's less than 10 cents. Ex. $0.03 instead of $0.3.
                tipPerPersonCentsString = "0" + tipPerPersonCentsInt;
                System.out.println("The tip each person pays is $" + tipPerPersonDollarsInt + "." + tipPerPersonCentsString + "."); // If the value in cents is less than 10, this line creates a String variable with a 0 in front of the tipPerPersonCentsInt integer.
            }
            else {
                System.out.println("The tip each person pays is $" + tipPerPersonDollarsInt + "." + tipPerPersonCentsInt + ".");
            }
        // Calculate the total each person pays.
        double totalPerPersonUnrounded = (tipPerPersonUnrounded /100 + totalBill/partyPeople) * 100;
        int totalPerPersonCentsInt = (int) ((totalPerPersonUnrounded % 100) + 0.5); // totalPerPersonCentsInt is set to the number of cents in the total per person, equal to totalPerPersonUnrounded % 100, rounded to the nearest whole number, and cast as an integer.
        int totalPerPersonDollarsInt = (int) (totalPerPersonUnrounded - totalPerPersonUnrounded % 100)/100; // This line subtracts the cents from the total per person so that we have the number of dollars in cents. It is then divided by 100 to store the number of dollars as dollars in totalPerPersonDollarsInt.
        String totalPerPersonCentsString;
            if (totalPerPersonCentsInt < 10) { // Need to put a zero before the cents integer if there's less than 10 cents. Ex. $0.03 instead of $0.3.
                totalPerPersonCentsString = "0" + totalPerPersonCentsInt;
                System.out.println("The total bill, plus tip, per person is $" + totalPerPersonDollarsInt + "." + totalPerPersonCentsString + "."); // If the value in cents is less than 10, this line creates a String variable with a 0 in front of the totalPerPersonCentsInt integer.
            }
            else {
                System.out.println("The total bill, plus tip, per person is $" + totalPerPersonDollarsInt + "." + totalPerPersonCentsInt + ".");
            }
    }
}
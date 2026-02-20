
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        int principal = 0;
        int numberOfMonths = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

            System.out.print("Rate: ");
            float rate = scanner.nextFloat();
        

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfMonths = years * monthsInYear;
                break;            }
            System.out.println("Enter a value between 1 and 30");
        } 

        double simpleInterest = (principal * rate * numberOfMonths) / percent;
        
        String simpleInterestFormatted = NumberFormat.getCurrencyInstance().format(simpleInterest);
        System.out.println("SimpleInterest: " + simpleInterestFormatted);
    } 
}


 
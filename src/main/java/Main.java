import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double P = scanner.nextDouble();
        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();
        double r = rate / 100.0;
        System.out.println("Enter the number of years:");
        double t = scanner.nextDouble();
        double A = P*(1 + (r*t));
        double total = Math.round(A*100.0) / 100.0;
        System.out.println("After "+t+" years at "+rate+"%, the investment will be worth $"+
                (String.format("%.2f", total))+".");

    }
}

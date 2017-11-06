import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        Scanner ResultForSum = new Scanner(System.in);
        double sum;
        double A;
        double B;

        System.out.println("Podaj pierwsza liczbe: ");
        A = ResultForSum.nextDouble();

        System.out.println("Podaj druga liczbe:");
        B = ResultForSum.nextDouble();

        sum = A + B;
        System.out.println("A + B = " + sum);

        Scanner ResultForDifference = new Scanner(System.in);
        double difference;
        double C;
        double D;

        System.out.println("Podaj pierwsza liczbe: ");
        C = ResultForDifference.nextDouble();

        System.out.println("Podaj druga liczbe:");
        D = ResultForDifference.nextDouble();

        difference = C - D;
        System.out.println("C - D = " + difference);
    }
}
import java.util.Scanner;

public class SecondLab {
    public static void main(String[] args) {
//        SecondLab.countDegree();
//        SecondLab.countFactorial();
//        SecondLab.calculateTwoNumbers();
//        SecondLab.calculateFallTime();
        SecondLab.calculateCatet();
    }

    private static void countDegree() {
        Scanner input = SecondLab.getScanner();

        System.out.println("Please, enter your degree: ");

        int degree = (int) input.nextDouble();
        int result = 1;
//        System.out.println("Your result is " + (int) Math.pow(2, degree));

        for (int index = 0; index < degree; index++) {
            result *= 2;
        }

        System.out.println("Your result is " + result);
    }

    private static void countFactorial() {
        Scanner input = SecondLab.getScanner();

        System.out.println("Please, enter your number of factorial: ");

        int number = (int) input.nextDouble();

        while (number > 10 || number < 1) {
            System.out.println("Please, enter your number again,\nnumber should be more as 0 and less 11:");

            number = (int) input.nextDouble();
        }

        int result = 1;

        for (int index = 1; index < number + 1; index++) {
            result *= index;
        }

        System.out.println("Your result is " + result);
    }

    private static void calculateTwoNumbers() {
        Scanner input = SecondLab.getScanner();

        System.out.println("Please, enter two numbers:");

        int firstNumber = (int) input.nextDouble();
        int secondNumber = (int) input.nextDouble();

        System.out.println(
                "+ : " + (firstNumber + secondNumber) + "\n"
                + "- : " + (firstNumber - secondNumber) + "\n"
                + "* : " + (firstNumber * secondNumber)
        );
    }

    private static void calculateFallTime() {
        Scanner input = SecondLab.getScanner();

        System.out.println("Please, enter height:");

        double height = input.nextDouble();

        System.out.println("Time of fallen: " + (height / (9.8 / 2)));
    }

    private static void calculateCatet() {
        Scanner input = SecondLab.getScanner();

        double hypotenuse = 0;
        double leg = 0;

        while (hypotenuse <= 0 || leg <= 0) {
            System.out.println("Please, enter hypotenuse and leg:");

            hypotenuse = input.nextDouble();
            leg = input.nextDouble();
        }

        System.out.println("Result is " + Math.pow((hypotenuse * hypotenuse - leg * leg), 0.5));
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}

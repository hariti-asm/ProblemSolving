package hariti.asmaa.problesolving.presenatation;

import hariti.asmaa.problesolving.services.ProcessingService;

import java.util.Scanner;

public class ShowingResults {

    private final ProcessingService processingService;

    public ShowingResults() {
        this.processingService = new ProcessingService();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            while (true) {
                int reversedNumber = processingService.reverse(number);
                int sum = number + reversedNumber;

                System.out.println("Current number: " + number);
                System.out.println("Reversed number: " + reversedNumber);
                System.out.println("Sum: " + sum);

                if (processingService.isPalindrome(sum)) {
                    System.out.println("Palindrome reached: " + sum);
                    break;
                }

                number = sum;
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }


}

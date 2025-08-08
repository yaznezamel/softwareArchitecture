import java.util.Scanner;



// Why it violates SRP ?

// 1. input logic : reading values
// 2. business logic : sum up values
// 3. representation logic : prints out values


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        int sum = first + second;

        System.out.println("The sum is: " + sum);
    }
}

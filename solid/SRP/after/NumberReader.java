package solid.SRP.after;

import java.util.Scanner;

public class NumberReader {
    
    private Scanner scanner;

    public NumberReader(Scanner scanner){
        this.scanner = scanner;
    }


    public int[] readTwoNumbers(){
        int first  = readInput("Please enter the first number");
        int second = readInput("Please enter the second number");

        return new int[]{first,second};

    }


    private int readInput(String prompt){

        while(true){
            System.out.println(prompt);
            try{
                return Integer.parseInt(scanner.nextLine().trim());
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input ! , please enter an integer. ");
            }
        }
    }



}

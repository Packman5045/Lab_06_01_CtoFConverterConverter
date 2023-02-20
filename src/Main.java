import java.util.Scanner;
//this line allows us to use the newly imported scanner for user input
public class Main {
    public static void main(String[] args)
    {

    Scanner scan = new Scanner(System.in);
//this line is where we name our scanner

    System.out.println("What is the Temperature in Fahrenheit?");
//initial question to prompt the user for input

        if(scan.hasNextInt()) {
            int temperature = scan.nextInt();
            //this line allows the user to input the temp

            double issue = 0.55555556;
            //represents a decimal of 5 divided by 9
            double results = issue * (temperature - 32);
            //remainder of the formula

            System.out.println("The Temperature in Celsius is " + results);
            //this would provide the correct result of an integer input
        }

        else
        {
            System.out.println("Incorrect input.");
            //error message in case there was no integer input

        }
    }
}
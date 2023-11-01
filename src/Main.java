import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    //variables
        double tempC = 0;
        double tempF;
        String end;
        boolean done = false;
        boolean done1 = false;

        while (!done1) {
            done = false;
            do {
                //prompt
                System.out.println("Please enter a temperature in Celcius: ");
                //input
                if (scan.hasNextDouble()) {
                    tempC = scan.nextDouble();
                    scan.nextLine();
                    done = true;
                }
                else {
                    System.out.println("You have entered an invalid Temp. Try again");
                    scan.nextLine();
                }
            } while (!done);
            tempF = (tempC * 9/5) + 32;
            System.out.println(tempC + " in Fahrenheit is " + tempF);
            System.out.println("Please enter N to STOP, enter anything else to continue.");
            end = scan.nextLine();
            end = end.toUpperCase();
            if (end.equalsIgnoreCase("N")) {
                done1 = true;
            }
        }








    }
}
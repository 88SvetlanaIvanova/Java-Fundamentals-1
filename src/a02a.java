import java.util.Scanner;

public class a02a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceLuggageMore20 = Double.parseDouble(scanner.nextLine());
        double weightLuggage = Double.parseDouble(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfSuitcases = Integer.parseInt(scanner.nextLine());
        double cost =0;
       if(weightLuggage<10.00){
           cost = priceLuggageMore20 * 0.2;
       }else if(weightLuggage>=10 && weightLuggage<= 20){
           cost = priceLuggageMore20 * 0.5;
       }else cost = priceLuggageMore20;

       if(numberOfDays>30) cost*=1.1;
       else if(numberOfDays>= 7 && numberOfDays<= 30) cost*=1.15;
       else if( numberOfDays<7) cost *=1.4;
       double totalCost = cost* numberOfSuitcases;

        System.out.printf("The total price of bags is: %.2f lv.", totalCost);

    }
}

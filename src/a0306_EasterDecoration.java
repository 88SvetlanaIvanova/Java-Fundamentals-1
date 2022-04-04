import java.util.Scanner;

public class a0306_EasterDecoration {
    public static void main(String[] args) {

        double basketCost = 1.50;
        double wreathCost = 3.80;
        double bunnyCost = 7.0;

        double averageOfBills =0;
        double totalSum =0;

        Scanner scanner = new Scanner((System.in));
        int numberOfClients = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberOfClients ; i++) {
            double sumOfBills =0;
            int productCounter = 0;

            String input = scanner.nextLine();
            while(!input.equals("Finish")){
                productCounter++;
                switch (input){
                    case "basket":
                        sumOfBills+=basketCost;
                        break;
                    case "wreath":
                        sumOfBills+=wreathCost;
                        break;
                    case "chocolate bunny":
                        sumOfBills+=bunnyCost;
                        break;
                }
                input = scanner.nextLine();
            }
            if(productCounter % 2 ==0){
                sumOfBills*=0.80;
            }
            totalSum+=sumOfBills;
            System.out.printf("You purchased %d items for %.2f leva.%n", productCounter, sumOfBills);
        }
        averageOfBills = totalSum/numberOfClients;
        System.out.printf("Average bill per client is: %.2f leva.",averageOfBills);
    }
}

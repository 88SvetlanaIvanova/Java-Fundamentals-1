import java.util.Scanner;

public class a0804Tourist_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numProd =0;
        double totPrice =0;
        String input =scanner.nextLine();
        while (!input.equals("Stop")){
            double prodPrice = Double.parseDouble(scanner.nextLine());
            numProd++;
            if(numProd % 3 ==0){
                prodPrice*=0.5;
            }
            if(budget >= prodPrice) {
                budget -= prodPrice;
                totPrice += prodPrice;

            }else {
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", prodPrice-budget);break;
            }

            input =scanner.nextLine();
        }
        if(input.equals("Stop")){
          System.out.printf("You bought %d products for %.2f leva.", numProd, totPrice);

        }

    }
}

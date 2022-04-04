import java.util.Scanner;

public class a0503EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberOfBoosters = Integer.parseInt(scanner.nextLine());
        double cost =0;
        double totalPrice =0;
        switch (fruit){
            case"Watermelon":
                if(size.equals("small"))cost=56*2*numberOfBoosters;
                else if(size.equals("big"))cost=28.70*5* numberOfBoosters;
                break;
            case "Mango":
                if(size.equals("small"))cost=36.66*2 * numberOfBoosters;
                else if(size.equals("big"))cost=19.60*5 * numberOfBoosters;
                break;
            case "Pineapple":
                if(size.equals("small"))cost= 42.10*2 * numberOfBoosters;
                else if(size.equals("big"))cost= 24.80 *5 * numberOfBoosters;
                break;
            case "Raspberry":
                if(size.equals("small"))cost= 20 *2 * numberOfBoosters;
                else if(size.equals("big"))cost= 15.20 *5 * numberOfBoosters;
                break;
        }
        ;
        if (cost >=400 && cost <= 1000) cost*= 0.85;
        if(cost > 1000) cost *= 0.5;

        System.out.printf("%.2f lv.",cost);

    }
}

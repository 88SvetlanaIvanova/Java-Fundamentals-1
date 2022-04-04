import java.util.Scanner;

public class a01_MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String ticketType = scan.nextLine();
        int numberOfPeople = Integer.parseInt(scan.nextLine());
        double ticketCost =0;

        if(numberOfPeople>=1 && numberOfPeople<=4){
            budget*=0.25;
        }else if(numberOfPeople>=5 && numberOfPeople<=9){
            budget*=0.40;
        }else if(numberOfPeople>=10 && numberOfPeople<=24){
            budget*=0.50;
        }else if(numberOfPeople>=25 && numberOfPeople<=49){
            budget*=0.60;
        }else if(numberOfPeople>=50){
            budget*=0.75;
        }
        //•	VIP – 499.99 лева.//•	Normal – 249.99 лева.
        if(ticketType.equals("VIP")){
            ticketCost=499.99*numberOfPeople;
        }else {
            ticketCost=249.99*numberOfPeople;
        }
        if(budget>ticketCost){
            System.out.printf("Yes! You have %.2f leva left.", budget-ticketCost);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", ticketCost-budget);

        }

    }
}

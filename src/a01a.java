import java.util.Scanner;

public class a01a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numberOfTicketsAdult = Integer.parseInt(scanner.nextLine());
        int numberOfTicketsKids = Integer.parseInt(scanner.nextLine());
        double priceNettAdult = Double.parseDouble(scanner.nextLine());
        double priceAdd = Double.parseDouble(scanner.nextLine());
        double priceNettTicketKid = priceNettAdult*0.3;
        double priceTicketAdult = priceNettAdult + priceAdd;
        double priceTicketKid = priceNettTicketKid + priceAdd;
        double totalPrice = priceTicketAdult* numberOfTicketsAdult + priceTicketKid * numberOfTicketsKids;
        double airProfit = totalPrice*0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, airProfit);
    }
}

import java.util.Scanner;

public class a0103Easter_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        String dateAsText = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        switch (destination){
            case"France":
                if(dateAsText.equals("21-23"))cost = 30 * numberOfNights;
                else if(dateAsText.equals("24-27"))cost = 35 * numberOfNights;
                else if(dateAsText.equals("28-31"))cost = 40 * numberOfNights;
                break;
            case "Italy":
                if(dateAsText.equals("21-23"))cost = 28 * numberOfNights;
                else if(dateAsText.equals("24-27"))cost = 32 * numberOfNights;
                else if(dateAsText.equals("28-31"))cost = 39 * numberOfNights;
                break;
            case "Germany":
                if(dateAsText.equals("21-23"))cost = 32 * numberOfNights;
                else if(dateAsText.equals("24-27"))cost = 37 * numberOfNights;
                else if(dateAsText.equals("28-31"))cost = 43 * numberOfNights;
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination,cost);

    }
}

import java.util.Scanner;

public class a01006CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int seatsTaken=0;
        int student=0;
       // double studentShare=student*1.0/seatsTaken*100;
        int standard =0;
       // double standardShare = standard*1.0/seatsTaken*100;
        int kid=0;
        //double kidShare = kid*1.0/seatsTaken*100;
       //
        while (!input.equals("Finish")){


            int capacity =  Integer.parseInt(scanner.nextLine());

            String ticketType = scanner.nextLine();

            double seatsForOneMovie =0;

            while (!ticketType.equals("End")){
                //•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
              //  seatsForOneMovie++;
                switch (ticketType){
                    case"student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                seatsForOneMovie++;
                seatsTaken++;
                if(seatsForOneMovie==capacity){
                    break;
                }

                //percentToCapacity=seatsForOneMovie*1.0/capacity*100;
                ticketType = scanner.nextLine();
            }

            //seatsTaken+=seatsForOneMovie;
            double percentToCapacity=seatsForOneMovie/capacity*100;
            System.out.printf("%s - %.2f%% full.%n",input,percentToCapacity);
            input = scanner.nextLine();
        }
        double studentShare =(student*1.0/seatsTaken)*100;
        System.out.printf("Total tickets: %d%n",seatsTaken);
        System.out.printf("%.2f%% student tickets.%n",studentShare);
        System.out.printf("%.2f%% standard tickets.%n",(standard*1.0/seatsTaken)*100);
        System.out.printf("%.2f%% kids tickets.%n",(kid*1.0/seatsTaken)*100);


    }
}

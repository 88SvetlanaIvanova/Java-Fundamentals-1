import java.util.Scanner;//NOT SOLVED YET

public class a07_School_Camp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int numberOfParticipants = Integer.parseInt(scanner.nextLine());
        int nightsStay = Integer.parseInt(scanner.nextLine());
        String sport ="";
        double calculatedCost=0;
        double totalCost=0;
        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        sport = "Judo";
                        calculatedCost = 9.60 * numberOfParticipants * nightsStay;
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        calculatedCost = 9.60 * numberOfParticipants * nightsStay;
                        break;
                    case "mixed":
                        sport = "Ski";
                        calculatedCost = 10.0 * numberOfParticipants * nightsStay;
                        break;

                }break;
            case "Spring":
                switch (groupType) {
                    case "boys":
                        sport = "Tennis";
                        calculatedCost = 7.20 * numberOfParticipants * nightsStay;
                        break;
                    case "girls":
                        sport = "Athletics";
                        calculatedCost = 7.20 * numberOfParticipants * nightsStay;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        calculatedCost = 9.50 * numberOfParticipants * nightsStay;
                        break;


                }break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        sport = "Football";
                        calculatedCost = 15 * numberOfParticipants * nightsStay;
                        break;
                    case "girls":
                        sport = "Volleyball";
                        calculatedCost = 15 * numberOfParticipants * nightsStay;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        calculatedCost = 20 * numberOfParticipants * nightsStay;
                        break;

                }break;
        }
        if(numberOfParticipants>=50){
            totalCost=calculatedCost*0.50;
        }else if(numberOfParticipants>=20&& numberOfParticipants<50){
            totalCost= calculatedCost*0.85;
        }else if(numberOfParticipants>=10 && numberOfParticipants<20){
            totalCost= calculatedCost*0.95;
        }else {
            totalCost=calculatedCost;
        }
        System.out.printf("%s %.2f lv.", sport, totalCost);

    }
}

import java.util.Scanner;

public class a01805TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int numberOfPointsInTheBeginning = Integer.parseInt(scanner.nextLine());
        int newPoints=0;
        int finalPoints =0;
        double wonTournaments=0;
        int averagePoints=0;
        for (int i = 0; i <numberOfTournaments ; i++) {
            String result = scanner.next();
            switch (result){
                case "W":
                    wonTournaments++;
                    newPoints+=2000;
                    break;
                case "F":
                   newPoints+=1200;
                    break;
                case "SF":
                    newPoints+=720;
                    break;
            }
        }
        averagePoints=newPoints/numberOfTournaments;
        wonTournaments=wonTournaments/numberOfTournaments*100;
        finalPoints=numberOfPointsInTheBeginning+newPoints;
        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", wonTournaments);
    }
}

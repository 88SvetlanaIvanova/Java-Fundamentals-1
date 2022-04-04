import java.util.Scanner;

public class a0506_Basketball_Tournament {
    public static void main(String[] args) {
        //int numberOfMatches=0;
       // int result=0;
        int winCount=0;
        int lostCount=0;
        int gamesCount=0;
        Scanner scanner = new Scanner((System.in));
        String input = scanner.nextLine();
        while(!input.equals("End of tournaments")){
            int numberOfMatches = Integer.parseInt(scanner.nextLine());
            gamesCount+=numberOfMatches;
            for (int i = 1; i <=numberOfMatches ; i++) {

                int pointsDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsOtherTeam = Integer.parseInt(scanner.nextLine());
                if(pointsDesiTeam>pointsOtherTeam){
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i,input,pointsDesiTeam-pointsOtherTeam);
                    winCount++;
                }
                else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, input,pointsOtherTeam-pointsDesiTeam);
                    lostCount++;
                }

            }
            input = scanner.nextLine();
            //if(input.equals("End of tournaments"))break;

        }
        double wonMatches=winCount*1.0/gamesCount*100;
        double lostMatches= lostCount*1.0/gamesCount*100;
        System.out.printf("%.2f%% matches win%n",wonMatches);
        System.out.printf("%.2f%% matches lost", lostMatches);

    }
}

import java.util.Scanner;

public class a01405FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTeam = scanner.nextLine();
        int points=0;
        int W=0;
        int D=0;
        int L=0;
        double winRate =0;
        int numberOfGames = Integer.parseInt(scanner.nextLine());
        if(numberOfGames>0){
            for (int i = 1; i <=numberOfGames ; i++) {
                String result = scanner.next();
                switch (result){
                    case "W":
                        W++;
                        points+=3;
                        break;
                    case "D":
                        D++;
                        points++;
                        break;
                    case "L":
                        L++;
                        break;
                }
            }
            winRate= W*1.0/numberOfGames*100.0;
            System.out.printf("%s has won %d points during this season.%n",nameOfTeam, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",W);
            System.out.printf("## D: %d%n",D);
            System.out.printf("## L: %d%n",L);
            System.out.printf("Win rate: %.2f%%",winRate);

        }else System.out.printf("%s hasn't played any games during this season.", nameOfTeam);




    }
}

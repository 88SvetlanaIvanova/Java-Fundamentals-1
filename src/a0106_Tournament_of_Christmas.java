import java.util.Scanner;

public class a0106_Tournament_of_Christmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int winCounter =0;
        int loseCounter =0;
        double totalRaisedMoney = 0;
        for (int i = 1; i <=numberOfDays ; i++) {
            int winPerDay =0;
            int losePerDay = 0;
            double daylyRaisedMoney =0;
            while(true){
                String sport = scan.nextLine();
                if(sport.equals("Finish"))
                    break;
                String result = scan.nextLine();
                if(result.equals("win")){
                    daylyRaisedMoney+=20;
                    winPerDay++;
                }
                else
                    losePerDay++;
            }
            if(winPerDay>losePerDay){
                daylyRaisedMoney*=1.10;
            }
            totalRaisedMoney+=daylyRaisedMoney;
            winCounter+=winPerDay;
            loseCounter+= losePerDay;


        }
        if(winCounter>loseCounter){
            totalRaisedMoney*=1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaisedMoney);
        }
        else
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaisedMoney);

    }
}

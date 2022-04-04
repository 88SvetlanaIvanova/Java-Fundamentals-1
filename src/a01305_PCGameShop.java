import java.util.Scanner;

public class a01305_PCGameShop {
    public static void main(String[] args) {
       int	Hearthstone =0;
       int	Fornite =0;
       int	Overwatch=0;
       int	Others =0;


        Scanner scanner = new Scanner(System.in);
        int numberGamesSold = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberGamesSold ; i++) {
            String gameName = scanner.nextLine();
            switch (gameName){
                case "Hearthstone":
                    Hearthstone++;
                    break;
                case"Fornite":
                    Fornite++;
                    break;
                case "Overwatch":
                    Overwatch++;
                    break;
                default:
                    Others++;
                    break;

            }
        }
        double	HearthstoneSold =Hearthstone*1.0/numberGamesSold*100.0;
        double	ForniteSold =Fornite*1.0/numberGamesSold*100;
        double	OverwatchSold=Overwatch*1.0/numberGamesSold*100;
        double	OthersSold =Others*1.0/numberGamesSold*100;
        System.out.printf("Hearthstone - %.2f%%\n", HearthstoneSold);
        System.out.printf("Fornite - %.2f%%\n", ForniteSold);
        System.out.printf("Overwatch - %.2f%%\n", OverwatchSold);
        System.out.printf("Others - %.2f%%\n", OthersSold);
    }
}

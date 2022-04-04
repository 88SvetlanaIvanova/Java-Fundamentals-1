import java.util.Scanner;

public class a04a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        int colorPoints =0;
        int red = 0; int orange = 0; int yellow = 0;int white =0; int black = 0; int others =0;
        for (int i = 0; i <numberOfBalls ; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor){
                case "red":
                    colorPoints+=5; red++;
                    break;
                case "orange":
                    colorPoints+= 10; orange++;
                    break;
                case "yellow":
                    colorPoints+= 15; yellow++;
                    break;
                case "white":
                    colorPoints+= 20; white++;
                    break;
                case "black":
                    colorPoints/=2; black++;
                    break;
                default:others++;
                break;
            }
        }
        System.out.printf("Total points: %d%nPoints from red balls: %d%nPoints from orange balls: %d%nPoints from yellow balls: %d%n", colorPoints,red, orange,yellow);
        System.out.printf("Points from white balls: %d%nOther colors picked: %d%nDivides from black balls: %d", white, others,black);

    }

}

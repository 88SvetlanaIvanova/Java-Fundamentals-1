import java.util.Scanner;

public class a0206_Easter_Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        String  winner = "";
        int maxPoints = 0;
      //  boolean hasStopped = false;

        for (int i = 1; i <= numberOfCakes ; i++) {
            int points =0;
            String bakersName = scanner.nextLine();
            String input = scanner.nextLine();


            while(!input.equals("Stop")){
                if(input.equals("Stop")){
                    break;
                }
                    int singleCakesRate = Integer.parseInt(input);
                    points+=singleCakesRate;
                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakersName,points);

            if(points>maxPoints) {
                maxPoints=points;
                winner=bakersName;

                System.out.printf("%s is the new number 1!%n", winner);
            }
           // if(bakersName.equals(winner)){




        }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);


    }
}

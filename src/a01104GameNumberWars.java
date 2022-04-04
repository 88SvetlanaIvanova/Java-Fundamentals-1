import java.util.Scanner;

public class a01104GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 =scanner.nextLine();
        String name2 =scanner.nextLine();
        String input =scanner.nextLine();
        String  winner ="";
        int gained1=0;
        int gained2 =0;
        int wonPoints  = 0;
        int equals = 0;
        while (!input.equals("End of game")){
            int numOfPoints1 = Integer.parseInt(input);
            int numOfPoints2 = Integer.parseInt(scanner.nextLine());
            if(numOfPoints1 == numOfPoints2){

                equals++;
                System.out.println("Number wars!");
                input =scanner.nextLine();
                continue;
            }
            if(numOfPoints1 > numOfPoints2&& equals==0) {
                gained1 += numOfPoints1 - numOfPoints2;
            }
            else if (numOfPoints1 < numOfPoints2&& equals==0){
                gained2 += numOfPoints2 - numOfPoints1;
            }
            if(equals==1){
                if(numOfPoints1>numOfPoints2){
                    winner=name1;
                    wonPoints=gained1;
                }
                else {
                    winner = name2;
                    wonPoints = gained2;
                }
                System.out.printf("%s is winner with %d points", winner, wonPoints);
                break;
            }
            input =scanner.nextLine();
        }
        if(input.equals("End of game")){
            System.out.printf("%s has %d points%n%s has %d points", name1,gained1,name2, gained2);
        }
    }
}

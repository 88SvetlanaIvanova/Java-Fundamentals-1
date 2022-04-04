import java.util.Scanner;

public class a05a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int maxGoals =0;
        String bestPlayer = "";
        while (!name.equals("END")){

            int numOfGoals = Integer.parseInt(scanner.nextLine());
            if(numOfGoals>maxGoals){
                maxGoals=numOfGoals;
                bestPlayer=name;
            }
            if (numOfGoals>=10)break;



            name = scanner.nextLine();

        }
        System.out.printf("%s is the best player!%n",bestPlayer);
        if ( maxGoals>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);

        }else System.out.printf("He has scored %d goals." , maxGoals);
    }
}

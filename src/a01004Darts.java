import java.util.Scanner;

public class a01004Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int playersStartingPoints =301;
        int strikePoints =0;
        int shots = 0;
        int badShots = 0;
        String field =scanner.nextLine();
        while (!field.equals("Retire")){
            int numOfPoints = Integer.parseInt(scanner.nextLine());

            switch (field){
                case"Single":
                    strikePoints=numOfPoints;
                    break;
                case"Double":
                    strikePoints=numOfPoints * 2;
                    break;
                case"Triple":
                    strikePoints=numOfPoints * 3;
                    break;

            }
            if(strikePoints>playersStartingPoints){
                badShots++;
                field =scanner.nextLine();
                continue;
            }
            playersStartingPoints -= strikePoints;
            shots++;

            if(playersStartingPoints==0)break;

            field =scanner.nextLine();
        }
        if(playersStartingPoints == 0){
            System.out.printf(	"%s won the leg with %d shots.", name, shots);
        }
        if(field.equals("Retire")) System.out.printf("%s retired after %d unsuccessful shots.",name, badShots );

    }
}

import java.util.Scanner;

public class a0304_Easter_Eggs_Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEggs1 = Integer.parseInt(scanner.nextLine());
        int numberOfEggs2 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while(!input.equals("End of battle")||numberOfEggs1==0||numberOfEggs2==0){
            if(input.equals("one"))numberOfEggs2--;
            else if(input.equals("two")) numberOfEggs1--;
            if(numberOfEggs1==0||numberOfEggs2==0)break;
            input = scanner.nextLine();

        }
        if(numberOfEggs1==0) System.out.printf("Player one is out of eggs. Player two has %d eggs left.",numberOfEggs2);
        else if(numberOfEggs2 == 0) System.out.printf("Player two is out of eggs. Player one has %d eggs left.", numberOfEggs1);
        else System.out.printf("Player one has %d eggs left.%nPlayer two has %d eggs left.", numberOfEggs1, numberOfEggs2);
    }
}

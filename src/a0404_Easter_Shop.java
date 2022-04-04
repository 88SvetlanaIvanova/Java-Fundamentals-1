import java.util.Scanner;

public class a0404_Easter_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEggs1 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int soldEggs=0;
        while (!input.equals("Close") || numberOfEggs1<=0){

            int eggs = Integer.parseInt(scanner.nextLine());
            if(numberOfEggs1 < eggs && !input.equals("Fill")){
                System.out.printf("Not enough eggs in store!%nYou can buy only %d.", numberOfEggs1);
                break;
            }
            if(input.equals("Buy")){
                numberOfEggs1 -= eggs;
                soldEggs += eggs;

            }
            else if(input.equals("Fill"))numberOfEggs1 += eggs;




            input = scanner.nextLine();
        }
        if(input.equals("Close")) System.out.printf("Store is closed!%n%d eggs sold.", soldEggs);



    }
}

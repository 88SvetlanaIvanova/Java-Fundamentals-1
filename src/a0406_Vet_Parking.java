import java.util.Scanner;

public class a0406_Vet_Parking {
    public static void main(String[] args) {

        double totalCost=0;
        Scanner scanner = new Scanner((System.in));
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfHours = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberOfDays ; i++) {
            double parkingCost=0;

            for (int j = 1; j <=numberOfHours ; j++) {
                if(i%2!=0 && j %2 ==0){
                    parkingCost+=1.25;
                }
                else if(i%2==0 && j %2 !=0){
                    parkingCost+=2.50;
                }
                else parkingCost+=1;
            }
            System.out.printf("Day: %d - %.2f leva%n", i,parkingCost);
            totalCost+=parkingCost;
        }

        System.out.printf("Total: %.2f leva", totalCost);


    }
}

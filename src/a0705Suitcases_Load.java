import java.util.Scanner;

public class a0705Suitcases_Load {
    public static void main(String[] args) {
        double suitcaseArea =0;
        int numberOfLoad =0;
        Scanner scanner = new Scanner(System.in);
        double capacity =  Double.parseDouble(scanner.nextLine());
        String input= scanner.nextLine();
         while (!input.equals("End")) {

             suitcaseArea = Double.parseDouble(input);
             numberOfLoad++;
             if (numberOfLoad % 3 ==0 && suitcaseArea <= capacity) {
                 suitcaseArea *= 1.10;
             }

             if (suitcaseArea > capacity) {
                //
                 numberOfLoad--;
                 break;
             }
             capacity -= suitcaseArea;
             input= scanner.nextLine();
         }


        if(input.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
        }else System.out.println("No more space!");

        System.out.printf("Statistic: %d suitcases loaded.", numberOfLoad);
    }
}

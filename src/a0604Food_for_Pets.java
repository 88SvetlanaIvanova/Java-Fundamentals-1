import java.util.Scanner;

public class a0604Food_for_Pets {
    public static void main(String[] args) {
        double totalEatenBiscuits =0;
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double catsShare =0;
        double dogsShare=0;
        double catp =0;
        double dogp=0;
        int dayCount =0;
        double eatenFromAllFood =0;

        double allFood = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i <days ; i++) {
            dayCount++;

            double dogAteFood = Double.parseDouble(scanner.nextLine());
            dogsShare+=dogAteFood;

            double catAteFood = Double.parseDouble(scanner.nextLine());
            catsShare+=catAteFood;

            if(dayCount % 3 ==0){
                totalEatenBiscuits+=dogAteFood*0.10+catAteFood* 0.10;
            }
        }
        eatenFromAllFood=catsShare + dogsShare ;
        catp = catsShare / eatenFromAllFood*100;
        dogp = dogsShare / eatenFromAllFood*100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n%.2f%% of the food has been eaten.%n%.2f%% eaten from the dog.%n%.2f%% eaten from the cat.",
                ((totalEatenBiscuits)), eatenFromAllFood/allFood*100,dogp,catp);


    }
}

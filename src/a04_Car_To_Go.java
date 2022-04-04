import java.util.Scanner;

public class a04_Car_To_Go {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String carClass = "";
        String carType ="";
        double carCost=0;

        if (budget<=100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carCost = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carCost = budget * 0.65;
                    break;

            }
        }else if(budget>100&& budget<=500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carCost = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carCost = budget * 0.80;
                    break;
            }
        }else if(budget>500) {
            carClass = "Luxury class";
            carType = "Jeep";
            carCost = budget * 0.90;


        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f",carType, carCost);

    }
}

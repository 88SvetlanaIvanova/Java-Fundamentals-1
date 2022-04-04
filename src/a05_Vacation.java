import java.util.Scanner;

public class a05_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double cost=0;
        String place="";
        String location="";
        if(budget<=1000){
            place="Camp";
            switch (season) {
                case "Summer":
                    location="Alaska";
                    cost=budget*0.65;
                    break;
                case "Winter":
                    location="Morocco";
                    cost=budget*0.45;
                    break;
            }
        }else if(budget>1000 && budget<=3000){
            place="Hut";
            switch (season) {
                case "Summer":
                    location="Alaska";
                    cost=budget*0.80;
                    break;
                case "Winter":
                    location="Morocco";
                    cost=budget*0.60;
                    break;
            }

        }else if(budget>3000){
            place= "Hotel";
            cost=budget*0.90;
            switch (season) {
                case "Summer":
                    location="Alaska";
                    break;
                case "Winter":
                    location="Morocco";
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f",location ,place,cost);

    }
}

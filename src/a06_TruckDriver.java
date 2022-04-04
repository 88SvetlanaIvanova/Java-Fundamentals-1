import java.util.Scanner;

public class a06_TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();
        double kilomPerMonth = Double.parseDouble(scan.nextLine());
        //Един сезон е 4 месеца.
        double salaryPerSeason=0;
        if(kilomPerMonth>10000&& kilomPerMonth<= 20000){
            salaryPerSeason=kilomPerMonth*1.45*4*0.90;
        }
        else if(kilomPerMonth<=5000){
            switch (season){
                case "Spring":
                case "Autumn":
                    salaryPerSeason=kilomPerMonth*0.75*4*0.90;
                    break;
                case "Summer":
                    salaryPerSeason=kilomPerMonth*0.90*4*0.90;
                    break;
                case"Winter":
                    salaryPerSeason=kilomPerMonth*1.05*4*0.90;
                    break;

            }
        }else if(kilomPerMonth>5000 && kilomPerMonth<= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    salaryPerSeason = kilomPerMonth * 0.95 * 4 * 0.90;
                    break;
                case "Summer":
                    salaryPerSeason = kilomPerMonth * 1.10 * 4 * 0.90;
                    break;
                case "Winter":
                    salaryPerSeason = kilomPerMonth * 1.25 * 4 * 0.90;
                    break;
            }
        }
        System.out.printf("%.2f",salaryPerSeason);
    }
}

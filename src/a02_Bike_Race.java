import java.util.Scanner;

public class a02_Bike_Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jun = Integer.parseInt(scan.nextLine());
        int sen = Integer.parseInt(scan.nextLine());
        String trackType = scan.nextLine();
        double price =0;
        switch (trackType) {
            case "trail":
               price= jun*5.50 + sen*7;
                break;
            case "cross-country":
               price= jun*8 + sen * 9.50 ;
                if((jun+sen) >= 50){
                    price*=0.75;
                }
                break;
            case "downhill":
               price= jun*12.25+ sen*13.75;
                break;
            case "road":
                price = jun*20 + sen*21.50;
                break;
        }
        price*=0.95;
        System.out.printf("%.2f", price);
    }
}

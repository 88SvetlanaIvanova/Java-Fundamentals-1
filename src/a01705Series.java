import java.util.Scanner;

public class a01705Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        double budget = Double.parseDouble(scan.nextLine());
        int numberOfShows = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <numberOfShows ; i++) {
            String showName = scan.nextLine();
            double priceForShow = Double.parseDouble(scan.nextLine());
            switch (showName){
                case "Thrones":
                    priceForShow*=0.5;
                    break;
                case "Lucifer":
                    priceForShow*=0.6;
                    break;
                case "Protector":
                    priceForShow*=0.7;
                    break;
                case"TotalDrama":
                    priceForShow*=0.8;
                    break;
                case "Area":
                    priceForShow*=0.9;
                    break;
            }
            budget-=priceForShow;

        }
        if(budget>=0){
            System.out.printf("You bought all the series and left with %.2f lv.", budget);
        }else System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget));

    }
}

import java.util.Scanner;

public class a0903Mobile_operator {
    public static void main(String[] args) {
        double price =0;
        double pricePerMonth =0;
        Scanner scanner = new Scanner(System.in);
        String term =scanner.nextLine();
        String size =scanner.nextLine();
        String addedInternet =scanner.nextLine();
        int numOfMonths = Integer.parseInt(scanner.nextLine());
        if (term.equals("one")){
            switch (size){
                case "Small":
                    pricePerMonth=  9.98;
                    break;
                case "Middle":
                    pricePerMonth=  18.99;
                    break;
                case "Large":
                    pricePerMonth=  25.98;
                    break;
                case "ExtraLarge":
                    pricePerMonth=  35.99;
                    break;
            }
        }else if(term.equals("two")){
            switch (size){
                case "Small":
                    pricePerMonth= 8.58;
                    break;
                case "Middle":
                    pricePerMonth=  17.09;
                    break;
                case "Large":
                    pricePerMonth=  23.59;
                    break;
                case "ExtraLarge":
                    pricePerMonth= 31.79;
                    break;
            }
        }
        if(addedInternet.equals("yes")){
            if(pricePerMonth <= 10.00) pricePerMonth+=5.50;
            else if (pricePerMonth <= 30.00) pricePerMonth+=4.35;
            else if (pricePerMonth> 30.00) pricePerMonth+=3.85;
        }

        price = pricePerMonth * numOfMonths;
        if(term.equals("two")) price *= 0.9625;
        System.out.printf("%.2f lv.", price);


    }
}

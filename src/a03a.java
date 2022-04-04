import java.util.Scanner;

public class a03a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogram = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        if(numberOfDogram<10) System.out.println("Invalid order");
        double price =0;

        switch (type){
            case"90X130":
                price =110*numberOfDogram;
                if(numberOfDogram> 60) price *= 0.92;
                else if (numberOfDogram>30) price*= 0.95;
                break;
            case"100X150":
                price =140*numberOfDogram;
                if(numberOfDogram> 80) price *= 0.90;
                else if (numberOfDogram>40) price*= 0.94;
                break;
            case"130X180":
                price =190*numberOfDogram;
                if(numberOfDogram> 50) price *= 0.88;
                else if (numberOfDogram>20) price*= 0.93;
                break;
            case"200X300":
                price =250*numberOfDogram;
                if(numberOfDogram> 50) price *= 0.86;
                else if (numberOfDogram>25) price*= 0.91;
                break;
        }
        if(delivery.equals("With delivery")) price+=60;
        if(numberOfDogram>99)price*=0.96;
        if(numberOfDogram>10){
            System.out.printf("%.2f BGN", price);
        }

    }
}

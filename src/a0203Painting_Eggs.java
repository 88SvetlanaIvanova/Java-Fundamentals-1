import java.util.Scanner;

public class a0203Painting_Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeEggs = scanner.nextLine();
        String color = scanner.nextLine();
        int numberOfPacks = Integer.parseInt(scanner.nextLine());
        double price =0;
        switch ((sizeEggs)){
            case "Large":
                if(color.equals("Red")) price = 16 * numberOfPacks;
                else if( color.equals("Green")) price = 12 * numberOfPacks;
                else if ( color.equals("Yellow")) price = 9 * numberOfPacks;
                break;
            case "Medium":
                if(color.equals("Red")) price = 13 * numberOfPacks;
                else if( color.equals("Green")) price = 9 * numberOfPacks;
                else if ( color.equals("Yellow")) price = 7 * numberOfPacks;
                break;
            case "Small":
                if(color.equals("Red")) price = 9 * numberOfPacks;
                else if( color.equals("Green")) price = 8 * numberOfPacks;
                else if ( color.equals("Yellow")) price = 5 * numberOfPacks;
                break;

        }
        double totalPrice = price*0.65;
        System.out.printf("%.2f leva.", totalPrice);
    }
}

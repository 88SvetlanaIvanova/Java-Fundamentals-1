import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int koz = Integer.parseInt(scanner.nextLine());
        double countSugar = 0;

        double countFlour = 0;
        int maxSugar = 0;
        int maxFlour = 0;
        for (int i = 1; i <= koz; i++) {

            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            countSugar += sugar;
            countFlour += flour;

            if (sugar > maxSugar){
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        double sugarPack = Math.ceil(countSugar / 950);
        double flourPack = Math.ceil(countFlour / 650);
        System.out.printf("Sugar: %.0f\n", sugarPack);
        System.out.printf("Flour: %.0f\n", flourPack);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams. ", maxFlour, maxSugar);
    }
}
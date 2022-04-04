import java.util.Scanner;

public class a01605Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();

        double rating = Double.parseDouble(scanner.nextLine());
        //double juryRatingSum=0;

        int numberOfJury = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfJury ; i++) {
            String juryName = scanner.nextLine();
            double juryRating = Double.parseDouble(scanner.nextLine());
            int juryNameLength = juryName.length();
            rating+=juryNameLength*juryRating/2;
            if(rating>=1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName,rating);
                break;
            }

        }
        if(rating<1250.5)
        System.out.printf("Sorry, %s you need %.1f more!", actorName,1250.5-rating );

    }
}

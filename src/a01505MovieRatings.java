import java.util.Scanner;

public class a01505MovieRatings {
    public static void main(String[] args) {
        String  topFilm="";
        String lowFilm ="";
        double averageRating =0;
        double ratingSum =0;
        double maxRate =0;
        double minRate =10;
        Scanner scanner = new Scanner(System.in);
        int numberOfFilms = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <numberOfFilms ; i++) {
            String filmTitle = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum+=rating;
            if(rating>maxRate){
                maxRate=rating;
                topFilm=filmTitle;
            }else if(rating<minRate){
                minRate=rating;
                lowFilm=filmTitle;
            }
        }
        averageRating=ratingSum/numberOfFilms*1.0;
        System.out.printf("%s is with highest rating: %.1f%n", topFilm, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", lowFilm, minRate);
        System.out.printf("Average rating: %.1f", averageRating);



    }
}

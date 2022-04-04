import java.util.Scanner;

public class a0906a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //inputReader = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxPoints = 0;
        String bestMovie = "";


        int movieCount = 0;
        while (movieCount != 7 && !input.equals("STOP")) {
            String movie = input;

            int pointOfMovie = 0;
            for (int i = 0; i < movie.length(); i++) {
                int letter = movie.charAt(i);
                 pointOfMovie+=letter;
                //дали буквата е малка ( ASCII код между  65 и 90 включително)
                // или голяма (ASCII код между 97 и 122 включително)
                if (Character.isUpperCase(movie.charAt(i))) {//заглавные
                    pointOfMovie -= movie.length();
                } else if (Character.isLowerCase(movie.charAt(i))) {//маленькие
                    pointOfMovie -= movie.length() * 2;
                }

            }
            if (pointOfMovie > maxPoints) {
                maxPoints = pointOfMovie;
                bestMovie = movie;
            }
            movieCount++;
            if(movieCount==7)break;
            input = scanner.nextLine();
        }
        if (movieCount == 7) {
            System.out.println("The limit is reached.");
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxPoints);

    }
}

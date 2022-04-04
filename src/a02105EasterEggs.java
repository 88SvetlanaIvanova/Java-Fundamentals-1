import java.util.Scanner;

public class a02105EasterEggs {
    public static void main(String[] args) {
        int red=0;
        String r="red";

        int orange=0;
        String o="orange";

        int blue=0;
        String b = "blue";

        int green=0;
        String g = "green";

        int maxNumberOfEggs=0;
        String maxColor ="";

        Scanner scanner = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfEggs ; i++) {
            String colorOfEggs = scanner.nextLine();
            switch (colorOfEggs) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }

        }
        if(red>maxNumberOfEggs){
            maxNumberOfEggs=red;
            maxColor=r;
        }
        if(orange>maxNumberOfEggs){
            maxNumberOfEggs=orange;
            maxColor=o;
        }
        if(blue>maxNumberOfEggs){
            maxNumberOfEggs=blue;
            maxColor=b;
        }
        if(green>maxNumberOfEggs){
            maxNumberOfEggs=green;
            maxColor=g;
        }


        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n",green);

        System.out.printf("Max eggs: %d -> %s", maxNumberOfEggs,maxColor);

       // System.out.println(orange);


    }
}

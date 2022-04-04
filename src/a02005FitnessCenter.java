import java.util.Scanner;

public class a02005FitnessCenter {
    public static void main(String[] args) {

        int back =0;
        int chest=0;
        int legs =0;
        int abs =0;
        int boughtShake=0;
        int boughtBar =0;
        //double pClientsBoughtThings=0;
        double p2ClientBought=0;
        double pWorkOut = 0;
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <numberOfPeople ; i++) {
            String result = scanner.nextLine();

            switch (result){
                case "Back":
                    pWorkOut++;
                    back++;
                    break;
                case "Chest":
                    pWorkOut++;
                    chest++;
                    break;
                case "Legs":
                    pWorkOut++;
                    legs++;
                    break;
                case "Abs":
                    pWorkOut++;
                    abs++;
                    break;
                case "Protein shake":
                    boughtShake++;
                    break;
                case "Protein bar":
                   boughtBar++;
                    break;
            }

        }
        p2ClientBought= (boughtBar+boughtShake*1.0)/numberOfPeople*100.0;
        pWorkOut = pWorkOut*100/numberOfPeople*1.0;
        System.out.printf("%d - back%n" ,back);
        System.out.printf("%d - chest%n" ,chest);
        System.out.printf("%d - legs%n" ,legs);
        System.out.printf("%d - abs%n" ,abs);

        System.out.printf("%d - protein shake%n" ,boughtShake);
        System.out.printf("%d - protein bar%n" ,boughtBar);

        System.out.printf("%.2f%% - work out%n" ,pWorkOut);
        System.out.printf("%.2f%% - protein" ,p2ClientBought);

    }
}

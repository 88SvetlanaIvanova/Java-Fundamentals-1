import java.util.Scanner;

public class a0503FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        boolean discount =(age<=19);
        double costFitness =0;
        switch (sport){
            case "Gym":
                if(sex.equals("f")) costFitness = 35;
                else if(sex.equals("m")) costFitness =42;
                break;
            case "Boxing":
                if(sex.equals("f")) costFitness = 37;
                else if(sex.equals("m")) costFitness =41;
                break;
            case "Yoga":
                if(sex.equals("f")) costFitness = 42;
                else if(sex.equals("m")) costFitness =45;
                break;
            case "Zumba":
                if(sex.equals("f")) costFitness = 31;
                else if(sex.equals("m")) costFitness =34;
                break;
            case "Dances":
                if(sex.equals("f")) costFitness = 53;
                else if(sex.equals("m")) costFitness =51;
                break;
            case "Pilates":
                if(sex.equals("f")) costFitness = 37;
                else if(sex.equals("m")) costFitness =39;
                break;
        }
        if(discount)costFitness*=0.80;
        if(budget>=costFitness) System.out.printf("You purchased a 1 month pass for %s.", sport);
        else System.out.printf("You don't have enough money! You need $%.2f more.", costFitness-budget);
    }
}

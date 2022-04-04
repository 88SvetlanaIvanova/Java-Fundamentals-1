import java.util.Scanner;

public class a0705Care_of_Puppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int foodEaten=0;
        int storredFoodForPuppy=Integer.parseInt(scan.nextLine());
        storredFoodForPuppy*=1000;
        String input = scan.nextLine();

        while (!input.equals("Adopted")){
            int foodForPuppy=Integer.parseInt(input);


            storredFoodForPuppy-=foodForPuppy;

            input = scan.nextLine();

        }
        if(storredFoodForPuppy<0){
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(storredFoodForPuppy));
        }else System.out.printf("Food is enough! Leftovers: %d grams.", storredFoodForPuppy);

    }
}

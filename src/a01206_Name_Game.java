import java.util.Scanner;

public class a01206_Name_Game {
    public static void main(String[] args) {
        double maxPoints =0;
        boolean equal=false;
        String winningName="";
        String equalWinner ="";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while(!name.equals("Stop")){
            double thisName= 0;
            for (int i = 0; i <name.length() ; i++) {

                char currentDigit = name.charAt(i);
                int digitAsInteger;
                digitAsInteger = (int)currentDigit;

                int number = Integer.parseInt(scanner.nextLine());
                if(digitAsInteger==number){
                    thisName+=10;
                }else thisName+=2;
            }
            if(thisName>maxPoints){
                maxPoints=thisName;
                winningName=name;
            }else if(thisName==maxPoints){
                equal=true;
                equalWinner= name;
            }


            name = scanner.nextLine();
        }
        if(equal){
            System.out.printf("The winner is %s with %.0f points!", equalWinner, maxPoints);
        }else System.out.printf("The winner is %s with %.0f points!", winningName, maxPoints);



    }
}

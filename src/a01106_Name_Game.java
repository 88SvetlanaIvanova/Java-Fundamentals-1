import java.util.Scanner;

public class a01106_Name_Game {//06. The Most Powerful Word
    public static void main(String[] args) {

        /*char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);*/


        double theStrongestWord =0;
        String strongWord="";
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while(!word.equals("End of words")){
            double thisWord= 0;
            for (int i = 0; i <word.length() ; i++) {
                // int letter = movie.charAt(i);
                //                 pointOfMovie+=letter;
                int thisLetter =word.charAt(i);
                thisWord+=thisLetter;

            }
            if(word.startsWith("a")||word.startsWith("A")||word.startsWith("e")||word.startsWith("E")||
                    word.startsWith("i")||word.startsWith("I")||word.startsWith("o")||word.startsWith("O")||
                    word.startsWith("u")||word.startsWith("U")||word.startsWith("y")||word.startsWith("Y")){
                thisWord*=word.length();

            }else{
                thisWord/=word.length();
                thisWord=Math.floor(thisWord);
            }
            if(thisWord>theStrongestWord) {
                theStrongestWord=thisWord;
                strongWord=word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", strongWord,theStrongestWord);

    }
}

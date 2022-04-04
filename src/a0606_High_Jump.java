import java.util.Scanner;

public class a0606_High_Jump {//70/100 judge*******************************************************
    public static void main(String[] args) {

        //3 jumps for each height
        //jump is good >height
        //+5cm to height
        //if 3 jumps are bad >stop
        //if reached wanted height>success
        Scanner scanner = new Scanner((System.in));
        int wantedHeight = Integer.parseInt(scanner.nextLine());
        int firstHeight = wantedHeight-30;
        int failCount=0;
        int jumpsCount=0;
        int lastHeight = 0;


        for (int i = firstHeight; i <=wantedHeight ; i+=5) {

           for (int j = 0; j <=2 ; j++) {
                 int jumpHeight = Integer.parseInt(scanner.nextLine());
                 lastHeight=jumpHeight;
                 //failCount=0;
                if(jumpHeight>i){
                    jumpsCount++;
                    failCount=0;
                    break;
                }else {
                    failCount++;
                    jumpsCount++;

                }
               if(failCount==3)break;

            }
            if(failCount==3){

                System.out.printf("Tihomir failed at %dcm after %d jumps.%n", lastHeight,jumpsCount);
                break;
            }

        }

        if(lastHeight>wantedHeight){
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wantedHeight,jumpsCount);

        }


    }
}

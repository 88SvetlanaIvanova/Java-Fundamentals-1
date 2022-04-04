import java.util.Scanner;//100/100 judge********************************************

public class a0606a {
    public static void main(String[] args) {

        //3 jumps for each height
        //jump is good >height
        //+5cm to height
        //if 3 jumps are bad >stop
        //if reached wanted height>success
        Scanner scanner = new Scanner((System.in));
        int wantedHeight = Integer.parseInt(scanner.nextLine());
        int firstHeight = wantedHeight-30;

        int jumpsCount=0;
        boolean failed = false;
        int failCount=0;

        while(!failed) {

                int jumpHeight = Integer.parseInt(scanner.nextLine());
                jumpsCount++;

                if(jumpHeight <= firstHeight){
                    failCount++;
                    if(failCount==3){
                        failed = true;
                    }

                }else{
                    if(firstHeight>=wantedHeight){
                        break;
                    }
                    firstHeight+=5;
                    failCount=0;
                }
            }
            if(!failed){
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",wantedHeight,jumpsCount);
                //
            }else {
                System.out.printf("Tihomir failed at %dcm after %d jumps.%n", firstHeight,jumpsCount);

            }
    }
}

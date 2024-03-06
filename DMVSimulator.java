import java.util.Random;

public class DMVSimulator{
    public static void main(String args[]) throws InterruptedException{

        System.out.println("Welcome to the DMV!");
        Random random = new Random();
        int waitingNumber = random.nextInt(200) + 1;
        System.out.println("Your number is " + waitingNumber);
        Thread.sleep(1000);
        for (int counter = waitingNumber + 1; counter <= 200; counter++){
            System.out.println("Number " + counter + ", it is your turn!");
            Thread.sleep(20);
        }
        for (int counter = 0; counter < waitingNumber; counter++){
            System.out.println("Number " + counter + ", it is your turn!");
            Thread.sleep(20);
        }

        Thread.sleep(200);
        System.out.println("Number " + waitingNumber + ", it is your turn!");
        if (random.nextInt(101)+1 <= 99){
            System.out.println("Unfortunately, since you don't have the required paperwork, you MUST leave immediately or you will be charged with trespassing.");
        }
        else {
            System.out.println("You have all of the required paperwork and you are all set!");
        }
        
    }
}
import java.util.*;
public class feedback{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] feedbackArray = new int[6];
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Your feedback rating :" + i + ":");
            feedbackArray[i] = scanner.nextInt();
            sum += feedbackArray[i]; 


        }
        scanner.close();
        System.out.print("the average of the feedbacks : " + (sum / 5));

    }
}
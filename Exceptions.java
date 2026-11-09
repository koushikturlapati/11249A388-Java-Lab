import java.util.Scanner;
public class  Exceptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         try{
            System.out.println("Enter your age:");
            String input = sc.nextLine();
            int age = Integer.parseInt(input);

            System.out.println("Your age is :" + age);
            int result = 100 / (age - age);
            System.out.println("Result :" + result);
        } catch (NumberFormatException e){
            System.out.println("Error : Plesae enter a valid integer age:");
        } catch (ArithmeticException e){
            System.out.println("Error :Divison by zero is not valid.");
        } 
        sc.close();
    }
}
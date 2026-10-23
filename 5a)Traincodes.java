
public class Traincodes { 
    public static void main(String[] args) { 
        String[] trains = {"Tn001", "Tn002", "Tn003"}; 

        try { 
            // This will throw an exception since valid indices are 0, 1, and 2
            System.out.println("Train code" + trains[5]); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error : Invalid array Index"); 
        } 

        System.out.println("Program continues.."); 
    }
}

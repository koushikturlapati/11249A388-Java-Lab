import java.util.Scanner;

public class sales {
    public static void main(String[] args) {
        int[] sales = {452, 756, 109, 206, 241, 635, 641, 148, 273, 711, 868, 876};

        int maxSales = sales[0];
        int minSales = sales[0];
        for (int i = 1; i < sales.length; i++)  {

            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
            if (sales[i] < minSales){
                minSales = sales[i];
            }
        }
    
    System.out.println("Highest Sales:" + maxSales);
    System.out.println("Lowest Sales:" + minSales);
    }
}    
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Matrix arr1 = new Matrix();
        Matrix arr2 = new Matrix();
        System.out.println("Input the order of the first matrix");
        arr1.setOrder(s.nextInt());
        System.out.println("Input the order of the second matrix");
        arr2.setOrder(s.nextInt());
        // input
        Matrix.FillTheArr();
        System.out.println();





    }
}

class Matrix{
    private static int order;
    double[][] arr;


    public void setOrder(int order)
        {
            this.order = order;
        }


    public static double[][] FillTheArr()
    {
        Random rand = new Random();
        double[][] arr = new double[order][order];
        for (int i = 0; i < order; i++)
        {
            for (int j = 0; j < order; j++)
            {
                arr[i][j] = rand.nextInt();
            }
        }
        return arr;
    }

    public double[][] ShowTheArr()
    {

        for (int i = 0; i < order; i++)
        {
            for (int j = 0; j < order; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        return arr;
    }



}


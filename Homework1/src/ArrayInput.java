import java.util.Scanner;


public class ArrayInput
{
    public int[] massiveName()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the length of the array");
        int n = s.nextInt();

        int[] massiveName = new int[n];
        System.out.println("Input the array");
        for (int i = 0; i < n; i++)
        {
            massiveName[i] = s.nextInt();
        }
        return massiveName;
    }
}
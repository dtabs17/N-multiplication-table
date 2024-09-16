import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int num = sc.nextInt();
        System.out.println("The " + num + " times table is below: \n");
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j*i + " ");
            }
            System.out.println("\n");
        }
    }
}
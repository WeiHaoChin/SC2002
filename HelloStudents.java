import java.util.Scanner;
public class HelloStudents
{

    public static void main(String[] args)
    {
        double us,sg,er;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter us");
        us=sc.nextDouble();
        System.out.println("Enter er");
        er=sc.nextDouble();
        sg=us*er;
        System.out.println(sg+"My First Java Program.");
    }
}
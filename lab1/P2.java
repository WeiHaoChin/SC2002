import java.util.Scanner;
public class P2{
    public static void main (String args[])
    {
        int salary,merit;
        char grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary");
        salary=sc.nextInt();
        System.out.println("Enter your merit");
        merit=sc.nextInt();
        if(salary>=700 && salary<=899)
        {
            if(salary>=700 && salary <=799 && merit<20)
            {
                grade='B';
            }
            else
            {
                grade='A';
            }
        }
        else if(salary>=600 && salary<=799)
        {
            if(salary>=600 && salary <=649 && merit<10)
            {
                grade='C';
            }
            else
            {
                grade='B';
            }
        }
        else
        {
            if(salary>=600 && salary <=649 && merit>10)
            {
                grade='B';
            }
            else
            {
                grade='C';
            }
        }
        System.out.println("Salary :$"+salary+", Merit:"+merit+" -Grade "+grade);
        
    }
}
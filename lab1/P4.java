import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        int height;
        Scanner sc= new Scanner(System.in);
        System.out.printf("Please enter the height ");
        height=sc.nextInt();
        if(height<1)
        {
            System.out.println("Error Input!");
        }
        else{
            for(int i=1;i<=height;i++)
            {
                for(int x=1;x<=i;x++)
                {
                if((i+x)%2==0)
                {
                    System.out.printf("AA");
                }
                else{
                    System.out.printf("BB");
                }
                }
                System.out.printf("\n");
            }   
        }
    }
}

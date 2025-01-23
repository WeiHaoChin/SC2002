import java.util.Scanner;
public class P3 {
    static double rate = 1.82;
    public static void main(String[] args) {
        int choice,start,end,increment,i;
        Scanner sc=new Scanner(System.in);
        System.out.printf("1. Use a for loop to generate the first table;\r\n" +
                        "2. Use a while loop to generate the second table; and\r\n" +
                        "3. Use a do/while loop to generate the third table.\n");
        System.out.println("Pick a choice");
        choice=sc.nextInt();
        System.out.println("Enter the starting value");
        start=sc.nextInt();
        System.out.println("Enter the ending value");
        end=sc.nextInt();
        System.out.println("Enter the increment value");
        increment=sc.nextInt();
        if(start>end){
            System.out.println("Error input!");
        }
        else{
            switch(choice)
            {
                case 1:        
                System.out.println("US$     S$");
                System.out.println("------------");
                for(i=start;i<=end;i+=increment)
                {
                    System.out.println(i+"      "+i*rate);
                }
                break;
                case 2:
                System.out.println("US$     S$");
                System.out.println("------------");
                while(start<=end)
                {
                    System.out.printf("%2d      %.1f\n",start,start*rate);
                    start=start+increment;
                }
                break;
                case 3:
                System.out.println("US$     S$");
                System.out.println("------------");
                do{
                    System.out.printf("%2d      %.1f\n",start,start*rate);
                    start=start+increment;
                }
                while(start<end);
                break;
                default:
                System.out.println("Invalid choice");
            }
        }

    }
}

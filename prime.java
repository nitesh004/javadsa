import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        if(num==1||num==2)
            System.out.println("Number is prime ");
        else if(num>2)
            for(int i =2;i<=num/2;i++)
            {
                if(num%i==0)
                    System.out.println("The number is not prime");
                     break;
            }
        else
            System.out.println("The number is prime ");
        }
        }



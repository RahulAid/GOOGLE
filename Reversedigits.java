import java.util.Scanner;
public class Reverse
        {
                public static void main(String[] args)
                {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number") ;
                        int num= sc.nextInt();
			int n= num;
			int rev = 0;
                        while(num!=0)
                        {
                        	int d=num%10;
				rev = rev*10+d ;
				num/=10;
			}
			System.out.println("Reverse of " + n + " is " + rev) ;
		}
	}

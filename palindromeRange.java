import java.util.Scanner;
public class PalindromeRange{
	public static void main(String[]args){
		Scanner sc = new 
		Scanner(System.in);
		System.out.print("Enter the starting number:");
		int start= sc.nextInt();
		System.out.print("Enter the ending number:");
		int end= sc.nextInt();
		System.out.println(" Palindrome numbers between " +start+" and"+end+":");
		for (int num = start;num <= end; num++){
			int temp = num;
			int reveres = 0;
			while(temp !=0){
				 int digits =temp%10;
				reveres=reveres * 10 + digt;
			
			temp=temp/10;
		}
				if (reveres == num){
					System.out.println(num);
				}
			}
			sc.close();
		}
	}
	
		

import java.util.Scanner;


public class TestScanner2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入");
		
		double result1=input.nextDouble();
		
		System.out.println("值"+result1);
		
		//接收字符串
		
	    String result2 = input.next();
		System.out.println("值"+result2);
		
		
		char result3 = input.next().charAt(0);
		
		System.out.println("值"+result3);
		
		
	}
}
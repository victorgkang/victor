import java.util.Scanner;

public class HomeWork{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入你的工资：");
		
		int b=input.nextInt();
		
		int a=b-3500-262;
		
		if(a>=0){
			if(a<=1500){
				double benefit=a*0.03;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a<=4500){
				double benefit=a*0.1-105;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a<=9000){
				double benefit=a*0.2-555;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a<=35000){
				double benefit=a*0.25-1005;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a<=55000){
				double benefit=a*0.3-2755;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a<=80000){
				double benefit=a*0.35-5505;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
				else if (a>80000){
				double benefit=a*0.45-13505;
				System.out.println("实际需要缴税的金额为："+benefit);
			}
		}
		else {
			
			System.out.println("实际需要缴税的金额为："+0);
		}
		
	
	
	
	
	
	
	}
}
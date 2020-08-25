


import java.util.Scanner;//引入JDK提供的一个“扫描仪”的工具；

public class TestScanner{
	public static void main(String[] args){
		
		
		//声明Scanner;
		
		Scanner input = new Scanner(System.in);//引用数据类型的声明方式;
		
		//使用：基于Scanner类型的变量名.nextInt();
		
		int i=input.nextInt();//作用是可以在控制台接收一个整数的值，并保存在变量中；
		
		System.out.println("您输入的值为："+i);
		
	}
}
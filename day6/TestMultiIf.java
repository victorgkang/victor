
import java.util.Scanner;


public class TestMultiIf{
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	int money =input.nextInt();
	
	/* 
	  如果有500万，买劳斯莱斯
	  
	  否则，如果有100万，买GTR
	  否则，如果有50万，买奔驰E
	  否则，如果有20万，买大众
	  否则，如果有10万，哈弗H6
	  否则，如果有1万，电动车
	  否则，捷安特自行车
	  
	  
	  */
	  
	  if (money >=500){
		  System.out.println("劳斯莱斯");
	  }
	  else if (money>=100){
		  System.out.println("GTR");
	  }
	  else if (money>=50){
		  System.out.println("奔驰e");
	  }
	  else if (money >=20){
		  System.out.println("大众");
	  }
	  else if (money>=10){
		  System.out.println("劳斯莱斯");
	  }
	  else if (money >=1){
		  System.out.println("哈弗H6");
	  }
	  else {
		  System.out.println("自行车");
	  }
	System.out.println("程序结束...");
	}
}
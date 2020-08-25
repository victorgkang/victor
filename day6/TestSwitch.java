public class TestSwitch{
	public static void main(String[] args){
		
		//判断一周食谱
		//每天吃什么
		/* 
		  周一：水煮鱼
		  周二：麻辣烫
		  周三：火锅
		  周四：煲仔饭
		  周五：火锅
		  周六：火锅
		  周日：热干面
		*/
		
		
		int weekDay =4 ;
		
		switch (weekDay){
			case 1:
				System.out.println("水煮鱼");
				break;
				
			case 2:
				System.out.println("麻辣烫");
				break;
				
			case 3:
				System.out.println("火锅");
				break;
				
			case 4:
				System.out.println("煲仔饭");
				break;
				
			case 5:
				System.out.println("火锅");
				break;
				
			case 6:
				System.out.println("火锅");
				break;
				
			case 7:
				System.out.println("热干面");
				break;
				
			default:
				System.out.println("输入有误，请选择1-7之间的整数");
		}
		
		System.out.println("程序结束...");
		
		char c='A';
		
		switch (c){
			
			case 'A':
				System.out.println("输出A");
				break;
				
		}
		
		String str="星期一";
		
		switch (str){
			
			case "星期一":
				System.out.println("今天吃水煮鱼");
				break;
			
		}
		
		
	}
}
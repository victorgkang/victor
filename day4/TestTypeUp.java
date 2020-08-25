public class TestTypeUp{
	public static void main(String[] args){
		int a=10;
		double b=20.5;
		double result=a+b;
		System.out.println(result);
		System.out.println(a+b);
		
		int c=5;
		float d=1.2F;
		float result2=c+d;
		System.out.println(result2);
		
		
		
		int e=100;
		long f=50L;
		long result3=e+f;
		System.out.println(result3);
		
		
		byte g=10;
		int h=20;
		int result4=g+h;
		System.out.println(result4);
		
		short j=5;
		byte k=6;
		int result5=j+k;
		System.out.println(result5);
		
		
		//特殊：+拼接字符串，两个操作数，又一个为String 
		
		String str="123";
		int num1=123;
		int num2=567;
		String str2="abc";
		String newStr=num1+num2+str2;
		String newStr2=str+num2+str2;
		System.out.println(newStr);//坑
		System.out.println(newStr2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
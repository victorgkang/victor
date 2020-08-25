public class TestConvert2{
	public static void main(String[] args){
		
		short s=257;
		byte b=(byte)s;
		System.out.println(b);
		
		short s2=128;
		byte b2=(byte)s2;
		System.out.println(b2);
		
		
		char c=65;
		
		
		short s3=97;
		char c2=(char)s3;
		System.out.println(c2);//Êý×ÖÇ¿×ª×Ö·û
		
		short s4=(short)c2;
		System.out.println(s4);
		
	}
}
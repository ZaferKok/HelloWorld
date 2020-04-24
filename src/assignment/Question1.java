package assignment;

public class Question1 {
	
public static void main(String[] args) {
	
	boolean a = (3>2);
	System.out.println(a);
	
	char ch1 = 'j'; 
	char ch2 = 'a'; 
	char ch3 = 'v';
	System.out.println(ch1+""+ch2+""+ch3+""+ch2);
	
	byte as = -128;				// 8 bit
	System.out.println(as);
	
	short num1 = -32768;		// 16 bit
	short num2 = 32767;
	System.out.println(num1 / num2);
	
	int in1 = 2000000000;		// 32 bit
	int in2 = 1000000000;
	System.out.println(in1 / in2);
	
	long ln1 = -19;
	long ln2 = 2;
	System.out.println(ln1+ln2+ln2+ln2+ln2);
	
	float f1 = 3.14f;
	float f2 = 1.57f;
	System.out.println(f1/f2);
	
	double db1 = 33.33;
	double db2 = 11.11;
	System.out.println(db1/db2);
	
}
}

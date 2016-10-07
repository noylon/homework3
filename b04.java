import java.util.*;
public class B04 {
	
	void print()
	{
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.print("연봉을 입력하시오.");
				int pay =s.nextInt();
				
				
				double tax = 0;
				if(pay < 10000000) tax = pay*0.95;
				else if(pay < 40000000) tax = pay*0.19;
				else if(pay < 80000000) tax = pay*0.28;
				else if(pay < 10000000) tax = pay*0.37;
				else tax = pay*0.95;
				
				System.out.print("소득세는"+ (int)tax);				
	}
	
 
	public static void main(String[] args) {
		
		new B04().print();
 
	}
}
 

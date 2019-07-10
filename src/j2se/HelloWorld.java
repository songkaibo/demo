package j2se;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world!");
		/*int moneyeachday = 0;
		int day = 10;
		int sum = 0;
		
		for (int i=1;i<day;i++) {
			if(0 == moneyeachday)
				moneyeachday=1;
			else
				moneyeachday *=2;
	    
		sum +=moneyeachday;
		System.out.println("洪幫主"+i+"天後到手的錢是:"+sum);
		}*/
		//char [] a=new char[5];
		/*
		 * a[0]=(int)(Math.random()*100); a[1]=(int)(Math.random()*100);
		 * a[2]=(int)(Math.random()*100); a[3]=(int)(Math.random()*100);
		 * a[4]=(int)(Math.random()*100);
		 */
		/*System.out.println("數組中的隨機數為：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		int[] b=new int[] {1,2,3,4,5};
		/*
		 * b[0]=(int)(Math.random()*10); b[1]=(int)(Math.random()*10);
		 * b[2]=(int)(Math.random()*10); b[3]=(int)(Math.random()*10);
		 * b[4]=(int)(Math.random()*10);
		 */
		int[] temp=new int[b.length];
		for (int i = 0; i < b.length; i++) {
			temp[i]=b[i];			
		}
		for (int i = 0; i < temp.length; i++) {
			b[i]=temp[temp.length-i-1];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

// java.lang 
public class TestDemo {
	public static void main(String[] args) {			
		Demo d ; // ref 		
		d = new Demo();  // 0		
		d =  new Demo(10);  // 10		
		d =  new Demo(20);
		d =  new Demo(30);
		d =  new Demo(40);
		d =  new Demo(50);
		d = null;
		System.gc();  // 
		d =  new Demo(60);
		d =  new Demo(70);
		d =  new Demo(80);
		
		
		
		

	}

}

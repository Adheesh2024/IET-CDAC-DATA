
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();  // 1		
		System.out.println( s );		
		Student s1 = new Student("a" , 12,12,12);  // 2
		System.out.println( s1 );
		Student s2 = new Student("b" , 12,12,12); // 3
		System.out.println( s2 );
		
		
		Student sarr [] ; // declaration 
		sarr = new Student[5]; // length   array of Student Ref
		
		sarr[0] = new Student();// Student Object 
	}

}












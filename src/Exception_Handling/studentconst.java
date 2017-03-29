package Exception_Handling;
public class studentconst {

	static int id = 0;
	String name;
	 int rollno =10;

	
	
	public studentconst(String name, int rollno) {
	
		this.name = name;       //this keyword is used for future object of current class
		this.rollno = rollno;
		id++;
	}



	public static void main(String[] args) {
		
		
			studentconst obj1= new studentconst("manbir",22);
			System.out.println("obj1 details :"+obj1.name+ " roll no.: "+obj1.rollno+"  ID :"+obj1.id);
			
			studentconst obj2= new studentconst("heera",23);
			System.out.println("obj2 details :"+obj2.name+ " roll no.: "+obj2.rollno+"  ID :"+obj2.id);

			
			studentconst obj3= new studentconst("sunny",24);
			System.out.println("obj3 details :"+obj3.name+ " roll no.: "+obj3.rollno+"  ID :"+obj3.id);

			
	}

}

package Exception_Handling;
public class illegalArgumentExceptions {
	
	int value;
	 illegalArgumentExceptions(int x){
		 if(x<0 || x>100){
			 throw new IllegalArgumentException();
		 }
		 this.value=x;
	 }
	 
	 int getvalue()
	 {
		 return value;
	 }
	

	public static void main(String[] args) {
	
		try{
			illegalArgumentExceptions obj1 = new illegalArgumentExceptions(-21);

			System.out.println(obj1.getvalue());

			}
		catch(IllegalArgumentException e){
			System.out.println("wrong value entered");

		}
	}

}

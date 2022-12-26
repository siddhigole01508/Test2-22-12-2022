package Test2;

public class TestAuthor {

	public static void main(String[] args) {
		
		//	Create three objects with the defined constructors
		
        Author a1=new Author();
		Author a2=new Author("Siddhi ","Gole");
		Author a3=new Author("Siddhi ","Gole","Secret");
		
		
		//	Create one reference and try to display the values. What is your observation
		
		Author []Auth=new Author[10];
		
		 

		//Display the values of second object by using getters.
		
		System.out.println(" Authors first name:"+ a2.getfirstName());
		System.out.println(" Authors last name:"+ a2.getlastName());
		
		
		
		//Display the values of the third object by using the toString() method.
		
		System.out.println("\n Author details :"+a3.toString());
		
		
		//Display the values of first object by using getters
		
		System.out.println("\n First name is of second object :"+a1.getfirstName());
		System.out.println("last name is  of second object :"+a1.getlastName());
		System.out.println("Book name is of second object :"+a1.getBookName());
	 
		
		
		//Assign second object to the reference and display the values.
		
		 Auth[1]=a2;
		 
		 System.out.println("\nAuthors first name  :"+Auth[1].getfirstName());
		 System.out.println(" Authors last name  :"+Auth[1].getlastName());
		 
		
	}

}
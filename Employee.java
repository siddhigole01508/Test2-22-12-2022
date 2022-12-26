package Test2;

public class Employee {
    private int Id;
	   private String firstName;
	   private String lastName;
	   private double Salary;
		
		/* once we have it we have to create a constructor that allows a user to input instance variables **/
	   public Employee() {
	   }
	   
	   
	   public Employee (int Id,String firstName,String lastName,int Salary)
	   {
		this.Id = Id;
		this.firstName=firstName;
	    this.lastName=lastName;
	    this.Salary=Salary;
		
	   }
	  public int getId()
	  {
	  return Id;
	  }
	  
	
	   public String getfirstName()
	   {
		return firstName;
	   }
		  
	   
	   public String getlastName()
	   {
		return lastName;
	   }
	   
	   public String getName()
	   {
		return firstName+ " " +lastName ;
	   }
	   
	   public double getannualSalary()
	   {
		 return Salary*12;
	   }
	   
	   public double raiseSalary(double percent)
	   {
	   Salary=Salary+ ((percent*Salary)/100);
	   return Salary;
	   }
		     
	   public double getSalary()
	   {
	   return Salary;
	   }
		     
     /* now we create a mutator method for each of the instance variables created above that allows a user to change
		* the state of the object.
		*/
	   
	   public void setId(int Salary)
	   {
	   this.firstName=firstName;
	   }
	   
	   public void setFirstName(String firstName)
	   {
	   this.firstName=firstName;
	   }
		     
    public void setlastName(String lastName)
	   {
	   this.lastName=lastName;
	   }
		      
    public void setSalary(double Salary)
	   {
    this.Salary=Salary;
	   }
	  // We use to string method to return all values
		      
   public String toString()
	  {
 	  return " ID :"+ Id +" Name: "+firstName +" "+ lastName +"Salary :"+ Salary;
	  }
		     
	  }
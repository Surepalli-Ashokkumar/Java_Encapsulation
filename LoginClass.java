package com.cisco.encapsulation;

public class LoginClass 
{

	public static void main(String[] args) 
	{
		
		//when data comes from server we need to store and pass it to another class(Employee)
		//we use encapsulation,serialization tostring methods and constructors
		
          Employee e1 = new Employee();
          e1.setId(1);
          e1.setName("Cat");
          e1.setEmail("cat@gmail.com");
          e1.setPassword("cat@123");
          e1.setMobile("987654321");
          
          System.out.println(e1);
        //set and print the value of student here
          
          Student st = new Student();
          st.setId(1);
          st.setName("cat");
          st.setStd(12);
          st.setDivision(2); 
          st.setMobile("987654331");
          
          System.out.println(st);
          
	}

}

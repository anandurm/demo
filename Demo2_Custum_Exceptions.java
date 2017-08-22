package custum_exceptions;

class NameException extends Exception{  
	 NameException(String s){  
	  super(s);  
	 }  
} 

public class Demo2_Custum_Exceptions
	{
		static String name1="anandu";
		static void validate(String Name) throws NameException
		{
			if(name1=="anandu")
			{
				throw new NameException("Valid name");
			}
			else
				System.out.println("eror"); 
		}

		public static void main(String[] args) 
		{
			try
			{
				validate("anandu");
			}
			catch(Exception m)
			{
				System.out.println("Exception occured: "+m);  
			}
		    System.out.println("rest of the code...");
		}
	}

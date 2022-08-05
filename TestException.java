//Creating a custom exception

class N2InvalidException extends Exception
	{
	N2InvalidException(String message)
		{
		super(message);
		}	
	}



public class TestException
	{
	public static void main(String[] args)
		{
		try
		{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("main function of testexception");
			if(n1<n2)
			{
			throw new N2InvalidException("N1 must be greater than N2");
			}
		int abc = n1/n2;
		System.out.println("Division is "+abc);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		finally
		{
		System.out.println("Displaying in finally block");
		}

		System.out.println("Terminating");
		}

	}
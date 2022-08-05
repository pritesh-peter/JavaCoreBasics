public class TestException
	{
	public static void main(String[] args)
		{
		try
		{
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("main function of testexception");
		int abc = n1/n2;
		System.out.println("Division is "+abc);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

		System.out.println("Terminating");
		}

	}
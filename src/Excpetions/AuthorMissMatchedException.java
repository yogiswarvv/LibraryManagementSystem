package Excpetions;

public class AuthorMissMatchedException extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": Author miss matched with Available data";
	}

}

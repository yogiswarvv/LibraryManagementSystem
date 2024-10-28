package Excpetions;

public class InvalidAuthorExceptions extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": Author name should be James,Scott,Alean";
	}
}

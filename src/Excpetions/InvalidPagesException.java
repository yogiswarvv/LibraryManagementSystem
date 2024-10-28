package Excpetions;

public class InvalidPagesException extends RuntimeException{

	@Override
	public String toString()
	{
		return getClass()+": pages should be 500 to 3000";
	}
}

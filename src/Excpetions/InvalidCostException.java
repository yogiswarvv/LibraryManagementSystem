package Excpetions;

public class InvalidCostException extends RuntimeException{

	@Override
	public String toString()
	{
		return getClass()+": cost range should be 500 to 2000";
	}
}

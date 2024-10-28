package Excpetions;

public class InvalidOutOfBoundException extends RuntimeException{
	@Override
	public String toString()
	{
		return getClass()+": id should be even";
	}

}

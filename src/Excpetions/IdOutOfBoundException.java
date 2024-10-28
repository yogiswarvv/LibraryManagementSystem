package Excpetions;

public class IdOutOfBoundException extends RuntimeException{
	@Override
	public String toString()
	{
		return getClass()+": Id not matched with any of the data";
	}

}

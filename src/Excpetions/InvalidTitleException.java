package Excpetions;

public class InvalidTitleException extends RuntimeException{

	@Override
	public String toString()
	{
		return getClass() + ": Title should be Java, Sql,Python";
	}
}

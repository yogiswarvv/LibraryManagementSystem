package Excpetions;

public class TitleOutoFBoundExcpetion extends RuntimeException{
	
	@Override
	public String toString()
	{
		return getClass()+": Title miss matched with Available data";
	}

}

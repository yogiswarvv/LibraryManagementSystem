package com;

import java.util.ArrayList;

import java.util.Iterator;

import Excpetions.AuthorMissMatchedException;
import Excpetions.IdOutOfBoundException;


import Excpetions.TitleOutoFBoundExcpetion;

public class Library {

	private int libraryId;
	private String loc;
	
	private Book b;
	
	private ArrayList<Book> book=new ArrayList<Book>();
	
	//addBook
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book Added successsfully................!");
	}
	//displayBook
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			for(Book b:book)
			{
				b.display();
			}
		}
	}
	//SearchBook By id
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("BookTitle : "+b.getTitle());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new IdOutOfBoundException();
		}
	}
	//search book by authorname
	public void searchBasedOnAuthor(String s)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor().equals(s))
				{
					System.out.println("BookTitle : "+b.getTitle());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new AuthorMissMatchedException();
		}
		
	}
	//update book details by based on title name
	public void updateBookCostBasedOnTitle(String s)
	{
		boolean isFound = false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle().equals(s))
				{
					b.setCost(1000);
					System.out.println("Cost has been updated succesfully");
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new TitleOutoFBoundExcpetion();
		}
	}
	//remove book details based on id
	public void removeBookBasedOnID(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not yet added");
		}
		else
		{
			Iterator<Book> itr=book.iterator();
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Book removed Successfully");
					isFound=true;
				}
			}
		if(!isFound)
		{
			throw new IdOutOfBoundException();
		}
		}
		
	}
	
}

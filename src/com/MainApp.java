package com;

import java.util.Scanner;

import Excpetions.IdOutOfBoundException;
import Excpetions.InvalidAuthorExceptions;
import Excpetions.InvalidCostException;
import Excpetions.InvalidPagesException;
import Excpetions.InvalidTitleException;

public class MainApp {

	public static void main(String[] args) {
		String s1;
		String s2;
		int i1;
		int i2;
		int i3;
		Library l=new Library();
		
		Scanner s=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("Enter the choice : \n 1.To Add the book \n 2.Display book details \n 3.Search Book based on Id \n 4.Search Book based on Author \n 5.Update cost of the book based on title \n 6.Remove book details by Id \n 7.Exit");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
			{
				while(true)
				{
					try
					{
						System.out.println("Enter the title of the book");
						s1=s.next();
						System.out.println("Enter the Author of the book");
						s2=s.next();
						System.out.println("Enter the cost of the book");
						i1=s.nextInt();
						System.out.println("Enter the Number of pages of the book");
						i2=s.nextInt();
						System.out.println("Enter the Id for the book");
						i3=s.nextInt();
						l.addBook(new Book(s1, s2, i1, i2, i3));
						break;
					}
					catch(InvalidTitleException e)
					{
						System.out.println("Enter valid Title Name");
						s1=s.next();
					}
					catch(InvalidAuthorExceptions e)
					{
						System.out.println("Enter the valid author name");
						s2=s.next();
					}
					catch(InvalidCostException e)
					{
						System.out.println("Enter the valid cost of the book");
						i1=s.nextInt();
					}
					catch(InvalidPagesException e)
					{
						System.out.println("Enter the Valid Number of pages of the book");
						i2=s.nextInt();
					}
					catch(IdOutOfBoundException e)
					{
						System.out.println("Enter the Valid Id for the book");
						i3=s.nextInt();
					}
				}
			}
			break;
			case 2:
			{
				l.displayBook();
			}
			break;
			case 3:
			{
				System.out.println("Enter the id");
				int i=s.nextInt();
				l.searchBookBasedOnId(i);
			}
			break;
			case 4:
			{
				System.out.println("Enter the Author name");
				s1=s.next();
				l.searchBasedOnAuthor(s1);
			}
			break;
			case 5:
			{
				System.out.println("Enter the Title of the book");
				s1=s.next();
				l.updateBookCostBasedOnTitle(s1);
			}
			break;
			case 6:
			{
				System.out.println("Enter the Id");
				int i = s.nextInt();
				l.removeBookBasedOnID(i);
			}
			break;
			case 7:
			{
				isStart=false;
				System.out.println("Thank You...!");
			}
			break;
			default : System.out.println("Entered invalid choice");
			}
		}

	}

}

package com;

import Excpetions.InvalidAuthorExceptions;
import Excpetions.InvalidCostException;
import Excpetions.InvalidOutOfBoundException;
import Excpetions.InvalidPagesException;
import	Excpetions.InvalidTitleException;
public class Book {
	
	private String title; //Java Sql Pyhton
	private String author;// James Scott Alean
	private int cost;//500 - 2000
	private int noOfPages;// 500 - 3000
	private int id; // even 
	public Book(String title, String author, int cost, int noOfPages, int id) {
		
		if(validateTitle(title))
		{
			this.title = title;
		}
		else
		{
			throw new InvalidTitleException();
		}
		
		if(validateAuthor(author))
		{
			this.author = author;
		}
		else
		{
			throw new InvalidAuthorExceptions();
		}
		if(validateCost(cost))
		{
			this.cost = cost;
		}
		else
		{
			throw new InvalidCostException();
		}
		if(validateNoOfPages(noOfPages))
		{
			this.noOfPages = noOfPages;
		}
		else
		{
			throw new InvalidPagesException();
		}
		if(ValidateId(id))
		{
			this.id = id;
		}
		else
		{
			throw new InvalidOutOfBoundException();
		}
	
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "title=" + title + "\n author=" + author + "\n cost=" + cost + "\n noOfPages=" + noOfPages + "\n id="
				+ id + "\n ----------------------------------------------";
	}
	public boolean validateTitle(String s)
	{
		if(s.equals("Java") || s.equals("Sql") || s.equals("Python"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateAuthor(String s)
	{
		if(s.equals("Scott") || s.equals("James") || s.equals("Alean"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateCost(int id)
	{
		if(id>=500 && id<=2000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateNoOfPages(int id)
	{
		if(id>=500 && id<=3000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean ValidateId(int id)
	{
		if(id%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("BookTitle : "+getTitle());
		System.out.println("BookAuthor : "+getAuthor());
		System.out.println("BookId : "+getId());
		System.out.println("BookCost : "+getCost());
		System.out.println("Number of pages in book : "+getNoOfPages());
	}
	
	

}

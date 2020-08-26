package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * this class is used to implements the Interface BookOperations
 * @author Azeem
 *
 */

public class BookOperationsImpl implements BookOperations
{
	private static ArrayList<Book> bookList=new ArrayList<Book>();
	/**
	 * this method is used to implement the addBook  operation to add books in Library
	 * @param book:Book
	 * @return void 
	 */

	@Override
	public void addBook(Book book) 
	{
		bookList.add(book);
		System.out.println("book successfully added");
	}
	/**
	 *  this method is used to implement the search operation based on title 
	 * @param bookTitle:String
	 * @return ArrayList<Book>
	 * 
	 */

	@Override
	public ArrayList<Book> searchBookTittle(String bookTittle) 
	{
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook=bookList.get(i);
			String retrievedTittle=retrievedBook.getBookTittle();
			if(bookTittle.equals(retrievedTittle))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}
	}
	/**
	 * this method is used to implement the  search operation  based  on the author 
	 * @param bookAuthor
	 * @return ArrayList<Book>
	 */

	@Override
	public ArrayList<Book> searchBookAuthor(String bookAuthor) 
	{
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook=bookList.get(i);
			String retrievedAuthor=retrievedBook.getBookAuthor();
			if(bookAuthor.equals(retrievedAuthor))
			{
				searchList.add(retrievedBook);	
			}
		}

		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}
	}
	/**
	 * this method is used to implement the search operation based on book type
	 * @return ArrayList<Book>
	 */

	@Override
	public ArrayList<Book> searchBookType(String bookType) 
	{
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook=bookList.get(i);
			String retrievedType=retrievedBook.getBookType();
			if(bookType.equals(retrievedType))
			{
				searchList.add(retrievedBook);	
			}
		}
		if(searchList.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchList;
		}
	}
	/**
	 * this method is used to implement the updateBookPrice operation to update the book price
	 * @param bookId:int
	 * @param bookPrice:double
	 * @return void 
	 */

	@Override
	public void updateBookPrice(int bookId, double bookPrice) 
	{
		int status=0;
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook=bookList.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			if(bookId==retrievedBookId)
			{
				status=1;
				System.out.println("before update "+retrievedBook);
				retrievedBook.setBookPrice(bookPrice);
				bookList.set(i,retrievedBook);
				System.out.println("after update "+retrievedBook);
				break;
			}
		}
		if(status==0)
		{
			throw new BookNotFoundException();
		}
	}
	/**
	 * this method is used to implement the removeBook operation from books in Library 
	 * @param bookId:int
	 * @return  boolean
	 */

	@Override
	public boolean removeBook(int bookId) 
	{
		boolean status=false;
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook=bookList.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			if(bookId==retrievedBookId)
			{
				status=true;
				bookList.remove(i);
				break;
			}
		}
		return status;
	}
	/**
	 * this method is used to implement the getBookId operation to get all the BookIds
	 * @return ArrayList<Integer>
	 */

	@Override
	public ArrayList<Integer> getBookIds() 
	{
		ArrayList<Integer> idList = new ArrayList<Integer>();
		for(int i=0;i<=bookList.size()-1;i++)
		{
			Book retrievedBook = bookList.get(i);
			int retrievedBookId = retrievedBook.getBookId();
			idList.add(retrievedBookId);
		}
		return idList;
	}
	/**
	 *  this method is used to implement the getAllBooksinfo to get all the books information
	 * @return ArrayList<Book>
	 */

	@Override
	public ArrayList<Book> getAllBooksInfo() 
	{
		
		return bookList;
	}
	/**
	 *  this method is used to implements the sortBooks to sort the all the books in the library
	 * @param ch:int
	 * @return void  
	 */

	@Override
	public void sortBooks(int ch) 
	{
		if(ch == 1)
		{
			BookIdComapare id = new BookIdComapare();
			Collections.sort(bookList,id);
			System.out.println("books are sorted based on Id's...");
		}
		else if(ch == 2)
		{
			BookTittleComapare tittle = new BookTittleComapare();
			Collections.sort(bookList,tittle);
			System.out.println("books are sorted based on tittle...");
		}
		else if(ch == 4)
		{
			BookTypeCompare type = new BookTypeCompare();
			Collections.sort(bookList,type);
			System.out.println("books are sorted based on type...");
		}
		else if(ch == 3)
		{
			BookAuthorCompare author = new BookAuthorCompare();
			Collections.sort(bookList,author);
			System.out.println("books are sorted based on author...");
		}
		else if(ch == 5)
		{
			BookPriceCompare price = new BookPriceCompare();
			Collections.sort(bookList,price);
			System.out.println("books are sorted based on price...");
		}
		else
		{
			System.out.println("invalid choice...");
		}
	}	
}
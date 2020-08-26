package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 
 * @author Azeem
 * Librarian class will have the book operations
 * it extends the thread class to run the code in separate path
 * 
 */
public class Librarian extends Thread
{
	Scanner scan = new Scanner(System.in);
	/**
	 * performBookOparations() will have the choices which are librarian can able to choose
	 * if librarian choice is 1 then librarian need to add the book
	 * book properties are id,title,author,type,price
	 * if librarian choice is 2 then librarian can librarian a book based on title
	 * if librarian choose 3 then librarian can search a book based on author
	 * if librarian choose 4 then librarian can search a book based on type(genre)
	 * if librarian choose 5 then librarian can update price of a book based on market
	 * if the choice is 6 then librarian can remove the book
	 * if the choice is 7 the librarian can get all the books id's
	 * if the choice is 8 the librarian can get all the books information
	 * if the choice is 9 the librarian can sort the based on id,title,author,type,price
	 */
	public static void performBookOperations()
	{
	BookOperations bookOperations=BookManager.getBookOperations();
	Scanner scan = new Scanner(System.in);
	System.out.println("press 1 to add Book...");
	System.out.println("press 2 to search a book based on tittle...");
	System.out.println("press 3 to search a book based on author...");
	System.out.println("press 4 to search a book based on book type...");
	System.out.println("press 5 to upadate book price...");
	System.out.println("press 6 to remove book");
	System.out.println("press 7 to get book id's...");
	System.out.println("press 8 to get all the booksInfo...");
	System.out.println("press 9 to sort the books");
	int choice=scan.nextInt();
	/**
	 * if choice is 1
	 * taking the book properties and storing it in the book object
	 * created Book class Object
	 * storing all the book properties of information
	 * @param addBook(book):void 
	 */
	if(choice==1)
	{
		System.out.println("enter book id...");
		int bookId=scan.nextInt();
		System.out.println("enter book tittle...");
		String bookTittle=scan.next();
		System.out.println("enter book author name...");
		String bookAuthor=scan.next();
		System.out.println("enter book type...");
		String bookType=scan.next();
		System.out.println("enter book price");
		Double bookPrice=scan.nextDouble();
		Book book = new Book(bookTittle, bookAuthor, bookType, bookPrice, bookId);
		bookOperations.addBook(book);
	}
	/**
	 * if choice is 2
	 * Searching the book based on title
	 * if book is present t will give the book info
	 * @Thows BookNotFoundException
	 */
	else if(choice==2)
	{
		System.out.println("enter book name to search...");
		String bookTittle=scan.next();
		try
		{
		ArrayList<Book> searchedBookList=bookOperations.searchBookTittle(bookTittle);
		Iterator<Book> iteratesearchedBookList= searchedBookList.iterator();
		{
			while(iteratesearchedBookList.hasNext())
			{
				Book searchedBook=iteratesearchedBookList.next();
				System.out.println(searchedBook);
			}
		}
		}
		catch(BookNotFoundException exp)
		{
			System.out.println(exp);
		}
	}
	/**
	 * if choice is 3
	 * search will happen based on author name
	 * if book found in the library it will show the book
	 * @throws BookNotFoundException
	 */
	else if(choice==3)
	{
		System.out.println("enter book author name to search...");
		String bookAuthor=scan.next();
		try
		{
		ArrayList<Book> searchedBookList=bookOperations.searchBookAuthor(bookAuthor);
		Iterator<Book> iteratesearchedBookList= searchedBookList.iterator();
		{
			while(iteratesearchedBookList.hasNext())
			{
				Book searchedBook=iteratesearchedBookList.next();
				System.out.println(searchedBook);
			}
		}
		}
		catch(BookNotFoundException exp)
		{
			System.out.println(exp);
		}
	}
	/**
	 * if choice is 4
	 * book search will happen based on book type(genre)
	 * if book found it will shows the book info
	 * @throws BookNotFoundException
	 */
	else if(choice==4)
	{
		System.out.println("enter book type to search...");
		String bookType=scan.next();
		try
		{
		ArrayList<Book> searchedBookList=bookOperations.searchBookType(bookType);
		Iterator<Book> iteratesearchedBookList= searchedBookList.iterator();
		{
			while(iteratesearchedBookList.hasNext())
			{
				Book searchedBook=iteratesearchedBookList.next();
				System.out.println(searchedBook);
			}
		}
		}
		catch(BookNotFoundException exp)
		{
			System.out.println(exp);
		}
	}
	/**
	 * if choice is 5
	 * price need to be updated
	 * it will ask the book id to update price
	 * and shows the old price and new price
	 * if book found based on given id it will update
	 * @throws BookNotFoundException 
	 */
	else if(choice==5)
	{
		System.out.println("enter book id");
		int bookId=scan.nextInt();
		System.out.println("enter the book price");
		Double bookPrice=scan.nextDouble();
		try
		{
			bookOperations.updateBookPrice(bookId, bookPrice);
		}
		catch(BookNotFoundException exp)
		{
			System.out.println(exp+" so update not available");
		}
	}
	/**
	 * if choice is 6
	 * it remove the book based on given id
	 * if the book not found
	 * @throws BookNotFoundWxception
	 */
		else if(choice==6)
		{
			System.out.println("enter book id");
			int bookId=scan.nextInt();
			boolean removalStatus=bookOperations.removeBook(bookId);
			if(removalStatus)
			{
				System.out.println("book removed successfully");
			}
			else
			{
				System.out.println("book not found");
			}
		}
	/**
	 * if choice is 7
	 * it will shows the all id's present in the library
	 */
		else if(choice==7)
		{
			ArrayList<Integer> idList = bookOperations.getBookIds();
			for(Integer id:idList)
			{
				System.out.println(id);
			}
		}
	/**
	 * if choice is 8
	 * it will shows the all the books information present in the library
	 */
		else if(choice==8)
		{
			ArrayList<Book> allBooks=bookOperations.getAllBooksInfo();
			for(int i=0;i<=allBooks.size()-1;i++)
			{
				System.out.println(allBooks.get(i));
			}
			/**
			 * if choice is 9
			 * then the books are sorted according to the given option
			 */
		}
		else if(choice==9)
		{
			System.out.println("press 1 to sort based on id...");
			System.out.println("press 2 to sort based on tittle...");
			System.out.println("press 3 to sort based on author...");
			System.out.println("press 4 to sort based on type...");
			System.out.println("press 5 to sort based on price...");
			int ch = scan.nextInt();
			bookOperations.sortBooks(ch);
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
	/**
	 * inside this method perforOperation() method will run
	 * this method will ask the librarian whether to continue the process or terminate
	 * if input 1 process will continue
	 * if input 0 terminates the process
	 */
	public void continueOrStop()
	{
		int continueOrStopStatus=0;
		do
		{
			performBookOperations();
			System.out.println("press 1 to continue");
			System.out.println("press 0 to stop");
			continueOrStopStatus=scan.nextInt();
		}while(continueOrStopStatus==1);
	}
	/**
	 * this method will run two methods
	 * continueOrStop(),performBookOperations()
	 * 
	 */
	public void run()
	{
		continueOrStop();
	}
}


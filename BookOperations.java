package demo;

import java.util.ArrayList;
/**
 * it's a interface class
 * it will have the incomplete methods
 * @author Azeem
 *
 */


public interface BookOperations 
{
	/**
	 * addBook() method is to add the book in library
	 * @param book
	 */
	void addBook(Book book);
	/**
	 * searchBookTittle() method is to search the book based on title in library
	 * @param bookTittle
	 * @return ArrayList<Book>:bookList
	 */
	ArrayList<Book> searchBookTittle(String bookTittle);
	/**
	 * searchBookAuthor() method is to search the book based on author in library
	 * @param bookAuthor
	 * @return ArrayList<Book>:bookList
	 */
	ArrayList<Book> searchBookAuthor(String bookAuthor);
	/**
	 * searchBookType method is to search the book based on type in library
	 * @param bookType
	 * @return ArrayList<Book>:bookList
	 */
	ArrayList<Book> searchBookType(String bookType);
	/**
	 * updateBookPrice() method will update the price of a book
	 * @param bookId
	 * @param bookprice
	 */
	void updateBookPrice(int bookId,double bookprice);
	/**
	 * removeBook() method will remove the book in the library
	 * @param bookId
	 * @return boolean
	 */
	boolean removeBook(int bookId);
	/**
	 * getBookIds() method will gives the all books id's in the library
	 * @return ArrayList<Integer>
	 */
	ArrayList<Integer> getBookIds();
	/**
	 * getAllBooksInfo() method will gives the all the books information present in the library
	 * @return ArrayList<Book>
	 */
	ArrayList<Book> getAllBooksInfo();
	/**
	 * sortBooks() sort the all the books based on the choice
	 * @param ch
	 */
	void sortBooks(int ch);
}

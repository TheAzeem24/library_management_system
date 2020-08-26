package demo;

import java.util.Comparator;
/**
 * this class implements the Comparator
 * the Comparator is interface class
 * so we need to override the method
 * the compare() method will compare the two objects
 * the two objects are UpCasted to Object class
 * and UpCasted objects should be DownCasted
 * the two given objects will compared using compareTo()
 * and return the res
 * @author Azeem
 * @param  Object o1, Object o2
 * @return res:int
 *
 */

public class BookAuthorCompare implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Book book1 = (Book)o1;
		Book book2 = (Book)o2;
		String author1 = book1.getBookAuthor();
		String author2 = book2.getBookAuthor();
		int res = author1.compareTo(author2);
		return res;
		
	}
	
}

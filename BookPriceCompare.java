package demo;

import java.util.Comparator;
/**
 * this class implements the Comparator
 * the Comparator is interface class
 * so we need to override the method
 * the compare() method will compare the two objects
 * the two objects are UpCasted to Object class
 * and UpCasted objects should be DownCasted
 * the two given objects will compared using relational operators
 * if its grater it will return positive Number
 * if its negative it will return negative Number
 * or returns zero
 * @author Azeem
 *
 */
public class BookPriceCompare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Book book1 = (Book)o1;
		Book book2 = (Book)o2;
		if(book1.getBookPrice()>book2.getBookPrice())
		{
			return 1;
		}
		else if(book1.getBookPrice()<book2.getBookPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}

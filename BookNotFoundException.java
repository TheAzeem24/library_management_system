package demo;
/**
 * 
 * @author Azeem
 * its a exception class
 * its extends RunTimeException to have the exception powers
 * we throw exception if book not found in library
 */
public class BookNotFoundException extends RuntimeException
{
	/**
	 * overrided the toString() to return the exception
	 * @return Book not available in library:String
	 */
	@Override
	public String toString()
	{
		return "Book not available in library";
	}
	
}

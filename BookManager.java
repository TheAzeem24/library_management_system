package demo;
/**
 * BookManager class is a helper class
 * it have the helper getBookOperations() method
 * @author Azeem
 */
public class BookManager 
{
	/**
	 * this helper getBookOperations() method will create a object for BookOperationsImpl class
	 * the stored  in BookOperations class
	 * @return bookOparations:BookOperations
	 */
	public static BookOperations getBookOperations()
	{
		BookOperations bookOparations=new BookOperationsImpl();
		return bookOparations;
	}
}

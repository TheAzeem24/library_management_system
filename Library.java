package demo;
/**
 * 
 * @author Azeem
 * @param main method
 * it have the object of the librarian class
 * that librarian class extends the thread to run program in separate path
 * start() will run the program in separate path
 */
public class Library 
{
	public static void main(String[] args) 
	{
		Librarian librarian = new Librarian();
		librarian.start();
	}
}

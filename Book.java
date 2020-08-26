package demo;
/**
 * this class will have the properties of books
 * all variables are non-static variables
 * @author Azeem
 *
 */
public class Book
{
	private String bookTittle;
	private String bookAuthor;
	private String bookType;
	private double bookPrice;
	private int bookId;
	/**
	 * to Initialize the instance variable we use constructor
	 * constructor is generated based on variables
	 * @param bookTittle
	 * @param bookAuthor
	 * @param bookType
	 * @param bookPrice
	 * @param bookId
	 */
	public Book(String bookTittle, String bookAuthor, String bookType, double bookPrice, int bookId) 
	{
		super();
		this.bookTittle = bookTittle;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
	}
	/**
	 * since variables are encapsulated
	 * to get the bookTittle info we use get() followed by variable name
	 * @return bookTittle:String
	 */
	public String getBookTittle() 
	{
		return this.bookTittle;
	}
	/**
	 * since variables are encapsulated
	 * to change the bookTittle info we use the set() followed by variable name
	 * @param bookTittle:void
	 */
	public void setBookTittle(String bookTittle) 
	{
		this.bookTittle = bookTittle;
	}
	/**
	 * since variables are encapsulated
	 * to get the bookAuthor info we use get() followed by variable name
	 * @return bookAuthor:String
	 */
	public String getBookAuthor() 
	{
		return this.bookAuthor;
	}
	/**
	 * since variables are encapsulated
	 * to change the bookAuthor info we use the set() followed by variable name
	 * @param bookAuthor:void
	 */
	public void setBookAuthour(String bookAuthor) 
	{
		this.bookAuthor = bookAuthor;
	}
	/**
	 * since variables are encapsulated
	 * to get the bookType info we use get() followed by variable name
	 * @return bookType:String
	 */
	public String getBookType() 
	{
		return this.bookType;
	}
	/**
	 * since variables are encapsulated
	 * to change the bookType info we use the set() followed by variable name
	 * @param bookType:void
	 */
	public void setBookType(String bookType) 
	{
		this.bookType = bookType;
	}
	/**
	 * since variables are encapsulated
	 * to get the BookPrice info we use get() followed by variable name
	 * @return BookPrice:String
	 */
	public double getBookPrice() 
	{
		return this.bookPrice;
	}
	/**
	 * since variables are encapsulated
	 * to change the bookPrice info we use the set() followed by variable name
	 * @param bookPrice:void
	 */
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	/**
	 * since variables are encapsulated
	 * to get the bookId info we use get() followed by variable name
	 * @return bookId:int
	 */
	public int getBookId() 
	{
		return this.bookId;
	}
	/**
	 * overrided toString()
	 * to return the useful information
	 */
	@Override
	public String toString() 
	{
		return "Book [bookTittle=" + this.bookTittle + ", bookAuthor=" + this.bookAuthor + ", bookType=" + this.bookType
				+ ", bookPrice=" + this.bookPrice + ", bookId=" + this.bookId + "]";
	}
	/**
	 * in equals() object will UpCasted to Object class
	 * to get info present in the object that object must be DownCasted
	 * compare the book price
	 * @param Object
	 * @return bookPrice:boolean
	 * 
	 */
	@Override
	public boolean equals(Object object)
	{
		Book book=(Book)object;
		return this.bookPrice==book.bookPrice;
	}
	/**
	 * 
	 */
	@Override
	public int hashCode()
	{
		return this.bookId;
	}
}


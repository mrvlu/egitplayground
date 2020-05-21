/**
* A class that maintains information on a book.
* This might form part of a larger application such
* as a library system, for instance.
*
* @author (Insert your name here.)
* @version (Insert today’s date here.)
*/
public class Book
{



	// The fields.
	private String author;
	private String title;
	private int pages;
	
	/**
	 * Set the author and title fields when this object
	 * is constructed.
	 */
	public Book(String bookTitle, String bookAuthor)
	{
		author = bookAuthor;
		title = bookTitle;
		pages=-1; //could be a default value if none provided
	}
	/**
	 * Overloaded constructor
	 * @param bookAuthor
	 * @param bookTitle
	 * @param pages
	 */
	public Book( String bookTitle,String bookAuthor, int pages)
	{
		author = bookAuthor;
		title = bookTitle;
		this.pages=pages;
		
	}	
	
	public void printAuthor(){
		System.out.println(author);
	}
	
	public void printTitle(){
		System.out.println(title);
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		
		if (pages<0){
			System.out.println("This book does not have a proper page count set.");
		}
		
		return pages;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		if  (pages<0) {
			System.out.println("Are you sure you wish to enter a negative value.");
		}
		this.pages = pages;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", pages=" + pages + "]";
	}
	

}
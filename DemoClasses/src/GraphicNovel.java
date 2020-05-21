
public class GraphicNovel extends Book{
	
	String artist;
	
	public GraphicNovel(String bookTitle, String bookAuthor, String artist) {
		super(bookTitle, bookAuthor); //Calling on the parent classes constructor
		// TODO Auto-generated constructor stub
		this.artist=artist;
		
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GraphicNovel [artist=" + artist + ", getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle()
				+ ", getPages()=" + getPages() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

	

	
	

}

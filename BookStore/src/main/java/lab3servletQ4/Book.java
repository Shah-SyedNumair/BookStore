package lab3servletQ4;

public class Book {
	int id;
	String author;
	String Title;
	float price;
	int  orderedQty;
	
	public Book(int id, String author, String title, float price) {
		super();
		this.id = id;
		this.author = author;
		Title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getOrderedQty() {
		return this.orderedQty;
	}
	
	public void setOrderedQty(int ord) {
		this.orderedQty = ord;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", Title=" + Title + ", price=" + price + "]";
	}
	

}
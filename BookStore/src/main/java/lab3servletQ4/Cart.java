package lab3servletQ4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
 
   private List<Book> cart;  // List of Books
   private String totalPrice;
 
   // constructor
   public Cart() {
      cart = new ArrayList<Book>();
   }
 
   // Add a Book into this Cart, with qtyOrdered. If the book of id already exists, update the qty ordered
   // if not, create a new book.
   public void add(int id, String title, String author, float price, int qtyOrdered) {
      Book temp = new Book(id, author, title, price);
      temp.setOrderedQty(qtyOrdered);
      cart.add(temp);
   }
 
   // Update the quantity for the given id, of total orderqty
   public void update(int id, int newQty) {
      for(Book b : cart) {
    	  if(b.getId() == id) {
    		  b.setOrderedQty(newQty);
    		  break;
    	  }
      }
   }
 
   // Remove a Book given its id
   public void remove(int id) {
      Iterator<Book> iter = cart.iterator();
      while (iter.hasNext()) {
         Book b  = iter.next();
         if(b.getId() == id) {
        	 iter.remove();
        	 break;
         }
      }
   }
   
   public void setTotalPrice(String price) {
	   this.totalPrice = price;
   }
   
   public String getTotalPrice() {
	   return this.totalPrice;
   }
 
   // Get the number of Books in this Cart
   public int size() {
      return cart.size();
   }
 
   // Check if this Cart is empty
   public boolean isEmpty() {
      return size() == 0;
   }
 
   // Return all the Books in a List<Book>
   public List<Book> getItems() {
      return cart;
   }
 
   // Remove all the items in this Cart
   public void clear() {
      cart.clear();
   }
}
import java.util.ArrayList;
import java.util.List;

public class Library 
{
	
	private List<String> book =new ArrayList<>();
	
	
	void addBokks(String bookName)
	{
		book.add(bookName);
		System.out.println(bookName + " added to library1");
	}
	
	
	
	void listBooks()
	{
		System.out.println("Books in Library:   " + book);
	}
	
}

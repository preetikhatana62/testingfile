package welcome;

public class dependent 
{
	public static void main(String[] args)
	{
		  bag ob =new bag();
		  ob.addbook("red",200,new book("english",23,300));
		  System.out.println(ob.b.book_name);
		  System.out.println(ob.b.price);
		  System.out.println(ob .price);
		  System.out.println(ob.b.book_id);
	}

}

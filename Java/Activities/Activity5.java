
public class Activity5 {
	public static void main(String[] args) {
		String title = "Money Hiest";
		book HP = new  Mybook();
		HP.settitle(title);
		System.out.println("My new book is:- " + HP.gettitle());	

	}


}
	
	abstract class book {
		String title ;
		abstract void settitle(String a);
		String gettitle()
		{
			return title;
			
		}
	}
	
	class Mybook extends book
	{
		public void settitle(String s) {
			title = s;
		}
	}

	

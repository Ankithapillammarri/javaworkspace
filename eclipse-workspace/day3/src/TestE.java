
public class TestE {
	public static void main(String[] args) {

		Card ap=new Card();
		ap.swipe();
		ap.swipe();

		Card dl=new Card();
		dl.swipe();
		dl.swipe();

		Card mh=new Card();
		mh.swipe();

		System.out.println("AP count is "+ap.count);
		System.out.println("DL count is "+dl.count);
		System.out.println("MH count is "+mh.count);
		System.out.println("Count is "+Card.total);



	}
}

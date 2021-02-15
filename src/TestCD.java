import java.util.ArrayList;

public class TestCD {
	public static void main ( String[] args ) {
		ArrayList<CD> CDArray = new ArrayList<CD>();
		
		CDArray.add(new CD ("Billy Face", "My first album", 10));
		
		for (CD cd : CDArray){
			System.out.println("CD Artist: " + cd.getArtist());
			System.out.println("CD title: " + cd.getTitle());
			System.out.println("CD price: £" + cd.getPrice());
		}
	}
}

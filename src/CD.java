
public class CD {
	
	private String Artist;
	private String Title;
	private double Price;
	
	
	public CD (String artist, String title, double price){
		this.Artist = artist;
		this.Title = title;
		this.Price = price;
	}
	
	public String getArtist(){
		return Artist;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public double getPrice(){
		return Price;
	}
}

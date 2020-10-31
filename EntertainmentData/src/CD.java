//This class will help print out information when CD is called in database
public class CD extends Item {

	private String artist;
	private int numberOfTracks;

    //Takes in variables from the Database class and saves it
	//Allows it to be formated and printed as a result
	public CD(String title, String artist, int numberOfTracks, int playingTime) {
		
		super(title, playingTime);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
	}
	
	//returns true if a artist contains the searched string
	public boolean contains(String str) {
		
		if (artist.contains(str)) {
			return true;
		}
		return super.contains(str);
	}
	
	//returns artists in a CD
	public String getArtist() {
		return artist;
	}
	
	//returns number of tracks in a CD
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	
	//Formats output 
		public String toString() {
			String str = String.format("CD: %s \n", super.toString());
			str += String.format("     %s\n", artist);
			return str += String.format("     # tracks: %d", numberOfTracks);
		}
}
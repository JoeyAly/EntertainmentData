//This class will help print out information when a DVD is called in database
public class DVD extends Item {
	
	private String director;
	
	//Takes in variables from the Database class and saves it
	//Allows it to be formated and printed as a result
	public DVD(String title, String director, int playingTime) {
		
		super(title, playingTime);
		this.director = director;
			}
	//Return directors name
	public String getDirector() {
		return director;
	}
	
	//Formats DVD output
		public String toString() {
			String a = String.format("DVD: %s \n", super.toString());
			a += String.format("     %s\n", director);
			return a;
		}
}
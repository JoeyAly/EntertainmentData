//This class will help print out information when a DVD is called in database
public class Video extends Item {
	
	private String director;
	private Format type;
	
	
	
	//Takes in variables from the Database class and saves it
	//Allows it to be formated and printed as a result
	public Video(String title, String director, int playingTime,  Format type ) {
		
		super(title, playingTime);
		this.director = director;
		this.type = type;
	}
	
	//returns true if a director contains the searched string
	public boolean contains(String str) {
		
		if (director.contains(str)) {
			return true;
		}
		return super.contains(str);
	}
	
	//returns true if format contains the searched format
	public boolean contains(Video.Format format) {
	
		if (type == format) {
			return true;	
		}
		
		return false;
	}

	
	//Return directors name
	public String getDirector() {
		return director;
	}

	//Gives options for different video formats to be input
	public enum Format {
		
		Bluray, VHS, DVD ;
		public String toString() {
			switch(this) {
				case Bluray:
					return "Bluray";
				case VHS:
					return "VHS";
				case DVD:
					return "DVD";
				default: throw new IllegalArgumentException();		
			}
		}		
	}

	
	//Formats DVD output
	public String toString() {
		String str = String.format("%s : %s \n", type.toString(), super.toString());
		return str += String.format("     %s\n", director);			
	}
}
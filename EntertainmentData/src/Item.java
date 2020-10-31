//This class gets inherited from DVD and CD classes
public class Item {
	
	private String comment;
	private boolean gotIt;
	private int playingTime;
	private String title;
  
//Default class that other classes inherits from	
	public Item(String title, int playingTime) {
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = false;
		this.comment = null;
	}
	//returns true if a title or comment contains the searched string
	public boolean contains(String str) {
		
		if (title.contains(str)) {
			return true;
		} else if (comment != null && comment.contains(str)) { 
			return true;
		}
		return false;
	}
	
	//returns comment
	public String getComment() {
		return comment;
	}
	//returns if owned
	public boolean getOwn() {
		return gotIt;
	}


	public void print() {
		System.out.println("Print statement");
	}
	
	//Sets comment
	public void setComment(String comment) {
		this.comment = comment;
	}

	//Sets if owned
	public void setOwn(boolean gotIt) {
		this.gotIt = gotIt;
	}
	
	//Sets format for CD and DVD class
	
	public String toString() {
		return String.format("%s (%d mins)", title, playingTime);
	}
		
	
}
	
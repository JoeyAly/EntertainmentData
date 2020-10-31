import java.util.ArrayList;


//This class will add new items to a list
//Will input CD and DVD information
public class Database {
  
	private static ArrayList<Item> items;
	
	//Saves array into items
	public Database() {
		items = new ArrayList<Item>();
	}

	//Ability to add an item into items 
	public void addItem(Item item) {
		items.add(item);
	}

	//Gets items and adds them to position for the toString
	public void list() {

		for (int i=0; i<items.size(); i++){
			System.out.println(items.get(i));
		}
	}
	
	//Searches to see if any CD or Video has the desired string
	public void search(String str) {
		ArrayList<Item> results = new ArrayList<Item>();
		
		for (Item item: items) {
			
			if (item.getClass() == CD.class) {
				
				if (((CD)item).contains(str)) {
					results.add( (CD)item);
				}
				
			} if (item.getClass() == Video.class) {
				
				
				if (((Video)item).contains(str)) {
					results.add( (Video)item );
				}
			} 
		}

		System.out.printf("Your search returned %d result%s: \n\n", results.size(), results.size() == 1 ? "": "s");

		for (Item result : results) {
			System.out.println( result );
		}
	}
	//Searches to find any Videos on a specific format
	public void search(Video.Format format) {
		ArrayList<Item> results = new ArrayList<Item>();
		
		for (Item item: items) {
		
			if (item.getClass() == Video.class) {
				
				
				if (((Video)item).contains(format)) {
					results.add( (Video)item);
				}
			}
			
		}
		
		System.out.printf("Your search returned %d result%s: \n\n", results.size(), results.size() == 1 ? "": "s");

		for (Item result : results) {
			System.out.println( result );
		}
	}
	
	//Creates variations of CDs and DVDs
	//Adds them as new items to the database
	//Prints out information on the CD/DVD
	public static void main(String[]args) {
		Database db = new Database();
		CD c = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
		CD d = new CD("Big Bad World", "Plain White T's", 10, 35);
		Video x = new Video("Oh Brother, Where Art Thou?", "Joel and Ethan Coen", 106, Video.Format.Bluray);
		Video v = new Video("Oh Brother, Where Art Thou?", "Joel and Ethan Coen", 106, Video.Format.DVD );
		Video y = new Video("Infinty Wars", "Anthony and Joe Russo", 149, Video.Format.Bluray );
		
		db.addItem(c);
		db.addItem(d);
		db.addItem(x);
		db.addItem(v);
		db.addItem(y);

		//db.list();

		
		
		
		db.search("Oh Brother");
		db.search(Video.Format.DVD);
	}
}
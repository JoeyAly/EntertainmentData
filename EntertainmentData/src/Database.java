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
			System.out.println(items.get(i).toString());
		}
	}

	
	//Creates variations of CDs and DVDs
	//Adds them as new items to the database
	//Prints out information on the CD/DVD
	public static void main(String[]args) {
		Database db = new Database();
		CD c = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
		CD d = new CD("Big Bad World", "Plain White T's", 10, 35);
		DVD v = new DVD("Oh Brother, Where Art Thou?", "Joel and Ethan Coen", 106);
		
		db.addItem(c);
		db.addItem(d);
		db.addItem(v);
		
		db.list();
	}
}
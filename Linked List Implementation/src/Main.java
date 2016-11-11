
public class Main {
	
	public static void main(String args[]) {

		LinkedList list = new LinkedList();
		
		System.out.println("====================");
		System.out.println("Inserted Nodes");
		System.out.println("====================");
		
		//Insert Nodes
		list.addNode("Sarah", 12);
		list.addNode("Camille", 8);
		list.addNode("Eric", 18); 
		list.addNode("John", 16);
		
		//Display the list
		list.displayList();
		System.out.println("");
		
		System.out.println("====================");
		System.out.println("Search Nodes");
		System.out.println("====================");
		
		//Search for nodes in the list
		list.searchNode("Eric");
		list.searchNode("Carlo");
		
	}
}

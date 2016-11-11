
public class LinkedList {
	
	private Node m_headNode;
	private Node m_currentNode;
	private Node m_nextNode;
	
	private int size = 0;
	
	public boolean isEmpty() { //Checks if the Linked List is empty
		if(m_headNode != null) {
			return false; 
		} else {
			return true;
		}
	}
	
	public void addNode(String name, int age) { //Used to add new node
		if(isEmpty()) {
			m_headNode = new Node(name, age); //If the list is empty, set the new added node as the head node
			m_currentNode = m_headNode; //Set the head node as the current node
			size++; //Increment the size of the list

		} else {
			size++; //Increment the size of the list
			m_nextNode = new Node(name, age); //Get the value of the added node and store it to the m_nextNode		
			m_currentNode.setNextNode(m_nextNode); //Link the current node to the m_nextNode
			m_currentNode = m_nextNode; //Set the new current node
		}
	} 
	
	public void displayList() { //Used to display the List
		Node current = m_headNode;
		for(int i = 0; i < size; i++) { //Traverse through the list
			System.out.println("Name: " + current.getName() + ", Age: " + current.getAge()); //Print the name and age for each node pass
			current = current.getNextNode(); //Set new current node for the next loop until it terminates
		}
	}
	
	public void searchNode(String search) { //Used to search for a name value of the node from the list
		Node current = m_headNode;
		boolean foundSearchItem; //returns true if search item is found, false otherwise
			
		//Enclose inside try-catch clause to handle the null pointer exception error
		try {
			while(current.getName() != search) { //this loop will only terminate until search item is found
				current = current.getNextNode(); //Set new current node for the next loop until it terminates
				foundSearchItem = false; //While the loop is still going on, this will remain false
			}
			
			if(current.getName() == search) { //If search item is found
				foundSearchItem = true; //Set to true
				
				//Display result
				System.out.println("The age of " + search +
						" is: " + current.getAge());
			} 
		} catch (NullPointerException e){ //If the null pointer exception is called, therefore, search item is not found in the list
			System.out.println(search + " is not found!"); //Display result
		}
	}
}


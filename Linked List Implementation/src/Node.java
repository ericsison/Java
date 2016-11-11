
public class Node {
	
	private String m_name; //Name information of the node
	private int m_age; //Age information of the node
	private Node next; //The next node
	
	public Node(String name, int age) { //Initialization
		this.m_name = name;
		this.m_age = age;
	}
	
	public String getName() { //Get the name information of the node
		return m_name;
	}
	
	public int getAge() { //Get the age information of the node
		return m_age;
	}
	
	public void setNextNode(Node n) { //Set the next node
		this.next = n;
	}
	
	public Node getNextNode() { //Get the next node
		return next;
	}
}

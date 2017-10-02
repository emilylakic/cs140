package assignment03;

public class Node {

	private int value; 
	private Node next;

	public Node(int aValue) { 
		value = aValue;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}


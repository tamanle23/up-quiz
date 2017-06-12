
public class Node {
	private int value;
	private Node nextNode;
	
	public Node(int elementValue){
		this.value = elementValue;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}

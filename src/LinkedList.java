
public class LinkedList {
	private Node head;
	private Node tail;

	public void setTail(Node tail) {
		this.tail = tail;
	}

	private void add(Node element) {
		if (head == null) {
			head = element;
			tail = element;
		} else {
			tail.setNextNode(element);
			tail = element;
		}
	}

	public void append(int elementValue) {
		this.add(new Node(elementValue));
	}
	
	public void removeTail() {
		if (tail != null) {
			Node node = head;
			Node prev = null;
			while (node.getNextNode() != null) {
				prev = node;
				node = node.getNextNode();
			}
			if (prev == null) {
				head = null;
				tail = null;
			} else {
				prev.setNextNode(null);
				tail = prev;
			}
		}
	}

	public void removeElementsGreaterThan(int targetValue) {
		if(head!=null){
			Node node = head;
			Node prev = null;
			while(node!=null){
				if(node.getValue()>targetValue){
					if(prev==null){
						head = node.getNextNode();
						node = head;
					} else {
						node = node.getNextNode();
						prev.setNextNode(node);
					}
				} else {
					prev = node;
					node = node.getNextNode();
				}
			}
			tail = prev;
		}
	}
	
	class Node {
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
}

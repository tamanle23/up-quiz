
public class LinkedList {
	private Node head;
	private Node tail;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public LinkedList() {

	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void append(int elementValue) {
		this.add(new Node(elementValue));
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
						head = node;
					} else {
						prev.setNextNode(node.getNextNode());
					}
				}
				prev = node;
				node = node.getNextNode();
			}
			tail = prev;
		}
	}
}



public class DoubleLInkedList {
	private class Node {
		private int data;
		private Node next; 
		private Node prev;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

//        public void setData(int data) {
//            this.data = data;
//        }
		
		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getPrev() {
			
			return prev;
		}
	}

	private Node first;
	private Node current;
	public void add(int d) {
		Node n = new Node(d);
		if (first == null) {
			first = n;
		}
		if (current != null)
			current.setNext(n);
		n.setPrev(current);
		current = n;
	}

	public void printForward() {
		Node t = first;
		while (t != null) {
			System.out.println(t.getData());
			t = t.getNext();
		}
	}
	
	public void printBackward() {
		Node t = current;
		while (t != null) {
			System.out.println(t.getData());
			t = t.getPrev();
		}
	}

	public void addAfter(int pos, int data) {
		Node n = new Node(data);
		Node t = first;
		while (t != null) {
			if (t.getData() == pos) {
				if (t.getNext() == null)
					current = n;
				n.setNext(t.getNext());
				t.setNext(n);
				break;
			}
			t = t.getNext();
		}
	}

//    public void addBefore(int pos, int data) {
//        Node n =new Node(data);
//        Node t=first;
//        Node p=null;
//        while(t!=null) {
//            if(t.getData()==pos) {
//                if(t==first) {
//                    n.next=t;
//                    first=n;
//                    }
//                else {
//                n.setNext(t);
//                t.setNext(n);
//                }
//                break;             
//            }
//            p=t;
//            t=t.getNext();
//        }
//    }

	public void remove(int pos) {
		Node t = first;
		Node p = null;
		while (t != null) {
			if (t.getData() == pos) {
				if (t == first)
					first = t.getNext();
				else
					p.setNext(t.getNext());
				t.next = null;
				break;
			}
			p = t;
			t = t.getNext();
		}
	}
}

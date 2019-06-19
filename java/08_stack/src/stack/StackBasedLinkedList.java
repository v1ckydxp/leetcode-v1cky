package stack;

public class StackBasedLinkedList {
	private Node top = null;
	
	//构造函数可以不要，系统会使用默认的构造函数
	public StackBasedLinkedList() {
		
	}
	
	//入栈操作
	public void push(int value) {
		Node temp = new Node(value,null);
		temp.next = top;
		top = temp;
	}
	
	public int pop() {
		if(top == null)return -1;
		int value = top.data;
		top = top.next;
		
		return value;
	}
	
	
	//打印输出所有元素
	public void printAll() {
		Node p = top;
		
		while(p != null) {
			System.out.print(p.data+" ");
			p = p.next;
		}
		System.out.println();
	}
	
	
	private static class Node{
		private int data;
		private Node next;
		
		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		
		public int getData() {
			return this.data;
		}
	}
}

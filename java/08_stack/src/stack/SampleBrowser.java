package stack;


/**
 * 使用前后栈实现浏览器的前进后退
 * @author v1cky
 *
 */
public class SampleBrowser {
	//测试
	public static void main(String[] args) {
		SampleBrowser browser = new SampleBrowser();
		browser.open("http://www.baidu.com");
		browser.open("http://news.baidu.com");
		browser.open("http://news.baidu.com/ent");
		browser.goBack();
		browser.goBack();
		browser.goForward();
		browser.open("http://www.qq.com");
		browser.goForward();
		browser.goBack();
		browser.goForward();
		browser.goBack();
		browser.goBack();
		browser.goBack();
		browser.goBack();
		browser.checkCurrentPage();
	}
	
	private String currentPage;
	private LinkedListBasedStack backStack;
	private LinkedListBasedStack forwardStack;
	
	public SampleBrowser() {
		this.backStack = new LinkedListBasedStack();
		this.forwardStack = new LinkedListBasedStack();
	}
	
	public void open(String url) {
		if(this.currentPage != null) {
			this.backStack.push(this.currentPage);
			this.forwardStack.clear();
		}
		showUrl(url,"open");
	}
	
	//判断是否可以后退
	public boolean canGoBack() {
		return this.backStack.getSize() > 0;
	}
	
	//判断是否可以前进
	public boolean canGoForward() {
		return this.forwardStack.getSize() > 0;
	}
	
	//后退
	public String goBack() {
		//首先判断是否可以后退，即后退栈是不是为空
		if(this.canGoBack()) {
			//后退的时候要先把当前的页面压如前进栈
			this.forwardStack.push(this.currentPage);
			String backUrl = this.backStack.pop();
			showUrl(backUrl,"Back");
			return backUrl;
		}
		System.out.println("can't go back, no pages behind.");
		return null;
	}
	
	public String goForward() {
		if(this.canGoForward()) {
			//先把当前页面压入后退栈
			this.backStack.push(this.currentPage);
			String forwardUrl = this.forwardStack.pop();
			showUrl(forwardUrl,"Forward");
			return forwardUrl;
		}
		System.out.println("can't go forward, no pages before.");
		return null;
	}
	
	public void showUrl(String url,String prefix) {
		this.currentPage = url;
		
		System.out.println(prefix + "pages == "  +url);
	}
	
	public void checkCurrentPage() {
		System.out.println("Current Page is : " + this.currentPage);
	}
	public static class LinkedListBasedStack{
		private int size;
		private Node top;
		
		public LinkedListBasedStack() {
			this.size = 0;
			this.top = null;
		}
		
		//新建节点
		static Node createNode(String data, Node next) {
			return new Node(data,next);
		}
		//清空栈
		public void clear() {
			this.top = null;
			this.size = 0;
		}
		
		//入栈
		public void push(String value) {
			Node temp = createNode(value,this.top);
			this.top = temp;
			this.size++;
		}
		
		//出栈
		public String pop() {
			if(this.top == null) {
				System.out.println("Stack is empty !!!");
				return null;
			}
			Node p = this.top;
			this.top = this.top.next;
			if(this.size > 0 )
				this.size--;
			return p.data;
				
		}
		
		//获取栈顶元素
		public String getTopData() {
			if(this.size == 0) {//若栈为空
				System.out.println("Stack is empty !!!");
				return null;
			}
			return this.top.data;
		}
		
		//返回当前栈中的元素个数
		public int getSize() {
			return this.size;
		}
		
		//打印输出栈中所有元素的信息
		public void print() {
			System.out.println("print Stack  :  ");
			if(this.size == 0) {
				System.out.println("Stack is empty !!!");
				return ;
			}
			Node p = this.top;
			while(p != null) {
				String data = p.getData();
				System.out.print(data + "\t");
				p = p.next;
			}
			System.out.println();
		}
		
		public static class  Node{
			private String data;
			private Node next;
			
			public Node(String value) {
				this.data = value;
				this.next = null;
			}
			
			public Node(String value,Node next) {
				this.data = value;
				this.next = next;
			}
			
			public void setData(String data) {
				this.data = data;
			}
			
			public String getData() {
				return this.data;
			}
			
			public void setNext(Node next) {
				this.next = next;
			}
			
			public Node getNext() {
				return this.next;
			}
		}
	}
}

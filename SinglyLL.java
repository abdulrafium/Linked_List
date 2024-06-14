public class SinglyLL {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	
	public static Node head=null;
	
	
	//AddFirst
	public void AddFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		 newNode.next=head;
		 head=newNode;
	}
	
	
	
	
	//AddLast
		public void AddLast(int data)
		{
			Node newNode = new Node(data);
			if(head==null)
			{
				head=newNode;
				return;
			}
			
			Node temp = head;
			while (temp.next != null) 
			{
	            temp = temp.next;
	        }
	        temp.next = newNode;

		}
		
		
		
			
	//Remove First
	public void removeFirst()
	{
		head=head.next;
	}
		
	
	
		
	//Remove Last
	public void removeLast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
	}
		
	
	
	
	//Print
	public void Print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + " --> ");
			temp=temp.next;
		}
		
		System.out.print("Null");
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		SinglyLL obj=new SinglyLL();
		
		obj.AddFirst(2);
		obj.AddFirst(1);
		
		obj.AddLast(3);
		obj.AddLast(4);
		
		obj.Print();
		
		obj.removeFirst();
		obj.Print();
		
		obj.removeLast();
		obj.Print();

	}

}

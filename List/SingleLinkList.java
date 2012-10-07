package edu.cquptzx.List;

public class SingleLinkList implements List
{
	private Node head;
	Node current;
	int size;
	
	public SingleLinkList()
	{
		setHead(current = new Node(null));
		size =0;
	}
	/**
	 * 定位成员函数index(int i)的实现
	 * 循环从头开始查找,循环的条件是:1.定位完成j==i;2.链表查找结束了.
	 * @param i
	 * @throws Exception 当参数i错误时,抛出异常.
	 */
	public void index(int i )throws Exception
	{
		if(i<-1 || i >size-1)
		{
			throw new Exception("i error in INDEX.");
		}
		if(i == -1) return;
		current = getHead().next;
		int j = 0;
		while(current!=null && j<i)
		{
			current = current.next;
			j++;
		}
	}
	public Node getHead() 
	{
		return head;
	}
	public void setHead(Node head) 
	{
		this.head = head;
	}
	/**
	 * 插入节点算法:
	 * 1.调用index(i-1),让成员变量current指向第i-1个节点.
	 * 2.以obj,current.next为参数创建新的节点.
	 * 3.更改current指向,改为下一个节点.
	 * 4.表元素总数加1.
	 */
	public void insert(int i, Object obj) throws Exception {
		if(i<0 || i>size)
		{
			throw new Exception ("i error in INSERT.");
		}
		index(i-1);
		current.setNext(new Node(obj,current.next));
		size++;
	}

	/**
	 * 删除节点算法:
	 * 1.调用index(i-1),让成员变量current指向第i-1个节点.
	 * 2.把第i个节点脱链:让第i-1个节点的next域等于第i个节点的next域.
	 * 3.数据元素总数size减1.
	 */
	public Object delete(int i) throws Exception 
	{
		if(size == 0)
		{
			throw new Exception ("Link Blank in DELETE.");
		}
		if(i<0 || i>size-1)
		{
			throw new Exception ("i error in DELETE.");
		}
		index(i-1);
		Object obj = current.next.getElement();
		current.setNext(current.next.next);
		size--;
		return obj;
	}
	/**
	 * 获取指定的元素
	 * 1.调用index(i),让成员变量current指向第i个节点.
	 * 2.返回该节点的数据域的值.
	 */
	@Override
	public Object getData(int i) throws Exception 
	{
		// TODO Auto-generated method stub
		if(i<-1 || i>size-1)
		{
			throw new Exception ("i error in getData.");
		}
		index(i);
		return current.getElement();
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return size;
	}

	public int getSize()
	{

		return size;
	}
	public void setSize(int sz) 
	{
		this.size= sz;
	}
	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return size ==0;
	}
	/*
	 public void List(SingleLinkList sll) throws Exception
	{
		System.out.println("\n--------------------------------\n");
		for(int i = 0;i<sll.getSize();i++)
		{
			System.out.print(sll.getData(i) + " ");
		}
		System.out.println("\n--------------------------------\n");	
	}	
	 **/
	
}

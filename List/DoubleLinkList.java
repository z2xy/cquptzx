/**
 * 
 */
package edu.cquptzx.List;

/**
 * @author cquptzx
 *
 */
public class DoubleLinkList implements List {	
	TNode head;
	TNode current;
	int size;
	/**
	 * 构造函数:
	 * 初始化循环链表.
	 */
	DoubleLinkList()
	{
		head=current=new TNode(null);
		head.prior=head;
		head.next=head;
		size = 0;
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
			throw new Exception("i error in INDEX of DoubleLinkList.");
		}
		if(i == -1) return;
		current = head.next;
		int j = 0;
		while(current!=head && j<i)
		{
			current = current.next;
			j++;
		}
	}
	/* (non-Javadoc)
	 * @see edu.cquptzx.List.List#insert(int, java.lang.Object)
	 */
	@Override
	public void insert(int i, Object obj) throws Exception 
	{
		// TODO Auto-generated method stub
		if(i<0 || i>size)
		{
			throw new Exception ("i error in INSERT.");
		}
		index(i-1);
		current.setNext(new TNode(current.getNext(),obj,current.next.getPrior()));
		current.next.next.setPrior(current.next.getNext());
		size++;	
	}

	/* (non-Javadoc)
	 * @see edu.cquptzx.List.List#delete(int)
	 */
	@Override
	public Object delete(int i) throws Exception {
		// TODO Auto-generated method stub
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
		current.next.setPrior(current.getNext());
		size--;
		return obj;
	}

	/* (non-Javadoc)
	 * @see edu.cquptzx.List.List#getData(int)
	 */
	@Override
	public Object getData(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<-1 || i>size-1)
		{
			throw new Exception ("i error in getData.");
		}
		index(i);
		return current.getElement();
	}

	/* (non-Javadoc)
	 * @see edu.cquptzx.List.List#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/* (non-Javadoc)
	 * @see edu.cquptzx.List.List#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

}

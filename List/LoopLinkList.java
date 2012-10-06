package edu.cquptzx.List;

public class LoopLinkList implements List {
	Node head;
	Node current;
	int size;
	
	LoopLinkList()
	{
		head = current = new Node(null);
		head.next = head;
		size =0;
	}
	/**
	 * ��λ��Ա����index(int i)��ʵ��
	 * ѭ����ͷ��ʼ����,ѭ����������:1.��λ���j==i;2.������ҽ�����.
	 * @param i
	 * @throws Exception ������i����ʱ,�׳��쳣.
	 */
	public void index(int i )throws Exception
	{
		if(i<-1 || i >size-1)
		{
			throw new Exception("i error in INDEX.");
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
	/**
	 * ����ڵ��㷨:
	 * 1.����index(i-1),�ó�Ա����currentָ���i-1���ڵ�.
	 * 2.��obj,current.nextΪ���������µĽڵ�.
	 * 3.����currentָ��,��Ϊ��һ���ڵ�.
	 * 4.��Ԫ��������1.
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
	 * ɾ���ڵ��㷨:
	 * 1.����index(i-1),�ó�Ա����currentָ���i-1���ڵ�.
	 * 2.�ѵ�i���ڵ�����:�õ�i-1���ڵ��next����ڵ�i���ڵ��next��.
	 * 3.����Ԫ������size��1.
	 */
	public Object delete(int i) throws Exception {
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
	 * ��ȡָ����Ԫ��
	 * 1.����index(i),�ó�Ա����currentָ���i���ڵ�.
	 * 2.���ظýڵ���������ֵ.
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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}
	
}
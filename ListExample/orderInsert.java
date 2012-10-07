package edu.cquptzx.ListExample;
import java.util.Comparator;
import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;
/**
 * 要求:设计一个成员函数,要求在单链表中插入一个数据元素x,
 * 		并要求插入后的单链表元素从小到大有序排列.并设计主函数进行测试.
 * @author cquptzx
 *
 */
public class orderInsert 
{
	/**
	 * pre 初始化时指向头结点
	 * curr 初始化时指向首节点.
	 * 使用循环找到插入点.
	 * 新建一个节点,插入.
	 * 表数据总元素数加1.
	 * @param singleLinkList
	 * @param x				待插入节点的数值.
	 * @param mc			进行比较.
	 */
	public  static void orderInsertMethod(SingleLinkList singleLinkList,Object x,Comparator mc)
	{
		Node curr,pre;
		curr = singleLinkList.getHead().getNext();
		pre = singleLinkList.getHead();
		
		while( (curr!=null) && (mc.compare(curr.getElement(), x)==1))
		{
			pre = curr;
			curr = curr.getNext();
		}
		Node temp = new Node((Integer)x,pre.getNext());	
		pre.setNext(temp);
		singleLinkList.setSize((singleLinkList.getSize())+1);
		
	}
	/**
	 * 顺序插入创建单链表.
	 * 输出单链表.
	 * @param args
	 */
	public static void main(String args[])
	{
		MyComparator mc = new MyComparator();
		SingleLinkList sll = new SingleLinkList();
		int s[]={1,3,9,11,8,6,22,16,15,10},n=10;
		try
		{
			for(int i= 0;i<n;i++)
			{
				orderInsertMethod(sll,new Integer(s[i]),mc);
			}
			for(int i = 0;i<sll.getSize();i++)
			{
				System.out.print(sll.getData(i)+" ");
			}

		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
}

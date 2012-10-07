package edu.cquptzx.ListExample;
import java.util.Comparator;
import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;
/**
 * 要求:设计一个成员函数,要求在单链表就地排序.
 * 		不增加新的节点.并设计主函数进行测试.
 * @author cquptzx
 *
 */
public class orderInsertWithouNewNode 
{
	/**
	 * 
	 * 
	 * @param sll
	 * @param mc
	 */
	public static void SingleLinkListSortWithoutNewNode(SingleLinkList sll,Comparator<Object> mc)
	{
		Node curr;
		
		//curr指向首节点.(不是头结点)(首节点为分离后的另外的链表的第一个节点.)
		curr=sll.getHead().getNext();
		
		//头结点指针域为空,将单链表拆成两个链表.
		(sll.getHead()).setNext(null);
		
		//头节点分离为一个单链表,表元素总数为0.
		sll.setSize(0);
		
		//只要当前指向节点非空,就将其插入到头结点所在链表.
		while(curr!=null)
		{
			orderInsertMethod(sll,curr.getElement(),mc);
			curr=curr.getNext();
		}	
	}
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
	public  static void orderInsertMethod(SingleLinkList singleLinkList,Object x,Comparator<Object> mc)
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
		int s[]={1,3,9,11,8,6,22,16,15,10};
		int n = s.length;
		try
		{
			//根据数组构建单链表
			for(int i= 0;i<n;i++)
			{
				sll.insert(i, new Integer(s[i]));
			}
			
			System.out.print("\n排序前元素为:\n");
			for(int i = 0;i<sll.getSize();i++)
			{
				System.out.print(sll.getData(i)+" ");
			}
			
			//排序.
			SingleLinkListSortWithoutNewNode(sll,mc);
			
			
			System.out.print("\n排序后元素为:\n");
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

package edu.cquptzx.ListExample;
import java.util.Comparator;
import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;

public class orderInsert 
{
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

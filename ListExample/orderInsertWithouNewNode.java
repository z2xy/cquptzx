package edu.cquptzx.ListExample;
import java.util.Comparator;
import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;
/**
 * Ҫ��:���һ����Ա����,Ҫ���ڵ�����͵�����.
 * 		�������µĽڵ�.��������������в���.
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
		
		//currָ���׽ڵ�.(����ͷ���)(�׽ڵ�Ϊ���������������ĵ�һ���ڵ�.)
		curr=sll.getHead().getNext();
		
		//ͷ���ָ����Ϊ��,������������������.
		(sll.getHead()).setNext(null);
		
		//ͷ�ڵ����Ϊһ��������,��Ԫ������Ϊ0.
		sll.setSize(0);
		
		//ֻҪ��ǰָ��ڵ�ǿ�,�ͽ�����뵽ͷ�����������.
		while(curr!=null)
		{
			orderInsertMethod(sll,curr.getElement(),mc);
			curr=curr.getNext();
		}	
	}
	/**
	 * pre ��ʼ��ʱָ��ͷ���
	 * curr ��ʼ��ʱָ���׽ڵ�.
	 * ʹ��ѭ���ҵ������.
	 * �½�һ���ڵ�,����.
	 * ��������Ԫ������1.
	 * @param singleLinkList
	 * @param x				������ڵ����ֵ.
	 * @param mc			���бȽ�.
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
	 * ˳����봴��������.
	 * ���������.
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
			//�������鹹��������
			for(int i= 0;i<n;i++)
			{
				sll.insert(i, new Integer(s[i]));
			}
			
			System.out.print("\n����ǰԪ��Ϊ:\n");
			for(int i = 0;i<sll.getSize();i++)
			{
				System.out.print(sll.getData(i)+" ");
			}
			
			//����.
			SingleLinkListSortWithoutNewNode(sll,mc);
			
			
			System.out.print("\n�����Ԫ��Ϊ:\n");
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

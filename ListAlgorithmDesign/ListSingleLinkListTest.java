package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SingleLinkList;

/**
 * �ڶ���-���Ա�-�㷨�����
 * 2-12 ��дһ������������������������Ԫ�صĳ�Ա����.
 * �����Ժ�����
 * @author cquptzx
 */
public class ListSingleLinkListTest 
{

	public static void main(String args[])
	{
		SingleLinkList sll = new SingleLinkList();
		int n = 25;
		try
		{
			for (int i = 0 ;i<n;i++)
			{
				sll.insert(i, new Integer(i+1));
			}
			(new ListSingleLinkList()).List(sll);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}
}

package edu.cquptzx.ListAlgorithmDesign;
import edu.cquptzx.List.SingleLinkList;
/**
 * �ڶ���-���Ա�-�㷨�����
 * 2-12 ��дһ������������������������Ԫ�صĳ�Ա����.
 * @author cquptzx
 */
public class ListSingleLinkList 
{
	public void List(SingleLinkList sll) throws Exception
	{
		System.out.println("\n--------------------------------\n");
		for(int i = 0;i<sll.getSize();i++)
		{
			System.out.print(sll.getData(i) + " ");
		}
		System.out.println("\n--------------------------------\n");	
	}	
}
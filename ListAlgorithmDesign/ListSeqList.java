package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

/**
 * �ڶ���-���Ա�-�㷨�����
 * 2-11 ��дһ��������˳�������������Ԫ�صĳ�Ա����.
 * @author cquptzx
 *
 */
public class ListSeqList extends SeqList
{
	ListSeqList(SeqList sl) throws Exception
	{
		System.out.println("\n--------------------------------\n");
		for(int i = 0;i<sl.size();i++)
		{
			System.out.print(sl.getData(i) + " ");
		}
		System.out.println("\n--------------------------------\n");
	}	
}

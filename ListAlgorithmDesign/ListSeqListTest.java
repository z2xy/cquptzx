package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

public class ListSeqListTest {

	/**
	 * �ڶ���-���Ա�-�㷨�����
	 * 2-11 ��дһ��������˳�������������Ԫ�صĳ�Ա����.
	 * �����Ժ�����
	 * @author cquptzx
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SeqList seqList = new SeqList(100);
		int n = 10;
		try
		{
			for (int i = 0 ;i<n;i++)
			{
				seqList.insert(i, new Integer(i+1));
			}
			new ListSeqList(seqList);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}

}

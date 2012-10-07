package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

public class LocationSeqListTest {

	/**
	 * �ڶ���-���Ա�-�㷨�����
	 * 2-13 ��дһ��˳���λ��������.
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
			//��ʼ��˳���.
			for (int i = 0 ;i<n;i++)
			{
				seqList.insert(i, new Integer(i+1));
			}
			
			//���ö�λ�����Location����.
			int temp = ( new LocationSeqList() ).Location(seqList, 5);
			
			//��λ�������.
			if (temp<0)
			{
				System.out.println("Not Found.");
			}
			else
			{
				System.out.println("Found at index : " + temp );
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}

}

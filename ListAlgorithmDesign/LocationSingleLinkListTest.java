package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SingleLinkList;

public class LocationSingleLinkListTest {

	/**
	 * �ڶ���-���Ա�-�㷨�����
	 * 2-14 ��дһ��������λ��������.
	 * �����Ժ�����
	 * @author cquptzx
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SingleLinkList sll = new SingleLinkList();
		int n = 10;
		try
		{
			//��ʼ��˳���.
			for (int i = 0 ;i<n;i++)
			{
				sll.insert(i, new Integer(i+1));
			}
			
			//���ö�λ�����Location����.
			int temp = ( new LocationSingleLinkList() ).Location(sll, 9);
			
			//��λ�������.
			if (temp<0)
			{
				System.out.println("Not Found.");
			}
			else
			{
				System.out.println("Deleted at index : " + temp );
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}

}

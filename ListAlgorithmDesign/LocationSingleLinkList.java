package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;

public class LocationSingleLinkList 
{
	/**
	 * �ڶ���-���Ա�-�㷨�����
	 * 2-14 ��дһ��������λ��������.
	 * ɾ������Ԫ�ص�x�ĵ�һ���ڵ�.���ر�ɾ��Ԫ�ص�λ��.
	 * 
	 * ������һ��
	 * ˼·��:
	 * ʹ��getData(i)��ýڵ��Ԫ��ֵ,��x���бȽ�.
	 * -----------------------------------------------
	 	for(int i=0;i<sll.getSize();i++)
			{
				if(sll.getData(i).equals(x))
				{
					return i;
				}			
			}
		return -1;
	 *-------------------------------------------
	 * �����㡿���ֶ�λ���������˵�����SingleLinkList��getData����
	 * 			Ȼ���˷�����ʹ��index(i)��ʵ��,
	 * 	��ȡ��i��Ԫ��,��λ��Ҫi��,��ʹ��getData�����ĸ��Ӷ���O(n)
	 * 	Ȼ�������Location�㷨��ʹ����һ��ѭ��,O(n)
	 * 	��Ȼ�㷨��ʱ�临�ӶȲ���O(n*n),������ȻЧ���ǱȽϵ͵�.
	 * 
	 * 
	 * ����������
	 * ˼·��:
	 * ʹ��һ����ʱ�ڵ�ָ��,��ȡָ��ڵ�������ֵ�Ƚ�һ��,
	 * ָ���ƶ�����һ���,ֱ������������.
	 *------------------------------------------- 		
		Node current;
		int i=0;
		current = sll.getHead().getNext();
		while(current!=null)
		{		
			if((current.getElement()).equals(x))
			{
				return i;
			}
			i++;
			current=current.getNext();		
		}	
		return -1;
	 *-------------------------------------------	
	 * ��Ȼ���ַ����ĸ��Ӷ���O��n��,ֻ�Ե����������һ�α���.
	 * 
	 * @author cquptzx
	 * @throws Exception 
	 */
	public int Location(SingleLinkList sll,int x) throws Exception
	{
		Node current;
		int i=0;
		current = sll.getHead().getNext();
		while(current!=null)
		{		
			if((current.getElement()).equals(x))
			{
				return i;
			}
			i++;
			current=current.getNext();		
		}
			
		return -1;
		
		/*
		 	for(int i=0;i<sll.getSize();i++)
			{
				if(sll.getData(i).equals(x))
				{
					return i;
				}			
			}
			return -1;
		 */
		
	}
	
}

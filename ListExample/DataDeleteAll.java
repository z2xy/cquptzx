package edu.cquptzx.ListExample;

import edu.cquptzx.List.SeqList;

/**
 * ���һ����Ա����,Ҫ���˳����е���x������Ԫ�ض�ɾ��.
 * @author cquptzx
 */
public class DataDeleteAll 
{
	/**
	 * ��˳����е���x������Ԫ�ض�ɾ��.
	 * @param L ��ɾ��Ԫ�صı�.
	 * @param x	��ɾ����Ԫ��
	 * @return tag ɾ���ɹ�����1,ʧ�ܷ���-1,��Ԫ��ɾ������0;
	 * @throws Exception
	 */
	public static int DataDeleteAll (SeqList L,Object x) throws Exception
	{
		int i,tag=-1;
		for(i=0;i<L.size();i++)
		{
			if(x.equals(L.getData(i)))
			{
				L.delete(i);
				i--;
				tag=1;
			}	
			else
				tag=0;
		}
		return tag;
	}
	/**
	 * ���Գ���
	 * 1.�½�˳���.
	 * 2.ɾ��ָ��Ԫ��.
	 * 3.�����Ԫ��.
	 * @param args
	 */
	public static void main(String args[])
	{
		SeqList seqList = new SeqList(100);
		int n = 10;
		try
		{
			for(int i = 0; i<n;i++)
			{
				seqList.insert(i, new Integer(i+1));
			}
			seqList.insert(10,new Integer(5));
			
			System.out.println("\n Before Delete Data:");
			for(int i = 0 ;i<seqList.size();i++)
			{
				System.out.print(seqList.getData(i)+"  ");
			}
			
			 DataDeleteAll(seqList,new Integer(5));
			 
			System.out.println("\n After Delete Data:");
			for(int i = 0 ;i<seqList.size();i++)
			{
				System.out.print(seqList.getData(i)+"  ");
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
	}
}

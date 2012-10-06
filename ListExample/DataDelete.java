package edu.cquptzx.ListExample;
import edu.cquptzx.List.SeqList;
/**
 * Ŀ��:���һ����Ա����,Ҫ���˳����еĵ�һ�����ֵ�Ԫ��xɾ��.�����һ������������.
 * @author cquptzx
 * 
 */
public class DataDelete 
{
	/**
	 * ʵ��:����˳���,һ����xֵ��Ƚ�,�ҵ���һ��x,(��ȻҲ����û��x),Ȼ��ɾ��.
	 * @param L	��ɾ��Ԫ�صı�
	 * @param x ��ɾ����Ԫ��
	 * @return	ɾ���ɹ�����1,ɾ��ʧ�ܷ���-1;
	 * @throws Exception
	 */
	public static int DataDelete (SeqList L,Object x) throws Exception
	{
		int i;
		for(i=0;i<L.size();i++)
		{
			if(x.equals(L.getData(i)))
				break;
		}
		if(i==L.size())
			return -1;
		L.delete(i);
		return 1;		
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
			 DataDelete(seqList,new Integer(5));
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

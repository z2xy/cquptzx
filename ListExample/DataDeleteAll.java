package edu.cquptzx.ListExample;

import edu.cquptzx.List.SeqList;

/**
 * 设计一个成员函数,要求把顺序表中等于x的所有元素都删除.
 * @author cquptzx
 */
public class DataDeleteAll 
{
	/**
	 * 将顺序表中等于x的所有元素都删除.
	 * @param L 待删除元素的表.
	 * @param x	待删除的元素
	 * @return tag 删除成功返回1,失败返回-1,无元素删除返回0;
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
	 * 测试程序
	 * 1.新建顺序表.
	 * 2.删除指定元素.
	 * 3.输出表元素.
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

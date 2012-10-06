package edu.cquptzx.ListExample;
import edu.cquptzx.List.SeqList;
/**
 * 目的:设计一个成员函数,要求把顺序表中的第一个出现的元素x删除.并设计一个主函数测试.
 * @author cquptzx
 * 
 */
public class DataDelete 
{
	/**
	 * 实现:遍历顺序表,一次与x值相比较,找到第一个x,(当然也可能没有x),然后删除.
	 * @param L	待删除元素的表
	 * @param x 待删除的元素
	 * @return	删除成功返回1,删除失败返回-1;
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

package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

public class ListSeqListTest {

	/**
	 * 第二章-线性表-算法设计题
	 * 2-11 编写一个逐个输出顺序表中所有数据元素的成员函数.
	 * 【测试函数】
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

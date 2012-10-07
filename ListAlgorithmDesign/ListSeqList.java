package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

/**
 * 第二章-线性表-算法设计题
 * 2-11 编写一个逐个输出顺序表中所有数据元素的成员函数.
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

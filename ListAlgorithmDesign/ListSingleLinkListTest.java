package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SingleLinkList;

/**
 * 第二章-线性表-算法设计题
 * 2-12 编写一个逐个输出单链表中所有数据元素的成员函数.
 * 【测试函数】
 * @author cquptzx
 */
public class ListSingleLinkListTest 
{

	public static void main(String args[])
	{
		SingleLinkList sll = new SingleLinkList();
		int n = 25;
		try
		{
			for (int i = 0 ;i<n;i++)
			{
				sll.insert(i, new Integer(i+1));
			}
			(new ListSingleLinkList()).List(sll);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}
}

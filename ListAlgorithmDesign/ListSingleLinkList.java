package edu.cquptzx.ListAlgorithmDesign;
import edu.cquptzx.List.SingleLinkList;
/**
 * 第二章-线性表-算法设计题
 * 2-12 编写一个逐个输出单链表中所有数据元素的成员函数.
 * @author cquptzx
 */
public class ListSingleLinkList 
{
	public void List(SingleLinkList sll) throws Exception
	{
		System.out.println("\n--------------------------------\n");
		for(int i = 0;i<sll.getSize();i++)
		{
			System.out.print(sll.getData(i) + " ");
		}
		System.out.println("\n--------------------------------\n");	
	}	
}
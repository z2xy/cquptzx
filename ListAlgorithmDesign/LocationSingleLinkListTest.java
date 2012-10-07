package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SingleLinkList;

public class LocationSingleLinkListTest {

	/**
	 * 第二章-线性表-算法设计题
	 * 2-14 编写一个单链表定位操作函数.
	 * 【测试函数】
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
			//初始化顺序表.
			for (int i = 0 ;i<n;i++)
			{
				sll.insert(i, new Integer(i+1));
			}
			
			//调用定位对象的Location方法.
			int temp = ( new LocationSingleLinkList() ).Location(sll, 9);
			
			//定位结果处理.
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

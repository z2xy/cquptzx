package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

public class LocationSeqListTest {

	/**
	 * 第二章-线性表-算法设计题
	 * 2-13 编写一个顺序表定位操作函数.
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
			//初始化顺序表.
			for (int i = 0 ;i<n;i++)
			{
				seqList.insert(i, new Integer(i+1));
			}
			
			//调用定位对象的Location方法.
			int temp = ( new LocationSeqList() ).Location(seqList, 5);
			
			//定位结果处理.
			if (temp<0)
			{
				System.out.println("Not Found.");
			}
			else
			{
				System.out.println("Found at index : " + temp );
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}		
	}

}

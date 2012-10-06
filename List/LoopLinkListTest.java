package edu.cquptzx.List;

public class LoopLinkListTest 
{
	public static void main(String agrs[])
	{
		LoopLinkList lplklt = new LoopLinkList();
		int n = 10;
		try
		{
			for(int i = 0;i<n;i++)
			{
				lplklt.insert(i, new Integer(i+1));
			}
			lplklt.delete(4);
			for(int i = 0;i<lplklt.size;i++)
			{
				System.out.print(lplklt.getData(i)+"...end ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

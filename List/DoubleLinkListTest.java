package edu.cquptzx.List;

public class DoubleLinkListTest 
{
	public static void main(String agrs[])
	{
		DoubleLinkList doubleLinkList = new DoubleLinkList();
		int n = 10;
		try
		{
			for(int i = 0;i<n;i++)
			{
				doubleLinkList.insert(i, new Integer(i+1));
			}
			doubleLinkList.delete(4);
			for(int i = 0;i<doubleLinkList.size;i++)
			{
				System.out.print(doubleLinkList.getData(i)+" ->");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}	
	}
}

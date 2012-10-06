package edu.cquptzx.List;

public class SingleLinkListTest 
{
	public static void main(String agrs[])
	{
		SingleLinkList linkList = new SingleLinkList();
		int n = 10;
		try
		{
			for(int i = 0;i<n;i++)
			{
				linkList.insert(i, new Integer(i+1));
			}
			linkList.delete(4);
			for(int i = 0;i<linkList.size;i++)
			{
				System.out.print(linkList.getData(i)+" --> ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

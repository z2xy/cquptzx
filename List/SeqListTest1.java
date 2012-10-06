package edu.cquptzx.List;

public class SeqListTest1 
{
	public static void main(String args[])
	{
		SeqList seqList = new SeqList(100);
		int n = 10 ;
		try
		{
			for (int i = 0 ;i<n;i++)
			{
				seqList.insert(i, new Integer(i+1));
			}
			seqList.delete(4);
			
			for(int i=0;i<seqList.size;i++)
			{
				System.out.print(seqList.getData(i)+" ");
			}
			
		}
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}	
	}
}

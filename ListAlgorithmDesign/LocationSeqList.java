package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.SeqList;

public class LocationSeqList 
{
	public int Location(SeqList sl,int x) throws Exception
	{
		for(int i=0;i<sl.getSize();i++)
		{
			if(sl.getData(i).equals(x))
			{
				return i;
			}			
		}
		return -1;
	}
}

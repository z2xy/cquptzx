package edu.cquptzx.ListExample;

import java.util.Comparator;

/**
 * 设计一个实现了Compartor接口的类,实现两个整型对象的比较.
 * @author cquptzx
 *
 */
public class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		if((o1 instanceof Integer) && (o2 instanceof Integer) )
		{
			int i1 =((Integer)o1).intValue();
			int i2 =((Integer)o2).intValue();
			if(i1<=i2) return 1;
			else return -1;
		}
		else
		{
			return 0;	
		}
	}
	public boolean equals(Object obj) 
	{
		return false;
	}
}

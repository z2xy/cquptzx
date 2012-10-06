package edu.cquptzx.List;
/**
 * @param   size  		数组中当前存储的数据元素的个数. 
 * @param   maxSize  	数组中允许存储的最大的数据个数.
 * 权限问题: private		只允许该类的成员函数访问.
 * 			默认访问权限	允许该类的成员函数和同一个包中的成员函数. 
 * 构造函数: 1.确定maxSize的值.
 * 			2.初始化size的值.
 * 			3.为数组申请空间.         
 */
public class SeqList implements List
{
	final int defaultSize = 10;
	int maxSize;
	int size;
	Object [] listArray;
	public SeqList()
	{
		initiate(defaultSize);
	}
	public SeqList(int size)
	{
		initiate(size);
	}
	private void initiate(int sizeOfArray)
	{
		maxSize = sizeOfArray;
		size = 0 ;
		listArray = new Object[sizeOfArray];
	}
	/**
	 *  插入算法
	 *  可能出现的错误:
	 *  a)表满.
	 *  b)i位置不对.
	 *  1.初始化时,size置零,maxSize设置为表的长度.
	 *  2  对于插入位置,采取前插法,即元素插入在第i元素之前.
	 *  3 具体实现时,插入元素后的元素后移一位.然后插入元素,当前元素统计加1.
	 *  	maxSize=7 =>	a0,a1,a2,a3,a4,a5,a6.
	 *  	size = 5;		a0,a1,a2,a3,a4.
	 *  	i = 3;
	 *  					a0,a1,a2,ai,a3,a4.
	 * 		 size =6; 
	* */
	public void insert(int i,Object obj) throws Exception
	{
		if(size == maxSize)
		{
			throw new Exception("Full");
		}
			
		if(i<0 || i >size)
		{
			throw new Exception("i error.");
		}
		for (int j= size;j>i ;j-- )
		{
			listArray[j] = listArray[j-1];
		}
		listArray[i] = obj;
		size++;
	}
	
	/**
	 *  删除算法
	 *  可能出现的错误:
	 *  1.size==0,表示表空了.
	 *  2.i的位置不对.
	 *  删除元素时,返回删除当前元素,后面的元素前移一位.表元素总数减一.
	 *  	maxSize=7 =>	a0,a1,a2,a3,a4,a5,a6.
	 *  	size = 5;		a0,a1,a2,a3,a4.
	 *  	i = 3;
	 *  					a0,a1,a2, ,a4.
	 * 		size =4;   
	 */
	public Object delete(int i ) throws Exception
	{
		if(size == 0)
		{
			throw new Exception("is Empty!");
		}
		if(i<0 || i >size)
		{
			throw new Exception("i error.");
		}
		Object it = listArray[i];
		for (int j= i;j<size -1 ;j++ )
		{
			listArray[j] = listArray[j+1];
		}
		size--;
		return it;
	}
	/**
	 *  返回指定元素.
	 *  1.判断指定位置合法性.
	 *  2.返回元素.
	 */
	public Object getData(int i ) throws Exception
	{
		if(i<0 || i >size)
		{
			throw new Exception("i error.");
		}
		return listArray[i];
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}
	public int MoreDataDelete(SeqList L,Object x) throws Exception
	{
		int i;
		int tag =0;

		for (i=0;i<L.size ;i++ )
		{
			if(x.equals(L.getData(i)))
			{
				L.delete(i);
				i--;
				tag = 1;
			}
		}
		return tag ;
	}
}
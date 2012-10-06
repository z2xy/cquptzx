package edu.cquptzx.List;
/**
 * @param   size  		�����е�ǰ�洢������Ԫ�صĸ���. 
 * @param   maxSize  	����������洢���������ݸ���.
 * Ȩ������: private		ֻ�������ĳ�Ա��������.
 * 			Ĭ�Ϸ���Ȩ��	�������ĳ�Ա������ͬһ�����еĳ�Ա����. 
 * ���캯��: 1.ȷ��maxSize��ֵ.
 * 			2.��ʼ��size��ֵ.
 * 			3.Ϊ��������ռ�.         
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
	 *  �����㷨
	 *  ���ܳ��ֵĴ���:
	 *  a)����.
	 *  b)iλ�ò���.
	 *  1.��ʼ��ʱ,size����,maxSize����Ϊ��ĳ���.
	 *  2  ���ڲ���λ��,��ȡǰ�巨,��Ԫ�ز����ڵ�iԪ��֮ǰ.
	 *  3 ����ʵ��ʱ,����Ԫ�غ��Ԫ�غ���һλ.Ȼ�����Ԫ��,��ǰԪ��ͳ�Ƽ�1.
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
	 *  ɾ���㷨
	 *  ���ܳ��ֵĴ���:
	 *  1.size==0,��ʾ�����.
	 *  2.i��λ�ò���.
	 *  ɾ��Ԫ��ʱ,����ɾ����ǰԪ��,�����Ԫ��ǰ��һλ.��Ԫ��������һ.
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
	 *  ����ָ��Ԫ��.
	 *  1.�ж�ָ��λ�úϷ���.
	 *  2.����Ԫ��.
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
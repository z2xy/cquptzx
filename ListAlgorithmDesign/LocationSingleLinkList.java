package edu.cquptzx.ListAlgorithmDesign;

import edu.cquptzx.List.Node;
import edu.cquptzx.List.SingleLinkList;

public class LocationSingleLinkList 
{
	/**
	 * 第二章-线性表-算法设计题
	 * 2-14 编写一个单链表定位操作函数.
	 * 删除数据元素等x的第一个节点.返回被删除元素的位置.
	 * 
	 * 【方案一】
	 * 思路是:
	 * 使用getData(i)获得节点的元素值,与x进行比较.
	 * -----------------------------------------------
	 	for(int i=0;i<sll.getSize();i++)
			{
				if(sll.getData(i).equals(x))
				{
					return i;
				}			
			}
		return -1;
	 *-------------------------------------------
	 * 【不足】此种定位方法借助了单链表SingleLinkList的getData方法
	 * 			然而此方法又使用index(i)来实现,
	 * 	获取第i个元素,定位需要i次,即使用getData方法的复杂度是O(n)
	 * 	然而这里的Location算法又使用了一次循环,O(n)
	 * 	虽然算法的时间复杂度不是O(n*n),但是显然效率是比较低的.
	 * 
	 * 
	 * 【方案二】
	 * 思路是:
	 * 使用一个临时节点指针,获取指针节点数据域值比较一次,
	 * 指针移动向下一结点,直至链表遍历完成.
	 *------------------------------------------- 		
		Node current;
		int i=0;
		current = sll.getHead().getNext();
		while(current!=null)
		{		
			if((current.getElement()).equals(x))
			{
				return i;
			}
			i++;
			current=current.getNext();		
		}	
		return -1;
	 *-------------------------------------------	
	 * 显然此种方法的复杂度是O（n）,只对单链表进行了一次遍历.
	 * 
	 * @author cquptzx
	 * @throws Exception 
	 */
	public int Location(SingleLinkList sll,int x) throws Exception
	{
		Node current;
		int i=0;
		current = sll.getHead().getNext();
		while(current!=null)
		{		
			if((current.getElement()).equals(x))
			{
				return i;
			}
			i++;
			current=current.getNext();		
		}
			
		return -1;
		
		/*
		 	for(int i=0;i<sll.getSize();i++)
			{
				if(sll.getData(i).equals(x))
				{
					return i;
				}			
			}
			return -1;
		 */
		
	}
	
}

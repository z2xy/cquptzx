package edu.cquptzx.List;
public interface List
{
	public void insert(int i ,Object obj) throws Exception;			//插入
	public Object delete(int i ) throws Exception;					//删除
	public Object getData(int i ) throws Exception;					//获取i元素
	public int size();												//表数据总数
	public boolean isEmpty();										//是否为空
	
}

package edu.cquptzx.List;
public interface List
{
	public void insert(int i ,Object obj) throws Exception;			//����
	public Object delete(int i ) throws Exception;					//ɾ��
	public Object getData(int i ) throws Exception;					//��ȡiԪ��
	public int size();												//����������
	public boolean isEmpty();										//�Ƿ�Ϊ��
	
}

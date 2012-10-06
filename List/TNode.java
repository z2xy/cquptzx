package edu.cquptzx.List;

public class TNode
{
	TNode prior;
	Object element;
	TNode next;
	
	TNode( TNode nextval)
	{	
		prior = nextval;
		next = nextval;	
	}
	TNode(TNode priorval,Object obj,TNode nextval)
	{
		prior = priorval;
		element = obj;
		next = nextval;		
	}
	public TNode getPrior()
	{
		return prior;
	}
	public void setPrior(TNode priorval)
	{
		prior = priorval;
	}
	public TNode getNext()
	{
		return next;
	}
	public void setNext(TNode nextval)
	{
		next = nextval;
	}
	public Object getElement()
	{
		return element;
	}
	public void setElement(Object obj)
	{
		element = obj;
	}
	public String toString()
	{
		return element.toString();
	}
	
}

package edu.cquptzx.List;

public class SeqListTest2 
{
	public static void main(String args[])
	{
		SeqList seqList = new SeqList(100);
		Student[] student;
		student = new Student[3];
		student[0] = new Student(2000001,"张三","男",20);
		student[1] = new Student(2000002,"李四","男",20);
		student[2] = new Student(2000003,"王五","女",20);
		
		int n = 3;
		try
		{
			for(int i = 0;i<n;i++)
			{
				seqList.insert(i, student[i]);
			}
			for(int i = 0;i<seqList.size;i++)
			{
				Student st = (Student)seqList.getData(i);
				System.out.println(st.getNumber()+"  " + st.getName() + "  " + st.getSex()+ "  "+ st.getAge());
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
class Student
{
	private long number ;
	private String name;
	private String sex;
	private int age;
	Student(long number,String name,String sex,int age)
	{
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public long getNumber()
	{
		return number;	
	}
	public String getName()
	{
		return name;		
	}
	public String getSex()
	{
		return sex;		
	}
	public int getAge()
	{
		return age;		
	}
}

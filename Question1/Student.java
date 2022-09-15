package Question1;

import java.util.Scanner;

public class Student {

	private int rollno;
	private String sname;
	private String saddress;
	private StudentResult srobj;
	
	static Scanner sc=new Scanner(System.in);
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	public static void main(String[] args) throws Exception {
		
		StudentResult sr=new StudentResult();
		System.out.println("Enter the marks of Math1");
		int math1=sc.nextInt();
		sr.setMath1(math1);
		System.out.println("Enter the marks of Math2");
		int math2=sc.nextInt();
		sr.setMath2(math2);
		System.out.println("Enter the marks of Science");
		int sci=sc.nextInt();
		sr.setScience(sci);
		System.out.println("Enter the marks of Mechanics");
		int mecha=sc.nextInt();
		sr.setMechanics(mecha);
		System.out.println("Enter the marks of Computer Science");
		int cs=sc.nextInt();
		sr.setComputerScience(cs);
		System.out.println("Enter the marks of Electrical");
		int ele=sc.nextInt();
		sr.setElectrical(ele);
//		Student stu=new Student();
//		stu.setSrobj(sr);;
//		System.out.println(stu.getSrobj().getMath1());
//	
		
		try
		{
			if(math1<0 || math2<0 || sci<0 || mecha<0 || cs<0 || ele<0)
			{
				throw new Exception("Negative marks not allowed");
			}
			else
			{
				System.out.println("thanks for input");
			}
				if((math1+math2+sci+mecha+cs+ele)<240) 
				{
				throw new Exception("failed");
				}
				else
				{
					System.out.println("you are passed");
				}
			
			if(math1<35 || math2<35 || sci<35 || mecha<35 || cs<35 || ele<35)
			{
			throw	new  Exception("you are failed");
			}
			else
			{
				System.out.println("you are pass");
			}
			
		}
		catch(ResultException1 e)
		{
			e.printStackTrace();
		}
		catch(ResultException r)
		{
			System.out.println(r);
			
		}
		catch(ResultException2 re) {
			System.out.println(re);
		}
	}
}

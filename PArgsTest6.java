package kougi6;

public class PArgsTest6 {
	int no;
	static int count=0;
	public static void setNo(PArgsTest6 student,int p_no) {
		student.no=p_no;
		student.no++;
		student=new PArgsTest6();
		student.no=2032777;
	}
	PArgsTest6(){
		count++;
	}
}

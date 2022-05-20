package kougi6;

public class NArgsTest5 {
	int no;
	public static void main(String[] args) {
		int i=2032999;
		NArgsTest5 kodai=new NArgsTest5();
		setNo(kodai,i);
		System.out.println("1: no = "+kodai.no+" i = "+i);
		setNo(kodai,2032888);
		System.out.println("2: no = "+kodai.no+" i = "+i);
	}
	public static void setNo(NArgsTest5 student, int p_no) {
		student.no=p_no;
		student.no++;
		student=new NArgsTest5();
		student.no=2032777;
	}
}

package kougi6;

public class MArgsTest4 {
	int no;
	public static void main(String[] args) {
		int i=2032999;
		MArgsTest4 kodai=new MArgsTest4();
		kodai.setNo(i);
		System.out.println("1: no = "+kodai.no+" i = "+i);
		kodai.setNo(2032888);
		System.out.println("2: no = "+kodai.no+" i = "+i);
	}
	public void setNo(int p_no) {
		no=p_no;
		p_no++;
	}
}

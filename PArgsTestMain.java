package kougi6;

public class PArgsTestMain {
	public static void main(String[] args) {
		int i=2032999;
		PArgsTest6 kodai=new PArgsTest6();
		PArgsTest6.setNo(kodai,i);
		System.out.println("1: no = "+kodai.no+" i = "+i);
		System.out.println(PArgsTest6.count);
		PArgsTest6.setNo(kodai,2032888);
		System.out.println("2: no = "+kodai.no+" i = "+i);
		System.out.println(PArgsTest6.count);
		PArgsTest6.setNo(kodai,2032888);
		System.out.println("2: no = "+kodai.no+" i = "+i);
		System.out.println(PArgsTest6.count);
	}
}
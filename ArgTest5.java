package kougi5;

public class ArgTest5 {
	public static void main(String args[]) {
		String topArg="";

		for(int i=0;i<args.length;i++) {
			topArg=args[i];
			for(int j=topArg.length()-1;j>=0;j--) {
				topArg.charAt(j);
				System.out.print(topArg.charAt(j));
			}
			System.out.print(" ");
		}
	}
}


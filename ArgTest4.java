package kougi5;

public class ArgTest4 {
	public static void main(String args[]) {
		String topArg="";
		if(args.length>0) {
			for(int i=args.length-1;i>=0;i--) {
				topArg=args[i];
				System.out.print(topArg);
				System.out.print(" ");
			}
		}else {
			System.out.print("");
		}
	}
}

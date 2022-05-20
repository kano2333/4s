package kougi5;

public class ArgsTest3 {
	public static void main(String args[]) {
		String topArg="";
		if(args.length>=1)topArg=args[0];
		int a=topArg.charAt(0);
		
		for(int i=0;i<args.length;i++) {
			topArg=args[i];
			for(int j=0;j<topArg.length();j++) {
				topArg.charAt(j);
				if(!(topArg.charAt(j)==a)) System.out.print(topArg.charAt(j));
			}
			System.out.print(" ");
		}
	}
}

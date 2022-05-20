package kougi5;

public class Sum2 {
	public static void main(String args[]) {
		String topArg="";
		int sum=0;
		if(args.length>1) {
			System.out.print(args[0]);
		
			for(int i=0;i<args.length;i++) {
				topArg=args[i];
				if(i>0)System.out.print("+"+topArg);
				sum=sum+Integer.parseInt(topArg);
			}
			System.out.print("="+sum);
		}else if(args.length==1) {
			System.out.print(args[0]+"="+args[0]);
		}else {
			System.out.print("");
		}
	}
}

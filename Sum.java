package kougi5;

public class Sum {
	public static void main(String args[]) {
		String topArg="";
		int sum=0;
		System.out.print(args[0]);
		
		for(int i=0;i<args.length;i++) {
			topArg=args[i];
			if(i>0)System.out.print("+"+topArg);
			sum=sum+Integer.parseInt(topArg);
		}
		System.out.print("="+sum);
	}
}

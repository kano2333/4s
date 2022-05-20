package enshu2_2021;

public class SetGradeSample3 {
	public static void main(String[] args) {
		CitStudent3 kodai=new CitStudent3(2032999,"工大  太郎",2);
		
		kodai.grade=80;
		showGrade(kodai);
	}
	public static void showGrade(CitStudent3 data) {
		System.out.println("No: "+data.getNo()+" "+data.getName()+" "+data.grade);
	}
}
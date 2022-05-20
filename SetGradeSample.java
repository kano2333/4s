package kougi5;

public class SetGradeSample {
	public static void main(String[] args) {
		CitStudent2 kodai=new CitStudent2();
		kodai.setNo(2032999);
		kodai.name="工大　太郎";
		kodai.year=2;
		kodai.grade=80;
		showGrade(kodai);
	}
	public static void showGrade(CitStudent2 data) {
		System.out.println("No: "+data.getNo()+" "+data.name+" "+data.grade);
	}
}

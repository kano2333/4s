package enshu2_2021;

public class SetGradeSample2 {
	public static void main(String[] args) {
		CitStudent2 kodai=new CitStudent2();
		kodai.setNo(2032999);
		kodai.setName("工大  太郎");
		kodai.setYear(2);
		kodai.setGrade(80);
		showGrade(kodai);
	}
	public static void showGrade(CitStudent2 data) {
		System.out.println("No: "+data.getNo()+" "+data.getName()+" "+data.getGrade());
	}
}
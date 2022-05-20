package enshu2_2021;

public class tsuika1 {
	public static void main(String[] args) {
		tsuikaSample1 student=new tsuikaSample1(89,45,75,450,6);
		showGrade(student);
	}
	public static void showGrade(tsuikaSample1 data) {
		System.out.println(data.getHigt()+" "+data.getLow()+" "+data.getAve()+" "+data.getTotal()+" "+data.getNum());
	}
}

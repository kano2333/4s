package enshu2_2021;

public class CitStudent3 {
	int no;
	String name;
	int year;
	int grade;
	int department;
	CitStudent3(){
		no=year=grade=department=0;
		name="";
	}
	CitStudent3(int p_no,String p_name){
		no=p_no;
		name=p_name;
		year=grade=department=0;
	}
	CitStudent3(int p_no,String p_name,int p_year){
		no=p_no;
		name=p_name;
		year=p_year;
		grade=department=0;
	}
	public void setNo(int p_no) {
		no=p_no;
	}
	public int getNo() {
		return no;
	}
	public void setName(String p_name) {
		name=p_name;
	}
	public String getName() {
		return name;
	}
	public void setYear(int p_year) {
		year=p_year;
	}
	public int getYear() {
		return year;
	}
}
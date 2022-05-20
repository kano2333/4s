package enshu2_2021;

public class tsuikaSample1 {
	int higt;
	int low;
	double ave;
	int total;
	int num;
	tsuikaSample1(){
		higt=low=total=num=0;
		ave=0;
	}
	tsuikaSample1(int p_higt,int p_low,double p_ave,int p_total,int p_num){
		higt=p_higt;
		low=p_low;
		ave=p_ave;
		total=p_total;
		num=p_num;
	}
	public void setHigt(int p_higt) {
		higt=p_higt;
	}
	public int getHigt() {
		return higt;
	}
	public void setLow(int p_low) {
		low=p_low;
	}
	public int getLow() {
		return low;
	}
	public void setHigt(double p_ave) {
		ave=p_ave;
	}
	public double getAve() {
		return ave;
	}
	public void setTotal(int p_total) {
		total=p_total;
	}
	public int getTotal() {
		return total;
	}
	public void incNum(int p_num) {
		num=p_num;
	}
	public int getNum() {
		return num;
	}
	public void addScore(int score) {
		higt=score;
	}
}

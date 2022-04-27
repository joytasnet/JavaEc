package day1;

public class Wand {
	private String name;
	private double power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("名前が短すぎる処理を中断");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if(power < 0.5 || power >100) {
			throw new IllegalArgumentException("値が不正です");
		}
		this.power = power;
	}
}

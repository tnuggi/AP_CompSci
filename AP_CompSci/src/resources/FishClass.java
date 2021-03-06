package resources;

import java.util.Random;

public class FishClass {
	
	private static final double EPSILON = 0.00001; 
	private int numberScales;
	private double weight;
	Random r = new Random();
	private String name;
	
	public FishClass(){
		weight = 1;
		numberScales = 40;
		name = "fishy";
	}
	public FishClass(double wei){
		weight = wei;
		name = "fishy";
	}
	public FishClass(double wei, String Name){
		weight = wei;
		name = Name;
	}
	public void eatMinnow() {
		weight +=.25;
	}
	public void eatPlanton() {
		Random planktonNumb = new Random();
		weight+=(planktonNumb.nextInt(10)+1)*.1;
	}
	public void eatWorms(int wor) {
		weight+= wor*.4;
	}
	public double getWeight() {
		return weight;
	}
	public void setScales(int scal) {
		numberScales = scal;
	}
	public int getNumScales() {
		return numberScales;
	}
	public void sharkBite() {
		weight-=r.nextDouble();
		numberScales-=r.nextInt(35);
	}
	public void setName(String Name) {
		name = Name; 
	}
	public String getName() {
		return name; 
	}
	public String toString() {
		return "Name:  "  +getName() + ", Number Scales: " + getNumScales() + ", Wieght: " + getWeight();
	}
	public boolean equals(FishClass f) {
		boolean isEqual = false;
		
		if (f.getNumScales() == this.getNumScales() && doubleEquals(f.getWeight(), this.getWeight()) && f.getName().contentEquals(this.getName())) {
			isEqual = true;
		}
		
		return isEqual;
	}
	private boolean doubleEquals(double a, double b) {
		if (Math.abs(a-b) < EPSILON) {
			return true;
		}
		return false;
	}
}

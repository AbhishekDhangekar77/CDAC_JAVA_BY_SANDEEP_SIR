package org.BodyMassIndex;

public class BodyMassIndexFields {
	private float height;
	private int weight;
	private float bmi;

	public void solve()
	{
		this.bmi=weight/(height*height);
		this.setBmi(this.bmi);
	}
	//public BodyMassIndexFields() {
	//}
	//
	//public BodyMassIndexFields(float height, int weight, float bmi) {
//		this.height = height;
//		this.weight = weight;
//		this.bmi = bmi;
	//}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public float getBmi() {
		return bmi;
	}
	public void setBmi(float bmi) {
		this.bmi = bmi;
	}
}

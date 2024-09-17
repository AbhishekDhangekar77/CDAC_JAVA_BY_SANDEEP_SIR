package org.BodyMassIndex;

public class BodyMassIndex {
	public static void main(String[] args) {
		BodyMassIndexutil b =new BodyMassIndexutil();
		
		b.acceptrecord();
		b.printrecord();
		String str=b.toString();
		System.out.println(str);
	}

}

package org.Compoundintrest;

public class CompoundIntrestFields {
private int principal;
private float rate;
private int year;
private float final_value;
private float compound_intrest;
private int noofcompounds;
 
public CompoundIntrestFields() {
	
}
public CompoundIntrestFields(int principal, float rate, int year, float final_value, float compound_intrest,
		int noofcompounds) {
	this.principal = principal;
	this.rate = rate;
	this.year = year;
	this.final_value = final_value;
	this.compound_intrest = compound_intrest;
	this.noofcompounds = noofcompounds;
}
public void finalvaluecalculation()
{
	final_value = (float)(principal*Math.pow((1+(rate/100)/noofcompounds),(noofcompounds*year)));
	setFinal_value(this.final_value);
    compound_intrest= (float)final_value- principal;
    System.out.println(final_value);
    System.out.println("rate"+rate);
    System.out.println("no on comp"+noofcompounds);
    System.out.println("year"+year);
    System.out.println("prince"+principal);
    System.out.println();
//	this.compound_intrest=(float)final_value-principal;	
//   this.setCompound_intrest(this.compound_intrest);

}	
public int getPrincipal() {
	return principal;
}

public void setPrincipal(int principal) {
	this.principal = principal;
}

public float getRate() {
	return rate;
}

public void setRate(float rate) {
	this.rate = rate;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public float getFinal_value() {
	return final_value;
}

public void setFinal_value(float final_value) {
	this.final_value = final_value;
}

public float getCompound_intrest() {
	return compound_intrest;
}

public void setCompound_intrest(float compound_intrest) {
	this.compound_intrest = compound_intrest;
}

public int getNoofcompounds() {
	return noofcompounds;
}

public void setNoofcompounds(int noofcompounds) {
	this.noofcompounds = noofcompounds;
}

@Override
public String toString() {
	return "CompoundIntrestFields [principal=" + principal + ", rate=" + rate + ", year=" + year + ", final_value="
			+ final_value + ", compound_intrest=" + compound_intrest + ", noofcompounds=" + noofcompounds + "]";
}

	
}



package org.Discountcalculation;

public class DiscountcalculationFields {
	private int original_price;
	private float discount_rate ;
	private float discount_amount;
	private float final_amount;
	public void calculatediscount() {
		this.discount_amount=this.original_price*this.discount_rate/100;
		this.final_amount=this.original_price-(int)this.discount_amount;
		this.setDiscount_amount(this.discount_amount);
		this.setFinal_amount(this.final_amount);
	}
	public int getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(int original_price) {
		this.original_price = original_price;
	}
	public float getDiscount_rate() {
		return discount_rate;
	}
	public void setDiscount_rate(float discount_rate) {
		this.discount_rate = discount_rate;
	}
	public float getDiscount_amount() {
		return discount_amount;
	}
	public void setDiscount_amount(float discount_amount) {
		this.discount_amount = discount_amount;
	}
	public float getFinal_amount() {
		return final_amount;
	}
	public void setFinal_amount(float final_amount) {
		this.final_amount = final_amount;
	}
}

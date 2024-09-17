package org.TollRevenueCalculation;

public class TollRevenueFields {

	private int ch;
	private int car_rate;
	private int truck_rate;
	private int motorcycle_rate;
	private int a=1;
	private int c_count=0;
	private int t_count=0;
	private int m_count=0;
	private int c_sum=0;
	private int t_sum=0;
	private int m_sum=0;
	private int total=0;	
	private int total_v=0;
	public TollRevenueFields()
	{
		System.out.println("Default rates if you do not enter rates");
		 this.car_rate=50;
		 this.truck_rate=100;
		 this.motorcycle_rate=30;
		 System.out.println("Car        :"+car_rate);
		 System.out.println("Truck      :"+truck_rate);
		 System.out.println("Motorcycle :"+motorcycle_rate);
	}
	public void addvehical(int x)
	{
		switch (x) {
		case 1:
		{
			this.c_sum=c_sum+car_rate;
			setC_sum(this.c_sum);
			c_count++;
		}			
			break;
		case 2:
			{
				this.t_sum=t_sum+this.truck_rate;
				setT_sum(this.t_sum);
				t_count++;
			}				
				break;		
		case 3:
	    	{
		     	this.m_sum=m_sum+this.motorcycle_rate;
		     	setM_sum(this.m_sum);
			  	m_count++;
			}					
					break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}
	public void calculateRevenue()
	{
		total=this.m_sum+this.t_sum+this.c_sum;
		setTotal(this.total);
		total_v=m_count+c_count+t_count;
		setTotal_v(total_v);
		System.out.println();
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getCar_rate() {
		return car_rate;
	}
	public void setCar_rate(int car_rate) {
		this.car_rate = car_rate;
	}
	public int getTruck_rate() {
		return truck_rate;
	}
	public void setTruck_rate(int truck_rate) {
		this.truck_rate = truck_rate;
	}
	public int getMotorcycle_rate() {
		return motorcycle_rate;
	}
	public void setMotorcycle_rate(int motorcycle_rate) {
		this.motorcycle_rate = motorcycle_rate;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	public int getT_count() {
		return t_count;
	}
	public void setT_count(int t_count) {
		this.t_count = t_count;
	}
	public int getM_count() {
		return m_count;
	}
	public void setM_count(int m_count) {
		this.m_count = m_count;
	}
	public int getC_sum() {
		return c_sum;
	}
	public void setC_sum(int c_sum) {
		this.c_sum = c_sum;
	}
	public int getT_sum() {
		return t_sum;
	}
	public void setT_sum(int t_sum) {
		this.t_sum = t_sum;
	}
	public int getM_sum() {
		return m_sum;
	}
	public void setM_sum(int m_sum) {
		this.m_sum = m_sum;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_v() {
		return total_v;
	}
	public void setTotal_v(int total_v) {
		this.total_v = total_v;
	}

	public String toString() {
		return "TollRevenueFields car_rate=" + car_rate + ", truck_rate=" + truck_rate + ", motorcycle_rate="
				+ motorcycle_rate + ", c_count=" + c_count + ", t_count=" + t_count + ", m_count=" + m_count
				+ ", total=" + total + ", total_v=" + total_v ;
	}	
	
}

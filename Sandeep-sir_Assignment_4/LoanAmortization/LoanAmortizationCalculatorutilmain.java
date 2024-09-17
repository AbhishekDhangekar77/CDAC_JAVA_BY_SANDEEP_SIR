 package org.javastudy;
import java.util.*;
public class LoanAmortizationCalculatorutilmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoanAmortizationCalculatorutil calculatorUtil = new LoanAmortizationCalculatorutil();
		int choice;
		while ((choice = calculatorUtil.menuList(sc)) != 0) {
			switch (choice) {
			case 1:
					calculatorUtil.acceptRecord(sc);
					break;
			case 2:
					calculatorUtil.printRecord();
					break;
					
			default:
					System.out.println("Wrong Choice");
				}
				
				
			}

		sc.close();	}

		}


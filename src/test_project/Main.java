package test_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	/* Объявление переменных (коэффициентов кв. ур)*/
	
	//1) ввод переменных
	//2) подготовка переменных
	//3) находим дискриминант
	//4) выводим результаты согласно вычислениям.
	
	public static double inputCoef() {
		double num = 0;
		try {
			//@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			System.out.println("Введите коэффициент:");
			num = in.nextFloat();
		} catch (Exception e) {
			System.out.print(e.getMessage()); //try to find out specific reason.
		}
		return num;
        
	}
	
	public static double PrepareCoef (double num1, double num2) {
		
		return (num1 - num2);	
	}
	
	public static double[] findX (double a, double b, double c) {
		
		double []x = null;
		
		double Disc = (b * b) - 4 * a * c;
		
		if (Disc > 0) {
			
			double sqrtD = Math.sqrt (Disc);
			x = new double [2];
			x[0] = (-b + sqrtD) / (2*a);
			x[1] = (-b - sqrtD) / (2*a);
		}
		else if (Disc == 0) {
			
			x = new double [1];
			x[0] = -b / (2*a);
		}	
		
		return x;
	}
	
	
	public static void getResult (double[] x) {
		
		if (x != null) {
			
			for(int i = 0; i < x.length; i++) {
				
				System.out.println ("X"+(i+1) + " = " + x[i]);
			}
		}
		else {
			
			System.out.println ("Нет корней");
		}
		
	}
	
	public static void main(String[] args) {
		
		double a = inputCoef();
	    double b = inputCoef();
	    double c = inputCoef();
        double d = inputCoef();
        
        System.out.println(a + " x^2 + " + b + " x + "  + c + " = " + d);

        c = PrepareCoef ( c, d );
        d = PrepareCoef ( d, d );
        System.out.println(a + " x^2 + " + b + " x + "  + c + " = " + d);
        
        getResult (findX (a, b, c));
        
        
        
	}
	
	
}


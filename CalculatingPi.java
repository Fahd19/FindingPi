package major;
import java.lang.Math.*;
import java.util.Random;

public class CalculatingPi {
	
	public static void main(String[] args){
		
		final double myPi = java.lang.Math.PI;
		double angle;
		int a = 0, b = 0;
		double start, finish;
		for (int i=0; i<100000000; i++){
			angle = Math.random()*(2*myPi);
			finish = Math.abs(Math.cos(angle));
			start = Math.random();
			if((start+finish)<1){
				a+=1;
			}else b+=1;
		}
		
		double answer = ((((double)a)+((double)b))/((double) b))*2;
		System.out.println(answer);
	}
}

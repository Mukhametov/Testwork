package ru.naobit.testwork.util;

import java.text.DecimalFormat;

public class Timer {
	private Long t1;
	private Long t2;

	public void start() {
		 t1 = System.nanoTime();
	}

	public void finish() {
		 t2 = System.nanoTime();
	}

	public void showResult(){
		if (t1 == null || t2 == null || t1 > t2){
			System.err.println("Timer error!");
			return;
		}
		
		System.out.println("Time: " + new DecimalFormat("###,###").format(t2 - t1) + " ns");
	}
}

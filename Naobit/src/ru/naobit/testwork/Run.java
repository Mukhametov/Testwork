package ru.naobit.testwork;

import java.util.Arrays;
import java.util.Random;

import ru.naobit.testwork.util.Timer;

public class Run {

	public static void main(String[] args) {

		IRemember iRemember = RememberFactory.getIRemember();

		Random random = new Random();
		Timer timer = new Timer();

		// ******************* Add test ********************

		timer.start();
		for (int i = 0; i < 1_000; i++) {
			iRemember.remember(random.nextInt());
		}
		timer.finish();
		System.out.println("Add test");
		timer.showResult();

		// ******************* Get test ********************

		timer.start();
		for (int i = 0; i < 10; i++)
			iRemember.getLast100();
		timer.finish();
		System.out.println("Get test");
		timer.showResult();

		// ******************* Test Sync ********************

		iRemember = new DigitRememberSync();

		// ******************* Add test ********************

		timer.start();
		for (int i = 0; i < 1_000; i++) {
//			iRemember.remember(random.nextInt());
			iRemember.remember(i);
		}
		timer.finish();
		System.out.println("Add test sync");
		timer.showResult();

		// ******************* Get test ********************

		timer.start();
		for (int i = 0; i < 10; i++)
			iRemember.getLast100();
		timer.finish();
		System.out.println("Get test sync");
		timer.showResult();

		///////////////////////////
		
		System.out.println(Arrays.toString(iRemember.getLast100()));
		
	}

}

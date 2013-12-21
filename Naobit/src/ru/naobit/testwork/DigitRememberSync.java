package ru.naobit.testwork;

public class DigitRememberSync implements IRemember{
	
	private IRemember iRemember = RememberFactory.getIRemember();
	
	@Override
	synchronized public void remember(int digit) {
		iRemember.remember(digit);
	}

	@Override
	synchronized public int[] getLast100() {
		return iRemember.getLast100();
	}

}

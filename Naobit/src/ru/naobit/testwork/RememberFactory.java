package ru.naobit.testwork;

public class RememberFactory {
	
	private static IRemember iRemember;
	private static IRemember iRememberSync;
	
	private RememberFactory() {
	}
	
	public static IRemember getIRemember(){
		if (iRemember == null){
			synchronized (RememberFactory.class) {
				if (iRemember == null)
					iRemember = new DigitRemember();
			}
		}
		return iRemember;
	}
	
	public static IRemember getIRememberSync(){
		if (iRememberSync == null){
			synchronized (RememberFactory.class) {
				if (iRememberSync == null)
					iRememberSync = new DigitRemember();
			}
		}
		return iRememberSync;
	}

}

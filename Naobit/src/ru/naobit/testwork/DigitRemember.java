package ru.naobit.testwork;

import java.util.LinkedList;
import java.util.List;

public class DigitRemember implements IRemember{

	private int MAX_LENGTH = 100;
	private List<Integer> list = new LinkedList<>();
	
	@Override
	public void remember(int digit) {
		if (list.size()>=MAX_LENGTH)
			list.remove(MAX_LENGTH-1);
		list.add(0, digit);
	}

	@Override
	public int[] getLast100() {
		int result[] = new int[list.size()];
		for (int i=0; i < list.size(); i++){
			result[i] = list.get(i);
		}
		return result;
	}
}

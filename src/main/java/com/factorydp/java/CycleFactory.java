package com.factorydp.java;

public class CycleFactory {
	public static Cycle createCycle(int wheels) {
		if(wheels == 1) {
			return new UniCycle(wheels);
		}
		else if(wheels == 2) {
			return new BiCycle(wheels);
		}
		else if(wheels == 3) {
			return new TriCycle(wheels);
		}
		else {
			throw new IllegalArgumentException("Cycle type not supported");
		}
	}

}

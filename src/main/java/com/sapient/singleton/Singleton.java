package com.sapient.singleton;

public class Singleton {
	
	private static Singleton firstSingleton = null;
	
	public Singleton() throws InstantiationException {
		if(Singleton.firstSingleton != null){
			throw new InstantiationException("go to hell");
		}
	}
	
	public static Singleton getInstance(Singleton firstSingleton) throws InstantiationException {
		if (firstSingleton == null) {
			firstSingleton = new Singleton();
		}
		return firstSingleton;
	}
}

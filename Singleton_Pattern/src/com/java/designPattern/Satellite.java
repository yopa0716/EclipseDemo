package com.java.designPattern;

/*we have to make the satellite class as singleton
bez we required only one instance of this class*/
public class Satellite {

	private static Satellite instance;

	/*
	 * To make class as singleton we need to make constructor as private so
	 * no-one can create object by NEW keyword;
	 */
	private Satellite() {

	}

	private static class SatelliteHelper {
		private static final Satellite innerInstance = new Satellite();
	}

	public static Satellite getInstance() {
		return SatelliteHelper.innerInstance;
	}

}

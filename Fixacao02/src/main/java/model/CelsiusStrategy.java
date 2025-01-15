package model;

public class CelsiusStrategy implements ConversionStrategy{

	@Override
	public double conversion(double value) {
		return (value*1.8) + 32;
	}

}

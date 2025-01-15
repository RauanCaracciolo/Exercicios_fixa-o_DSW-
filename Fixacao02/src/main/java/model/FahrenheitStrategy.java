package model;

public class FahrenheitStrategy implements ConversionStrategy{

	@Override
	public double conversion(double value) {
		return (value-32) /1.8;
	}
}

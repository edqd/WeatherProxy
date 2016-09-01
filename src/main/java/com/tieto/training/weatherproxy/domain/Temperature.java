package com.tieto.training.weatherproxy.domain;

/**
 * @author vojtajin Core units are degrees Celsius
 *
 */
public class Temperature {
	private final int temperature;

	public Temperature(int temperature) {
		super();
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public static int convertCelsiustoFahrenheit(int temperature) {
		return ((9 * temperature) / 5) + 32;
	}
}

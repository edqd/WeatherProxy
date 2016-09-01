package com.tieto.training.weatherproxy.domain;

/**
 * Value class for information on wind
 * Units used for speed are m/s and degrees for direction with 0/360 pointing towards north.
 * @author vojtajin
 *
 */

public class Wind {
	private final int speed;
	private final int direction;

	public Wind(int speed, int direction) {
		super();
		this.speed = speed;
		this.direction = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDirection() {
		return direction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + direction;
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wind other = (Wind) obj;
		if (direction != other.direction)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", direction=" + direction + "]";
	}

}

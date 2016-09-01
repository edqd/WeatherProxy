package com.tieto.training.weatherproxy.domain;

public class Location {
	private final String city;
	private final String country;

	public Location(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
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
		Location other = (Location) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", country=" + country + "]";
	}

}

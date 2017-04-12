package com.miw.hotel.model;

import java.math.BigDecimal;

public class Room {

	private int id;
	
	private Hotel hotel;
	
	private BigDecimal pricePerHour;
	
	private RoomType type;
	
	public Room() {}

	public Room(int id, Hotel hotel, BigDecimal pricePerHour, RoomType type) {
		super();
		this.id = id;
		this.hotel = hotel;
		this.pricePerHour = pricePerHour;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public BigDecimal getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(BigDecimal pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Room {id=" + id + ", hotel=" + hotel + ", pricePerHour=" + pricePerHour + ", type=" + type + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + id;
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
		Room other = (Room) obj;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
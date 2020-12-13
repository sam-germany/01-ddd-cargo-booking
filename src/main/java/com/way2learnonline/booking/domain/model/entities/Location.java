package com.way2learnonline.booking.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Location class represented by a unique 5-diigit UN Location code.
 */
@Embeddable
public class Location {

	@Column(name = "origin_id")
	private String unLocCode;

	public Location() {   }                                                      // no-args  constructor

	public Location(String unLocCode) {
		this.unLocCode = unLocCode;
	}            // (string) args constructor

	public void setUnLocCode(String unLocCode) {
		this.unLocCode = unLocCode;
	}   //setter method

	public String getUnLocCode() {
		return this.unLocCode;
	}                      //getter method
}

package com.way2learnonline.booking.domain.model.aggregates;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Aggregate Identifier for the Cargo Aggregate
 */
@Embeddable
public class BookingId implements Serializable {

    @Column(name="booking_id",length = 500)
    private String bookingId;

    public BookingId(){}                                       // no-args constructor

    public BookingId(String bookingId){                        // string-args  constructor
          this.bookingId = bookingId;
    }

    public String getBookingId(){
               return this.bookingId;
    }     // getter method only
}

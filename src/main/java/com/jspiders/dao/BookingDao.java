package com.jspiders.dao;

public interface BookingDao {
    void addBooking();
    void getBooking(Long id);
    void updateBooking(Long id);
    void deleteBooking(Long id);
}

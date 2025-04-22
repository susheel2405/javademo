package com.neoteric.javademo.bookmyshowdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;

public class BookingService {

    public String bookTicket(String userName, String movieName, String method){
        String orderId = "ORD-" + UUID.randomUUID();
        try (Connection con = DataBaseConnection.getConnection()){
            String query = "INSERT INTO book_my_show(order_id, user_name, movie_name, payment_method, status) VALUES (?, ?, ?, ?, 'PENDING') ";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, orderId);
            ps.setString(2, userName);
            ps.setString(3, movieName);
        }catch (Exception e){

        }
        return orderId;
    }
}


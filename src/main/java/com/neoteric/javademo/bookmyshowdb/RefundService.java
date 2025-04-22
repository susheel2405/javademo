package com.neoteric.javademo.bookmyshowdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class RefundService {

    public String initiateRefund(String orderId, String paymentId){
        Map<String, String> paymentTables = new HashMap<>();
        paymentTables.put("razorpay", "rzr_pay");
        paymentTables.put("phonepe", "phn_pe");

        try (Connection con = DataBaseConnection.getConnection()){
            String statusQuery = "SELECT status, payment_method FROM book_my_show WHERE order_id=?";
            PreparedStatement statusPs = con.prepareStatement(statusQuery);
            statusPs.setString(1, orderId);
            ResultSet rs = statusPs.executeQuery();

            if (rs.next()){
                String status = rs.getString("status");
                String method = rs.getString("payment_method");
                if (status.equals("CANCELLED")){
                    return "Refund already Processed";
                } else if (status.equals("Confirmed")) {

                    String table = paymentTables.getOrDefault(method.toLowerCase(),null);

                    if (table == null){
                        throw new RuntimeException("Unsupported payment methid for refund:" + method);
                    }

                    String refundUpdate = "UPDATE" + table + "SET status = 'REFUNDED' WHERE payment_id=?";
                    PreparedStatement refundPs = con.prepareStatement(refundUpdate);
                    refundPs.setString(1, paymentId);
                    refundPs.executeUpdate();

                    String orderUpdate = "UPDATE book_my_show SET status = 'CANCELLED' WHERE order_id=?";
                    PreparedStatement orderPs = con.prepareStatement(orderUpdate);
                    orderPs.setString(1, orderId);
                    orderPs.executeUpdate();

                    return "Refund processed Successfully";
                }else {
                    throw new RuntimeException("Refund cannot be processed. Current ticket status: " + status);
                }
            }else {
                throw new RuntimeException("Order ID not found.");
            }
        }catch (Exception e){
            throw new RuntimeException("Refund failed: " + e.getMessage());

        }
    }
}

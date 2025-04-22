package com.neoteric.javademo.bookmyshowdb;

import java.sql.Connection;
import java.sql.PreparedStatement;

public abstract  class PaymentProcessor implements PaymentGateway{


    protected abstract String getPaymentTable();
    protected abstract String generatePaymentId();

    @Override
    public String makePayment(String orderId, double amount){
        String paymentId = generatePaymentId();

        try (Connection connection = DataBaseConnection.getConnection()){
            String paymentQuery = "INSERT INTO" + getPaymentTable() + "  (payment_id, order_id, amount, status) VALUES (?, ?, ?, 'PAID')";
            PreparedStatement ps = connection.prepareStatement(paymentQuery);
            ps.setString(1, paymentId);
            ps.setString(2, orderId);
            ps.setDouble(3, amount);
            ps.executeUpdate();

            String updaateOrder = " UPDATE book_my_show SET status = 'CONFIRMED' WHERE order_id = ?";
            PreparedStatement updatePS = connection.prepareStatement(updaateOrder);
            updatePS.setString(1, orderId);
            updatePS.executeUpdate();

        }catch (Exception e){
            throw new RuntimeException(getClass().getSimpleName() + "payment failed: " + e.getMessage());
        }

        return paymentId;
    }

}

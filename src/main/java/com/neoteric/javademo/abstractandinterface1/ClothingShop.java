//package com.neoteric.javademo.abstractandinterface1;
//
//import java.util.Scanner;
//
//public class ClothingShop extends ShoppingMall{
//
//
//    @Override
//    public void generateBill(String customerNAme, double amount) {
//        logCustomer(customerNAme);
//
//        Scanner scanner = new Scanner(System.in);
//        String brand = "USPA";
//        System.out.println("Catogery: Clothing");
//        System.out.println("Brand: " + brand);
//        System.out.println("Enter clothing type (T-Shirt, Jeans,Shirts");
//
//        String type = scanner.nextLine();
//
//        double discountAmount = amount - (amount * 0.20);
//        System.out.println("Clothing Type: " + type);
//        System.out.println("Original Amount: ₹" + amount);
//        System.out.println("Discounted Amount: (20%): ₹" + discountAmount);
//
//        handlePayment(scanner);
//    }
//
//    private void handlePayment(Scanner scanner){
//        System.out.println("\n Select Payment Method: ");
//        System.out.println("1. UPI");
//        System.out.println("2. Card");
//        System.out.println("3. Net Banking");
//        System.out.println("Enter Choice");
//
//        int paymentChoice = scanner.nextInt();
//
//        if (paymentChoice == 1){
//            System.out.println("Payment Completed via UPI");
//
//        } else if (paymentChoice == 2) {
//            System.out.println("Payment completed via Card");
//
//        } else if (paymentChoice == 3) {
//            System.out.println("Payment Completed via NEt Banking");
//
//        }else {
//            System.out.println("Invalid payment Method");
//        }
//    }
//}
//
//

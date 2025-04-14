package com.neoteric.javademo.abstracandinterface;


public class MallFactory {

    public static ShoppingMall createMall(int choice) {
        if (choice == 1) {
            return new ElectronicsShop();
        } else if (choice == 2) {
            return new ClothingShop();
        }
        return null;
    }
}

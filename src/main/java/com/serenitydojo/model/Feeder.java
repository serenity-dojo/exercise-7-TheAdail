package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        switch (animal) {
            case "Cat":
                return isPremium ? FoodType.SALMON: FoodType.TUNA;

            case "Dog":
                return isPremium ? FoodType.DELUXE_DOG_FOOD: FoodType.DOG_FOOD;

            case "Hamster":
                return isPremium ? FoodType.LETTUCE: FoodType.CABBAGE;

            default:
                return FoodType.UNKNOWN;
        }
    }
}

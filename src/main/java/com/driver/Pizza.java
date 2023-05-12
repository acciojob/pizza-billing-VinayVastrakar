package com.driver;

public class Pizza {

    private int price;  //final price
    private int basePrice;
    private boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isExtraTopping;
    private boolean isTakeAway;
    private int cheesePrice = 80;

    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    private int vegToppingPrice = 70;
    private int nonVegToppingPrice = 120;
    private int takeAwayPrice = 20;
    private int toppingPrice;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.bill=bill;
        basePrice = getBasePrice();
        price = basePrice;
        isCheeseAdded = false;
        isExtraTopping=false;
        isTakeAway=false;

    }

    private int getBasePrice() {
        return price = isVeg ? vegBasePrice : nonVegBasePrice;
    }

    public int getPrice() {

        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded) {
            isCheeseAdded = true;
            price += cheesePrice;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraTopping) {
            this.isExtraTopping = true;
            if (isVeg) {
                toppingPrice = vegToppingPrice;
                price += vegToppingPrice;
            } else
                toppingPrice = nonVegToppingPrice;
            price += nonVegToppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeAway) {
            isTakeAway = true;
            price += takeAwayPrice;
        }
    }

    public String getBill() {
        // your code goes here
        String var=" ";

        var += "Base Price Of The Pizza: " + basePrice + "\n";
        if (isCheeseAdded) {
            var += "ExtraCheeseAdded: " + cheesePrice + "\n";
        }
        if (isExtraTopping) {
            var += "ExtraToppingAdded: " + toppingPrice + "\n";
        }
        if (isTakeAway) {
            var += "Extra paperbag price: " + takeAwayPrice + "\n";
        }
        var += "Total Price: " + price + "\n";
        this.bill=var;
        return this.bill;
    }
}

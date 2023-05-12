package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean isChess = false;
    public boolean addTopp = false;

    public boolean beg = false;
    public int getP(){
        return price;
    }
    public void SetP(int price){
        this.price += price;
    }
    public String getB(){
        return bill;
    }
    public void SetB(String bill){
        this.bill += bill;
    }
    public boolean getV(){
        return isVeg;
    }


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg == true){
            bill = "Base Price Of The Pizza: 300\n";
            price = 300;
        }else{
            bill = "Base Price Of The Pizza: 400\n";
            price = 400;
        }
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isChess) {
            SetB("Extra Cheese Added: 80\n");
            SetP(80);
            isChess = true;
        }
    }

    public void addExtraToppings(){
        if(!addTopp) {
            if (getV()) {
                SetB("Extra Toppings Added: 70\n");
                SetP(70);
            } else {
                SetB("Extra Toppings Added: 120\n");
                SetP(120);
            }
            addTopp = true;
        }
    }

    public void addTakeaway() {
        if(!beg) {
            SetB("Paperbag Added: 20\n");
            SetP(20);
            beg = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}

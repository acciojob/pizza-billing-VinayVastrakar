package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean containCheese;
    private Boolean containToppings;
    private Boolean isBag;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
        }else{
            price = 400;
        }
        containCheese=false;
        containToppings= false;
        isBag=false;

        this.bill="";
        setBill("Base Price Of The Pizza: "+ price +"\n");
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!containCheese){
            price+=80;
            this.containCheese=true;
            setBill("Extra Cheese Added: "+80+"\n");
        }

    }

    public void setisVeg(Boolean isVeg) {
        this.isVeg = isVeg;
    }

    public Boolean getisVeg() {
        return isVeg;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!containToppings){
            if(isVeg){
                price+=70;
                setBill("Extra Toppings Added: 70\n");
                this.containToppings=true;
            }else{
                price+=120;
                setBill("Extra Toppings Added: 120\n");
                this.containToppings=true;
            }
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!isBag){
            this.price+=20;
            isBag=true;
            setBill("Paperbag Added: 20\n");
        }
    }

    public void setBill(String bill) {
        this.bill+= bill;
    }

    public String getBill(){
        // your code goes her
        return this.bill+"Total Price: "+this.price+"\n";
    }
}

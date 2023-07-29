package dhoni;

public class pizzaConstructor {
    String bread;
    String sauce;
    String cheese;
    String topping;
    int amount;



    pizzaConstructor() {
    }



    pizzaConstructor(String bread,String sauce,String cheese,String topping,int amount){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.topping=topping;
        this.amount=amount;

    }


    pizzaConstructor(String bread,String sauce,String cheese,int amount){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.amount=amount;
    }

    pizzaConstructor(String bread,String sauce,int amount){
        this.bread=bread;
        this.sauce=sauce;
        this.amount=amount;
    }

    pizzaConstructor(String bread,int amount){
        this.bread=bread;
        this.amount=amount;
    }
}

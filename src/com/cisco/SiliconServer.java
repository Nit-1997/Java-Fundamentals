package com.cisco;

//inherits Server class
//cannot use private members of parent class
//type of reference variable that determines what can be accessed, not the object
//cannot have child ref variable and a parent class constructor call
public class SiliconServer extends Servers{
    int sla;
    public SiliconServer(int latency,String name, double price,int sla){
        //calls the parent constructor directly above it
        super(latency,name,price);

        // you can also access parent class variables
        // super.latency
        this.sla = sla;
    }
}

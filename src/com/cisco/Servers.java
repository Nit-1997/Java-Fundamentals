package com.cisco;

public class Servers {
    int Latency;
    String Name;
    double Price;
    static int TotalServerCount = 0;

    //constructor
    public Servers(int latency,String name, double price) {
        this.Latency = latency;
        this.Name = name;
        this.Price = price;
        TotalServerCount++;
    }

    //constructor overloading (function overloading) @same func but different signature
    public Servers(){
        this(12,"blank_server",12.22);
    }

    //method to hike the price
    public void PriceHike () {
        this.Price = this.Price *  2;
    }

    //method to print the state
    public void PrintState(){
        System.out.println("Current Server is : ");
        System.out.println(this.Name +" \n"+this.Price +" \n"+this.Latency);
    }

    public static int TotalServers(){
        return TotalServerCount;
    }
}

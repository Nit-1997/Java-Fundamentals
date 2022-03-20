package com.nitin;

import com.cisco.Servers;


public class Main {

    public static void main(String[] args) {
        Servers siliconOne = new Servers(1,"Cisco Silicon One",199.23);
        System.out.println("Server state before price hike : ");
        siliconOne.PrintState();
        System.out.println("Server state after price hike : ");
        siliconOne.PriceHike();
        siliconOne.PrintState();
        Servers siliconTwo = new Servers(1,"Cisco Silicon One",199.23);
        System.out.println("Total Servers in the program currently:-");
        System.out.println(Servers.TotalServers());
    }
}

package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Saleable {
    static final String DEFAULT_PROTOCOL = "http";
    static final String DEFAULT_HOST = "appServer.com";
    static final int DEFAULT_PORT = 1440;
    static final String DEFAULT_APP_VERSION = "Latest";





    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        double screenSize;

    }


    @Override
    public void turnON() {
        System.out.println("Hello");
    }
    public String getProducer() {
        return producer;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Go earn money");
        }
        if(seller.phone != this){
            throw new Exception(("You can't sell" + this.toString()));
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = this;
            System.out.println("Successful transaction");

        }
    }
    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName: appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String name) throws MalformedURLException {
        installAnApp(name, DEFAULT_APP_VERSION);


    }

    public void installAnApp(String name , String version) throws MalformedURLException {
        URL url= new URL(DEFAULT_PROTOCOL, DEFAULT_HOST,DEFAULT_PORT,name +"-" + version);
        installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("You successfully installed new app " + url.getFile());
    }



}






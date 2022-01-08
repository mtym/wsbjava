package com.company.devices;



import com.company.creatures.Human;
import com.company.Saleable;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device implements Saleable {
    static final String DEFAULT_PROTOCOL = "http";
    static final String DEFAULT_HOST = "appServer.com";
    static final int DEFAULT_PORT = 1440;
    static final String DEFAULT_APP_VERSION = "Latest";
    public HashSet<Application> applications;





    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        double screenSize;
        this.applications = new HashSet<Application>();

    }
    public void installAnApp(Application app, Human owner)
    {
        if(owner.phone == this)
        {
            if(owner.cash >= app.price)
            {
                this.applications.add(app);
                owner.cash -= app.price;
                System.out.println("App installed");
            }
        }
        else
        {
            System.out.println("App can't be install");
        }
    }

    public void checkIfAppIsInstalled(Application app)
    {
        if(this.applications.contains(app))
        {
            System.out.println("You have this app instaled");
        }
            else
        {
            System.out.println("You have not install this app");
        }
    }

    public void checkIfAppIsInstalled(String name)
        {
            for (Application app: applications) {
                if (app.Name == name) {
                    System.out.println("You have this app installed");

                    return;
                }
            }

                 System.out.println("You have not install this app");
        }
    public void FreeApps()
    {
        for (Application app: applications)
        {
            if(app.price ==0)
            {
                System.out.println(app.Name);
            }
        }
    }
    public void appsValue()
    {
        double sum = 0;
        for (Application app:applications
        ) {
            sum += app.price;
        }
        System.out.println("Applications value = " + sum);
    }
    public void AppsByName()
    {
        List<Application> list = new ArrayList<Application>(this.applications);
        Collections.sort(list, compareByName);
        System.out.println("List of apps by Name" + list);
    }
    Comparator<Application> compareByName = new Comparator<Application>() {
        @Override
        public int compare(Application app, Application t1) {
            if (t1 == null || app == null){
                return 0;
            }
            return app.Name.compareTo(t1.Name);
        }
    };
    public void AppsByPrice()
    {
        List<Application> list = new ArrayList<Application>(this.applications);
        Collections.sort(list, compareByPrice);
        System.out.println("Apps by Name" + list);
    }
    Comparator<Application> compareByPrice;

    {
        compareByPrice = new Comparator<Application>() {
            @Override
            public int compare(Application app, Application t1) {
                if (app.price < t1.price) {
                    return -1;
                } else if (app.price > t1.price) {
                    return 1;
                }
                return 0;
            }
        };
    }

    public void AppsValue()
    {
        double sum = 0;
        for (Application app:applications
        ) {
            sum += app.price;
        }
        System.out.println("All applications value = " + sum);
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






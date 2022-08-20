package com.java.application.override;

//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.
class Vehicle{
    //defining a method

    public Vehicle(int id) {
        this.id = id;
    }

    int id = 1;
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle{

    StringBuffer sb = new StringBuffer();


     int id = 2;

    public Bike2(int id) {
        super(id);
    }

    //defining the same method as in the parent class
    @Override
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        int id = 3;
        System.out.println(id);


        //System.out.println(this.id);
        ///System.out.println(super.id);
        Bike2 obj = new Bike2(9);//creating object
        obj.run();//calling method
        obj.printData();
    }

    void printData(){
        System.out.println("Print this  : " + this.id);
        id = 5;
        System.out.println("Print local : " + id);
        System.out.println("Print this  : " + this.id);
        System.out.println("Print super : " + super.id);

    }

}
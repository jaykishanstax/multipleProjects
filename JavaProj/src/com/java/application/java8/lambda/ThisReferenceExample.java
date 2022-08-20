package com.java.application.java8.lambda;

public class ThisReferenceExample {

    public void doProcess(int i , ClosuerExample.Process p){
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(10, i -> {
                System.out.println("Value of i is  : " + i);
               // System.out.println(this);
            });

        /*thisReferenceExample.doProcess(10, new ClosuerExample.Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i : " + i );
                System.out.println(this);
            }

            @Override
            public String toString(){
                return "this is to string";
            }
        });*/
    }
}

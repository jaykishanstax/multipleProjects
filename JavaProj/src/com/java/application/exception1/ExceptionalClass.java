package com.java.application.exception1;

public class ExceptionalClass {

    public static void main(String[] args)
    {
        doSomethingGood();
    }
    static void doSomethingGood() {
        try {
            doSomethingBad();
            System.out.print("All Good");
        } catch(FooException fe) {
            System.out.println(fe);
        } catch(BarException be) {
            System.out.println(be);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    static void doSomethingBad() throws FooException {
        throw new FooException("Something Bad");
    }
}


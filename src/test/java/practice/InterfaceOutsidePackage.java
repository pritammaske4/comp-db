package practice;

import interviewpreparation.InterfaceExample;

public class InterfaceOutsidePackage implements InterfaceExample {

    @Override
    public void display() {

    }

    @Override
    public void show() {

    }

    @Override
    public void add() {

    }

    @Override
    public void present(){
        System.out.println("inside implementation class");
    }
    public static void main(String[] args) {
        InterfaceExample i = new InterfaceOutsidePackage();
        i.present();
        InterfaceExample.print();

    }
}

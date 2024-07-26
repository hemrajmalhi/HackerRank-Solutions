package HackerRank;

abstract class Pro_38 {

    Pro_38(){
        System.out.println("Class create for to organize the code");
    }

}

abstract  class  Bank{
    abstract int rateOfInterest();
}


class BankALHabib extends Bank{
     int rateOfInterest(){
        return 6;
    }
}


class HabibBank extends Bank{
     int rateOfInterest(){
        return 4;
    }
}

class MeezanBank extends Bank{
    public int rateOfInterest(){
        return 9;
    }
}

interface Bike2{
     void run();
     void a();
     void b();
     void c();
     void d();
}

abstract class Bike extends MeezanBank implements Bike2{
    Bike(){
        System.out.println("I am the abstract class constructor ");
    }

    @Override
    public void c() {
        System.out.println("I am method C");
    }

    @Override
    public void d() {
        System.out.println("I am method C");
    }

    void changedGear(){
        System.out.println("Changed the Gear");
    }
}

class Honda extends Bike {

    @Override
   public void run(){
        System.out.println("Honda Bike maximum speed 150km/hr");
    }

    public void a(){
        System.out.println("I am method A");
    }

    public void b(){
        System.out.println("I am method B");
    }
}


interface  E {
    void a();

    default void message() {
        System.out.println("yes, we can create concrete method in the help of default Keyword");
    }

    static int cube(int n) {
        return n * n * n;
    }

}
interface F extends E{
    void b();
}


class G implements F{
    @Override
    public void a() {

        System.out.println("i am come form interface A you Know");
    }

    @Override
    public void b(){
        System.out.println("i am come from interface c");
    }
}










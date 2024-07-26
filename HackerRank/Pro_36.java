package HackerRank;

public class Pro_36 {

    void run(){
        System.out.println("I ma run in the speed of bike like a bike ");
    }



}

 class Splendor  extends Pro_36{
    @Override
    void run(){
        System.out.println("i am Run the speed of Splendor ");
    }
}


class Animal{
    void eat(){
        System.out.println("animal is eating......");
    }
}



class Dog extends Animal{
    static void method(Animal a){
        if(a instanceof Dog){
            Dog d = (Dog) a;

            System.out.println("down casting is performed");
        }
        System.out.println("Dog Is eating....");
    }
}





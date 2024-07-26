package HackerRank;

public class Pro_35 {


    int rollNo;
    String name,course;
    float fees;
    public  Pro_35(){
        System.out.println("this is a constructor");

    }

    public Pro_35(int rollNo,String name ,String course ,float fees){
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
        this.fees=fees;


    }

    public Pro_35(String name ,String course ,float fees){
      this.fees=fees;



    }



    void display(){
        System.out.println("rollNo "+ rollNo+ " name : " +name + " course : "+course+ " fees +  "+fees);
    }
    void a(Pro_35 obj){
        System.out.println("hello i a method");
    }

    void b(){
        a(this);
        this.display();
    }
/*   void test(){
        this.a();
       System.out.println("use case of this");

   }*/






    public static void main(String []args){
        Pro_35 a =new Pro_35();
        Pro_35 a2 =new Pro_35(2,"Sanjay","Science", 34.4f);
//          a.test();
          a2.display();

        a.b();

        new Pro_32().get().mesg(); // pass reference of the class in help of this keyword
        System.out.println(a2);
        System.out.println(new Pro_32());
        Pi pi=new Pi();
        double output = pi.area(45);
        System.out.println(output);



        Emp emp =new Emp(1,"hemraj", new Address("kot Ghulam Muhammad","Mirpurkhas","Kot Ghulam Muhammad","Pakistan"));


        emp.display();
        }
    }

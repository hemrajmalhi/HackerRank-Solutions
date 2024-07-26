package HackerRank;

public class Pro_32 {

    int a=34;
    Pro_32 get(){
        return this;

    }


    public void mesg(){
        System.out.println("pass the reference of the class in help of this keyword");
    }

}
class A{
    void msg(){System.out.println("Hello");}
}
class B{
    void msg(){System.out.println("Welcome");}
}
class C extends A{//suppose if it were    class C extends A,B{//suppose if it were

    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?
    }
}






/* using of aggregations */

class Operations{
   public int Square(int n){
       return n*n;
   }
}


 class Pi{
    Operations op = new Operations();
    double pi =3.142;

     double area(int radius){
        double value = op.Square(radius);
         return value * pi;

     }
}


 class  Address {
    String  birthPlace, district, cityName,countryName;
    Address(String birthPlace,String district,String cityName,String countryName) {
        this.birthPlace = birthPlace;
        this.district = district;
        this.cityName = cityName;
        this.countryName = countryName;
    }
}



class Emp{
    int id;
    String empName;

    Address address;

  Emp(int id,String empName, Address address){
      this.id=id;
      this.empName=empName;
      this.address=address;
  }

  void display(){
      System.out.println("Employee Id " +id +"\n Employee Name " + empName + "\n Birth Place " + address.birthPlace +
              "\n District "+address.district +  "\n City Name " + address.cityName + "\n Country Name " + address.countryName);
  }

}

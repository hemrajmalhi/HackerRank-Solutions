package HackerRank;

public class Pro_40 {

    private String name;
    private String email;




    public void setName(String name) {
        this.name=name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

}



class Main {
    public static void main(String[] args) {


        Pro_40 pro40 = new Pro_40();
        pro40.setName("Hemraj");
        pro40.setEmail("hemrajmalhi1234@gmail.com");
        System.out.println(pro40.getName());
        System.out.println(pro40.getEmail());
    }
}
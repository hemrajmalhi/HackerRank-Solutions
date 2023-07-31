package HackerRank;


import java.util.Scanner;

class Sports{
    String getName(){
        return "Genric Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n player in "+getName());
    }
}


   class Soccer extends Sports{

        @Override
        String getName() {
            return "Succor class";
        }

        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 player in "+getName());
        }
    }
public class Pro_22 {
    public static void main(String[] args) {
        Sports sports=new Sports();
        Soccer soccer=new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();

    }


}

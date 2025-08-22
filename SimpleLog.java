import java.util.Scanner;

public class SimpleLog {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String user = "Ray";
        String pass = "Duo";
        String ques = scan.nextLine();
        String ans = scan.nextLine();

        if(ques.equals(user) && ans.equals(pass)){
            System.out.println("Anda berhasil login");
        }else{
            System.out.println("Login gagal");
        }

        scan.close();
    }
}

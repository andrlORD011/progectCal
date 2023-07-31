package Exeptions;


public class Exeptions1 {
    public static void main(String[] args) {
        Exeptions1.foo();
    }
  public static void foo (){
        try {
            System.out.println(1/0);
        } catch (Exception e){
            e.printStackTrace();
        }

  }
}

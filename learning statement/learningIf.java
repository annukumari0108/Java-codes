
public class learningIf {
   public static void main(String[] args) {
    boolean isMale = true;
    String name = "Anna";
    System.out.println("before if");
    if(isMale){
        System.out.println("Mr." + name);
    }else{
        System.out.println("Mr." + name);
    }
    System.out.println("after if");



    // int age=20;
    // if(age>18)
    // System.out.print("Age is greater than 18");

    

    boolean isSeniorCitizen = true;
    boolean isAnAdult = false;

    if(isSeniorCitizen){
        System.out.println("Hello Senior Citizen");
    } else{
        if(isAnAdult){
            System.out.println("hello Adult");
        } else{
            System.out.println("Hello child");
        }
    }
   } 
}

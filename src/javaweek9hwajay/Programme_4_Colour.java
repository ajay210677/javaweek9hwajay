package javaweek9hwajay;
import java.util.ArrayList;
public class Programme_4_Colour {
    /**
     Write a Java program to create a new array list, add some colours (string) and
     printout the collection using for each loop*/

    public void method1(){
        // declared array list
        ArrayList<String> list= new ArrayList<>();
        //defined value
        list.add("pink");
        list.add("blue");
        list.add("white");
        list.add("black");

        for(String data :list){
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        Programme_4_Colour obj= new Programme_4_Colour();
        obj.method1();
    }


}

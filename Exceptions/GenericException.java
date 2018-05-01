import java.util.ArrayList;



public class GenericException{
    void testException(){
    ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add("13");
        list1.add("hello world");
        list1.add(48);
        list1.add("Goodbye World");

        for(int i =0; i< list1.size(); i++){
            try{
            Integer castedValue = (Integer) list1.get(i);
            System.out.println(castedValue);
            }
            catch (ClassCastException e){
                System.out.println("Error on index number "+i);
                System.out.println("Exception: "+e);
            }
        }
    }
}
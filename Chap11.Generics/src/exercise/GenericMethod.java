package exercise;

public class GenericMethod {

    //Generics in method
    public static <T> boolean isEqual(T g1, T g2){
         return g1.equals(g2);
    }
 
    public static <T extends Comparable<T>> int compare(T t1, T t2){
         return t1.compareTo(t2);
    }
 
    public static void main(String args[]){

    	 String g1 = new String("demo");
    	 String g2 = new String("demo");
    	
         boolean isEqual = GenericMethod.<String>isEqual(g1, g2);
  
         System.out.println(isEqual);
         //above statement can be written simply as
         isEqual = GenericMethod.isEqual(g1, g2);
  
         System.out.println(isEqual);
  
         System.out.println(GenericMethod.compare("abc","abc"));
         
         Integer d1 = 245;
         Integer d2 = 345;
         isEqual = GenericMethod.isEqual(d1, d2);
         System.out.println("d1과 d2가 같은가: " + isEqual);
    }
}
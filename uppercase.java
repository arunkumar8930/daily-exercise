public class uppercase {
    public static void main(String []args) {
       char val = 'R';
       System.out.println("Character: "+val);
       if (Character.isLowerCase(val)) {
          System.out.println("Character is in Lowercase!");
       } else {
          System.out.println("Character is in Uppercase!");
       }
    }
 }
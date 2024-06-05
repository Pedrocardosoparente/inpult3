import java.util.Scanner;
class Input03 {

    
    public static void main(String[] args) {

        
        int x;
        try (Scanner sn = new Scanner(System.in)) {
            x = 0;
            x += sn.nextInt();
            x += sn.nextInt();
            x += sn.nextInt();
        }
     System.out.println(x);
     
    
   }
    
}

    
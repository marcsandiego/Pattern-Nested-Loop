import java.util.*;
public class Main{
   public static void main(String args[]){
       
    int again = 1;

    Scanner sc = new Scanner (System.in);
    System.out.print("\t\t\t\tMENU\n");
    System.out.print("1. Right Triangle\n");
    System.out.print("2. Inverted Right Triangle\n");
    System.out.print("3. Special Right Triangle\n");
    System.out.print("4. Inverted Special Right Triangle\n");
    System.out.print("5. Diamond\n");
    
    while(again == 1){
        
    System.out.print("Enter choice: ");
    int choice = sc.nextInt();
    
        if(choice == 1){
        for(int i = 1; i<=5; i++){
            for(int j=1; j<=i; j++)
            System.out.print(j);
            System.out.println();
            }
            System.out.print("\nDo you want to continue? ");
            String answer = sc.next();
            if(answer.equals("yes")){
                again = 1;
            }else{
                again = 2;
            }
            continue;
        }
    
        else if(choice == 2){
            for(int i = 5; i>=1; i--){
                for(int j=1; j<=i; j++)
                System.out.print(j);
                System.out.println();
                }
                System.out.print("\nDo you want to continue? ");
                String answer = sc.next();
                if(answer.equals("yes")){
                    again = 1;
                }else{
                    again = 2;
                }
                continue;
                } 
            
        else if(choice == 3){
            for (int i=5, k=1; i>=1; i--, k++){
                int p = k;
                for (int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for (int j=i; j<=5; j++){
                    System.out.print(p--);
                }
                    System.out.println("");
                    }
                    System.out.print("\nDo you want to continue? ");
                    String answer = sc.next();
                    if(answer.equals("yes")){
                        again = 1;
                    }else{
                        again = 2;
                    }
                    continue;
           
             }

        else if(choice == 4){
            for (int i=1, k=5; i<=5; i++, k--){
                int p = k;
                for (int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for (int j=i; j<=5; j++){
                    System.out.print(p--);
                }
                    System.out.println("");
                    }
                    System.out.print("\nDo you want to continue? ");
                    String answer = sc.next();
                    if(answer.equals("yes")){
                        again = 1;
                    }else{
                        again = 2;
                    }
                    continue;
                 }

        
    else{
        System.out.print("Incorrect Input, Try Again!\n");
    }

    }   
    System.out.print("Program Exiting...");
    }
}




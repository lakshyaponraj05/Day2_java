import java.util.*;
public class Main{
  public static void guessNumber(){
         int attempt=5;
         Boolean win=false;
         int number=1+(int)(100*Math.random());
         
         for(int i=0;i<attempt;i++){
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter a number");
              int guess=sc.nextInt();
              if(guess==number){
                  System.out.println("You have guessed the number");
                  win=true;
                  return ;
              }
              else if(guess>number){
                   System.out.println("the guessed number is more than the number");
                   win=false;
              }
              else {
                  System.out.println("the guessed number is less than the number");
                  win=false;
              }
         }
        if(!win){
            System.out.println("You didn't guess the number correctly and used all the attempts");
     
}
  }
public static void main(String[] args){
    guessNumber();
}
}
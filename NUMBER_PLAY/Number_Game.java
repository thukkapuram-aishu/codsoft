import java.util.Scanner;
class range{
    public int generate(int max,int min){
        return(int) (Math.random()*(max-min+1)+min);
    }
}
public class Number_Game{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        range r= new range();
        int TA=0;
        int win=0;
        while(true){
            System.out.println("ENTER THE MIN NUMBER:");
            int min=sc.nextInt();
            System.out.println("ENTER THE MAX NUMBER:");
            int max=sc.nextInt();
            sc.nextLine();
            int c=r.generate(max,min);
            int A=0;

            while(true){
                System.out.println("GUESS THE NUMBER BETWEEN "+min+"and"+max);
                int g=sc.nextInt();
                A++;
                 
                if(g>c){
                    System.out.println("its greater");
                }else if(g<c){
                    System.out.println("its smaller");
                }else{
                    System.out.println("correct guess");
                    win++;
                    break;
                }
            }
        TA=TA+A;
        
        System.out.println("Attempt="+A);
        System.out.println("wins="+win);
        double winrate=(double) win/TA*100;
        System.out.println("your winrate is %.2f%%\n"+winrate);
        System.out.println("do you want to play again (y/n)");
        String PA=sc.next();
        if(!PA.equalsIgnoreCase("y")){
            sc.close();
            System.exit(0);
        }
    sc.nextLine();
        }
        }
     }


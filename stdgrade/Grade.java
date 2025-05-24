import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("///////********Student grade calculator***********//////////");
        System.out.println("enter number of subjects");
        //gives number of subjects are there
        int s=sc.nextInt();
        int total=0;
        System.out.println("enter marks obtained in "+s+" subjects :");
        for(int i=1;i<=5;i++){
            int marks=sc.nextInt();
            total= total+marks;

        }
        //avg is average percentage 
        double avg=(double)total/s;
        String Grade;
        if (avg>=90) {
            Grade="S";
            
        } else if(avg>=80) {
            Grade ="A";

        } else if (avg>=70) {
            Grade="B";
        }else if (avg>=60) {
            Grade="c";
            
        }else if (avg>=50) {
            Grade="D";

        }else if(avg>=40){
            Grade="E";
        }else{
            Grade="f(fail)";
        }
    
        System.out.println("total marks ="+total);
        System.out.println("average percentage ="+avg+"%");
        System.out.println("Grade ="+Grade);
        
    }
}
import java.util.Scanner;

public class RTO {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        for(int i=0;i<str.length()-1;i++){
            if((arr[0]!='T')&&(arr[1]!='N')){
                System.out.print("Invalid vehicle number");
                break;
            }
            else if(str.contains("TN 60")){
                System.out.print("THE VEHICLE REGISTERD IN COIMBATORE DISTRICT");
                break;
            }
            else if(str.contains("TN 43")){
                System.out.print("THE VEHICLE REGISTERD IN NILGIRIS DISTRICT");
                break;
            }
            else if(str.contains("TN 36")){
                System.out.print("THE VEHICLE REGISTERD IN ERODE DISTRICT");
                break;
            }
        }
    }
}


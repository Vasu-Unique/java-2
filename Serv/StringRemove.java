import java.util.Scanner;

public class StringRemove {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String arr[] = word.split(" ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i].equals(arr[j])){
                        arr[i] = "0";
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!="0"){
                    System.out.print(arr[i]+" ");
                }
            }
            in.close();
    }
}

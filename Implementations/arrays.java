import java.util.*;

public class arrays{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] rnos = new int[5];
        for(int i=0;i<rnos.length;i++){
            rnos[i]=in.nextInt();
        }
        // for(int i=0;i<rnos.length;i++){
        //     System.out.println(rnos[i]);
        // }
        for(int num : rnos){
            System.out.println(num);
        }


    }
}
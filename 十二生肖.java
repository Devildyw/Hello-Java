package dyw.PTA;
import java.util.Scanner;
public class ʮ����Ф {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] sx = {'��','ţ','��','��','��','��','��','��','��','��','��','��'};
        int x = (sc.nextInt()-4)%12;
        System.out.println(sx[x]);
    }
}

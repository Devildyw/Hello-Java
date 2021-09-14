package dyw.PTA;
import java.util.Scanner;
public class Ê®¶şÉúĞ¤ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] sx = {'Êó','Å£','»¢','ÍÃ','Áú','Éß','Âí','Ñò','ºï','¼¦','¹·','Öí'};
        int x = (sc.nextInt()-4)%12;
        System.out.println(sx[x]);
    }
}

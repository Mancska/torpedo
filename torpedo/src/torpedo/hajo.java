
package torpedo;

public class hajo {
    private int[] pozicio;
    public hajo(int[] poz){
        this.pozicio = poz;
        
                
    }
public String talalt(int poz ){
    int i = 0, N = this.pozicio.length ;
    while(i<N && !(pozicio[i]== poz )){
        i++;
    }
        return i < N ?"talált ":"mellé";

        }

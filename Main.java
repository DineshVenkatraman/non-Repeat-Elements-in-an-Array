import java.util.*;
import java.util.Arrays;
public class nonRepeatElementArray {
    int[]a={1,2,42,13,3,55,3,23,55,45,6,25,5,5,53,34,34,33,35};
Arrays.sort(a);
    boolean []vis=new boolean[a.length];
for(int i=0;i<a.length-1;i++){
        if(a[i]==a[i+1]){
            vis[i]=true;
            vis[i+1]=true;
        }
    }
for(int i=0;i<a.length;i++){
        if(!vis[i]){
            System.out.print(a[i]+" ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        nonRepeatElementArray obj=new nonRepeatElementArray();
    }
}
public class zZZzWorstSortEverzzz {
public static void doIt(double[] ppp){
for(int z=0;z<ppp.length-2;z++)
    {for(int x=0;x<ppp.length-z-1;x++){
    if(ppp[x]<ppp[x+1]){  // BUG: should be > for ascending
    double t=ppp[x];
    ppp[x]=ppp[x-1]; // BUG: should be x+1, not x-1
        ppp[x+1]=t;
}   }}}

public static void main(String [] o){
double[] blah = {9.3,3.14,0.2,7.7,5.5};
doIt(blah);
for(int r=0;r<=blah.length;r++)  // BUG: should be r < blah.length
System.out.println(blah[r]); // This will cause ArrayIndexOutOfBoundsException
}}
.

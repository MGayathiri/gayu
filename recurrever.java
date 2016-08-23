import java.io.*;
import jva.util.*:
class recurrever{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
static int c=0;
int n=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++){
al.add(sc.nextInt());
 }
ArrayList<Integer> a=new ArrayList<Integer>()
a=fun(al);
System.out.println(a);
}
public static ArrayList<Integer> fun(ArrayList<Integer> a){
ArrayList<Integer> ar=new ArrayList<Integer>();
if(c!=n){
 c++;
 ar=fun(a);
}
ar.add(a.get(c));
c--;
return ar;
}


}

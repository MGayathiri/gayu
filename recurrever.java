import java.io.*;
import java.util.*;
class recurrever{
 static int c=0;
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>1){
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++){
al.add(sc.nextInt());
 }
ArrayList<Integer> a=new ArrayList<Integer>();
a=fun(al);
System.out.println(a);
}
}
public static ArrayList<Integer> fun(ArrayList<Integer> a){
ArrayList<Integer> ar=new ArrayList<Integer>();
if(c!=a.size()){
 c++;
 ar=fun(a);
}
if(c>0){
 c--;
ar.add(a.get(c));}
return ar;
}


}

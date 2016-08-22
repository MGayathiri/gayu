import java.io.*;
import java.util.*;
class heightofnth{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a[]=new double [50];
for(int i=0;i<50;i++){
a[i]=sc.nextDouble();}
Arrays.sort(a);
int x=sc.nextInt();
if(x<n){
System.out.println("4th"+a[a.length-4]);
System.out.println("nth"+a[x-1]);
 }
 
} 
}

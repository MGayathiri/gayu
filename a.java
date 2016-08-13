import java.io.*;
import java.util.*;
class a{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements);
int n=sc.nextInt();
if(n<0){
System.out.println("enter the elements");
int a[]=new int [n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
 }
System.out.println("enter the no of digits to delete");
int x=sc.next();
if(x<n){
 Arrays.sort(a);
for(int i=0;i<a.length-x;i++){
 System.out.println(a[i]);
 }
 }
 else
 System.out.println(0);
 }
 else
 System.out.println(0);
}
}

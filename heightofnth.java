import java.io.*;
import java.util.*;
class heightofnth{
public satatic void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>5){
int a[]=new int [n];
for(int i=0;i<n;i++){
a[i]=sc.next();}
Arrays.sort(a);
int x=sc.nextInt();
if(x<n){
System.out.println("4th"+a[length-5]);
System.out.println("nth"+a[x]);
 }
 }
} 
}

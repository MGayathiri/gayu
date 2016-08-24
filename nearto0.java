import java.io.*;
import java.util.*;
class naearto0{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>1){
int a[]=new int[n];
for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
  }
  int m=a[0]+a[1],b=a[0];c=a[1];
for(int i=0;i<n-1;i++){
 for(int j=i+1;j<n;j++){
  if(m>(a[i]+a[j])){
    b=a[i];c=a[j];m=(a[i]+a[j]);
    }
  }
 }
 System.out.println(b+" "+c);
}
}
}

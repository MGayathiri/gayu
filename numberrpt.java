import java.io.*;
import java.util.*;
class numberrpt{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>1){
int a[]=new int[n];  
for(int i=0;i<n;i++){
  a[i]=sc.nextInt();
  }
for(int i=0;i<n;i++){
if(a[i]!=0){
  int x=a[i],c=0;
  for(int j=0;j<n;j++){
    if(x==a[j]){c++;a[j]=0;}
    }
  if(c!=0&&c<2){
  System.out.println(x);
  }
  }
 }
 }
}
}

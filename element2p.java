import java.io.*;
import java.util.*;
class element2p{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int [n];
if(n>0){
for(int i=0;i<n;i++){
 a[i]=sc.nextInt();
 }
//-----------
for(int i=0;i<n;i++){
 if(i*2<n){
 for(int j=0;j<n;j++){
  if(j*2<n){
  for(int k=0;k<n;k++){
   if(k*2<n){
   if(a[2*i]+a[2*j]==a[k*2]){
    System.out.println("2i="+a[i*2]+" 2j="+a[j*2]+" 2k="+a[k*2]);
      }  
     }
    }
   }
  }
 }
}


}
}
}

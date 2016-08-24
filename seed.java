import java.io.*;
import java.util.*;
class seed{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0){
for(int i=1;i<n;i++ ){
  int m=1;
  m=m*i;
  int x=i;
  while(x!=0){
    m=m*(x%10);
    x=x/10;
  }
  if(m==n){System.out.println(i);}
  
 }
   }

}
}

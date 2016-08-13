import java.io.*;
import java.util.*;
class aaa{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements");
HashSet<Integer> st=new HashSet<Integer>();
int n=sc.nextInt();
if(n>0){
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]==a[j]&&st.add(a[i])){
System.out.println(a[i]);
break;
} 
 }
 }
}
else{System.out.println(0);}
}
}

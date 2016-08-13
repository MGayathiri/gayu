import java.io.*;
import java.util.*;
class b{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of stirngs");
int n=sc.nextInt();
if(n>0)
{
System.out.println("enter the strings");
String s[]=new String[n];
for(int i=0;i<n;i++){
s[i]=new String();
s[i]=sc.next();
}
int m=0,p=0;
//-------
for(int i=0;i<n-1;i++){
for(int k=i;k<n;k++){
int c=0;
//---
for(int j=0;j<s[i].length();j++){
if(j<s[k].length()){
if(s[i].charAt(j)==s[k].charAt(j)){
c++;}
else{break;}
}
else{break;}
}
if(c>m){p=i;}
//----
}
}
//--------
System.out.println(s[p].substring(0,m));
}
else{
System.out.println("null");
}
}
}

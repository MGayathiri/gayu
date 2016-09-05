import java.io.*;
import java.util.*;
class pangram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
Set<String> st=TreeSet<String>();
int i=0;
for(i=0;i<s.length();i++){
if(Character.isLatter(s.charAt(i)){
st.add(s.charAt(i));}
else{break;}
}
if(i==s.length&&i==27){
System.out.println("PANGRAM");
}
else{
System.out.println("NOT PANGRAM");
}
}
}

import java.io.*;
import java.util.*;
class pangram{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
Set<Character> st=new TreeSet<Character>();
int i=0;
for(i=0;i<s.length();i++){
if(Character.isLetter(s.charAt(i))){
st.add(s.charAt(i));}
}
if(st.size()==27){
System.out.println("PANGRAM");
}
else{
System.out.println("NOT PANGRAM");
}
}
}

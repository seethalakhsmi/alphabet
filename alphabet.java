import java.io.*;
import java.util.*;
public class alphabet
{
public static void main(String args[])
{
char c;
Scanner scan=new Scanner(System.in);
System.out.println("enter the character");
c=scan.next().charAt(0);
if((c>='a')&&(c<='z')||(c>='A')&&(c<='Z'))
{
System.out.println("the character is alphabet");
}
else
{
System.out.println("the character is not a alphabet");
}
}
}

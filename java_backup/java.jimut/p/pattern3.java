import java.io.*;
class pattern3
{
public static void main(String[]args)
{
int i,j,k=10;
for(i=5;i>=1;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(k);
k=k-2;
}
System.out.println("");
}
}
}
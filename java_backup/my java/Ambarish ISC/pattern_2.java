 

import java.io.*;
class pattern_2
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException
    {
    int n=Integer.parseInt(br.readLine());
    int  i=1;
    rec(i,n);
}
void rec(int i,int n)
{
  if(n<i)
  return;
  else
  { 
      int  j=1;
      rec1(j,n);
      System.out.println(" ");
      rec(i,n-1);
    }
}
void rec1(int j,int i)
{
    if(j>i)
    return;
    else
    { 
      System.out.print("*");
      rec1(j+1,i);
    }
}
}

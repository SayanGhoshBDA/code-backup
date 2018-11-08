import java.util.*;
class MOBIUS
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        n=sc.nextInt();
    }
    void clac()
    {
        int M=0,i=2,j=0;
        int a[]=new int[n];
        int copy=n;
        while(copy!=1)
        {
           if(prime(i)==true&&copy%i==0)
           {
               a[j++]=i;
               copy=copy/i;
               i=2;
            }
           i++;
        }
        if(j==1)
        {
            M=1;
            return;
        }
        for(int k=1;k<copy;k++)
        {
            if(a[k]==a[k-1])
            M=0;
            M=-1;
        }
        System.out.println("The number was "+n);
        System.out.println("The factors are ");
        for(int k=0;k<j;k++)
        System.out.print(a[k]+" ");
        System.out.print("M(N)="+Math.pow(M,j));
    }
    boolean prime(int n)
    {
        int cr=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            cr++;
        }
        if(cr>0)
        return false;
        return true;
    }
}
#include <stdio.h>
#include <conio.h>
int main()
{
     int n,i,j;
     printf("\nenter the number of lines :\n");
     scanf("%d",&n);
     for(i=1;i<=n;i++)
     { 
     printf("\n");
     for(j=n;j>i;j--)
     printf(" ");
     for(j=1;j<=i;j++)
     printf("*");
     }
     getch();
     return 0;
}     

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
node* insert(node*);
void disp(node*);

main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      getch();
}
node* insert(node* start)
{
      node* start1;
      start1=start;
      char ch='y';
      while(ch=='y' || ch=='Y')
      {
                    printf("\nEnter data :\n");
                    scanf("%d",&start1->k);
                    fflush(stdin);
                    printf("\nEnter another :\n");
                    scanf("%c",&ch);
                    if(ch=='y' || ch=='Y')
                    {
                               start1->next=(node*)malloc(sizeof(node));
                               start1=start1->next;
                    }
      }
      start1->next=start;
      return start;
}
void disp(node* start)
{
     printf("\nYour Circular Linked List :\n");
     node* start1;
     start1=start;
     while(start1->next!=start)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
     printf("%d, ",start1->k);
}

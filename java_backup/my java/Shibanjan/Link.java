import java.util.*;
class Link
{ list l1,l2;
  Scanner sc=new Scanner(System.in);
  Link()
  { l1=new list();
    l2=new list();
    l1=l2;
  }
  void input1()
  { String ch="yes";
    while(ch.equalsIgnoreCase("yes")==true)
    { l2.input();      
      System.out.println("\nEnter choice:");
      ch=sc.next();
      if(ch.equalsIgnoreCase("yes")==true)
      { l2.next=new list();
        l2=l2.next;
      }
    }
    l2.next=null;
  }  
  void show1()
  { l2=l1;
    int t=0;    
    while(l2!=null)
    { if(l2.x%2==0)
        System.out.println("\nValue of node is even.");
      else
        System.out.println("\nValue of node is odd.");
      l2.show();
      t++;
      l2=l2.next;
    }
    System.out.println("\nNumber of nodes:"+t);
  }
  void sort()
  { int k=0;
    for(list l3=l2;l3.next!=null;l3=l3.next)
    { for(list l4=l3.next;l4!=null;l4=l4.next)
        { if(l3.x>l4.x)
            { k=l3.x;
              l3.x=l4.x;
              l4.x=k;
            }
        }
    }
  }
}
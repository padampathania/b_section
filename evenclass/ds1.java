import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Main {
    public void display(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    public Node insatbeg(Node head)
    {
        System.out.println("Enter elements of linked list to insert at beginning");
        Scanner o=new Scanner(System.in);
        int data=o.nextInt();
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
        return head;
    }
    public void insatend(Node head)
    {
        System.out.println("Enter elements of linked list to insert at end");
        Scanner o=new Scanner(System.in);
        int data=o.nextInt();
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            while(head.next!=null)
            {
                head=head.next;
            }
            head.next=n;
        }
    }
    public void insatmid(Node head)
    {
        System.out.println("Enter elements of linked list to insert at mid");
        Scanner o=new Scanner(System.in);
        int data=o.nextInt();
        System.out.println("Enter the position");
        int pos=o.nextInt();
        int c=1;
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else{
            while(head.next!=null)
            {if(c==pos)
            {
                break;
            }
                head=head.next;
                c++;
            }
            n.next=head.next;
            head.next=n;
        }
    }

    public static void main(String[] args) {
        Main m=new Main();
        int data,i;
        Scanner o=new Scanner(System.in);
        Node head=null;
        System.out.println("Enter elements of linked list");
        data=o.nextInt();
        while(data!=-1)
        {
            Node n=new Node(data);
            if(head==null)
            {
                head=n;
            }
            else
            {
                Node p=head;
                while(p.next!=null)
                {
                    p=p.next;
                }
                p.next=n;
            }
            data=o.nextInt();
        }
        head=m.insatbeg(head);
        m.insatend(head);
        m.insatmid(head);
        m.display(head);

    }
}

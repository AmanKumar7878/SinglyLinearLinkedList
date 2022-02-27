import org.w3c.dom.Node;

public class SinglyLinearLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next = null;
        }
    }
    public void InsertFirst(int data)
    {
        Node newnode = new Node(data);
        if (head==null)
        {
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void insertLast(int data)
    {
        Node newnode = new Node(data);
        if(head==null){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void traveral()
    {
        if(head==null)
        {
            System.out.println("empty linked list");
            return;
        }
        Node temp= head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;

        }
    }
    public void  delFirst()
    {
        if (head==null)
        {
            System.out.println("Already null");
        }
        head=head.next;
    }
    public void delLast()
    {
        if(head ==null)
        {
            System.out.println("Already null");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
}

class ll
{
    public static void main(String[] args)
    {
        SinglyLinearLinkedList obj = new SinglyLinearLinkedList();
        obj.InsertFirst(45);
        obj.InsertFirst(78);
        obj.InsertFirst(79);
        obj.traveral();
        obj.delLast();
        obj.traveral();
    }


}

class Node{
    int data;
    Node next;

    public Node(int d){
        data = d;
        next = null;
    }
}

class LinkList{
    Node head;

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void delete(int data){
        Node curr = head;
        Node prev = null;

        if(curr == null){return;}

        while(curr != null){
            if(curr.data == data){
                prev.next = curr.next;
                return;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public boolean search(int data){
        Node curr = head;
        while(curr != null){
            if(curr.data == data){
                return true;
            }
        }
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(3);
        list.display();
        list.delete(3);
        list.display();
        System.out.println(list.search(1));
    }
}
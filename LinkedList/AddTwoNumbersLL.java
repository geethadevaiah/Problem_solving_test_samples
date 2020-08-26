package LinkedList;

class AddTwoNumbersLL {
 
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } 
    }

    public static void main(String[] args) {
        System.out.println("Add two numbers example..");
        Node n1 = new Node(2);
        n1.next = new Node(4);
        n1.next.next = new Node(3);

        Node n2 = new Node(5);
        n2.next = new Node(6);
        n2.next.next = new Node(4);

        Node n3 = addTwoNums(n1, n2);

        //checkk....
        System.out.println("RESULT?? " + n3.data + n3.next.data + n3.next.next.data);
    }

    public static Node addTwoNums(Node l1, Node l2){
    
        Node head = new Node(0);
        Node p = l1, q = l2, curr = head;
        int carry = 0;
        try{
            while(p != null || q != null){
                int x = (p != null) ? p.data : 0;
                int y = (q != null) ? q.data : 0;
                int sum = carry + x + y;
                carry = (sum)/10;
                curr.next = new Node (sum % 10);
                curr = curr.next;
                if(p != null) p = p.next;
                if(q != null) q = q.next;
            }
            if(carry > 0){
                curr.next = new Node(carry);
            }
            return head.next;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
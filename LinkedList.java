import java.util.*;

class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode head;
}

class LinkedList {

    static boolean isEmpty(ListNode head) {
        if (head == null)
            return true;
        return false;
    }

    static void PrintList(ListNode head) {
        if (isEmpty(head)) {
            System.out.println("List is Empty!");
            return;
        }

        ListNode temp = head;
        System.out.print("List : ");
        while (temp.next != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value + " -> null");
    }

    // Add Head

    public static void addHead(int value, ListNode head2) {
        ListNode head = new ListNode(value, head2);
        PrintList(head);
    }

    public static void addTail(int value, ListNode head) {
        ListNode node = new ListNode(value);
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = node;
        PrintList(head);
    }

    public static void searchItem(int value, ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.value == value) {
                System.out.println(true);
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(false);
        }
    }

    public static void addNode(int value, int new_val, ListNode head) {
        ListNode temp = head;
        ListNode node = new ListNode(new_val);
        while (temp != null) {
            if (temp.value == value) {
                node.next = temp.next;
                temp.next = node;
                PrintList(head);
                break;
            }
            temp = temp.next;
        }
    }

    public static void deleteNode(int value, ListNode head) {

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.next.value == value) {

                if (temp.next.next != null) {
                    temp.next = temp.next.next;
                } else {
                    temp.next = null;
                    break;
                }
            }
            temp = temp.next;
        }
        PrintList(head);
    }

    public static void loopDetect(ListNode head) {

        ListNode slow;
        ListNode fast;
        slow = fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("True - Loop exists in the List.");
                break;
            }
        }

        if (fast.next == null) {
            System.out.println("False - Loop doesn't exist in the list");
        }

    }

    public static String detectCycle(ListNode head) {

        // HashSet Implementation
        // HashSet<ListNode> set = new HashSet<>();
        // ListNode temp = head;

        // while (temp != null) {
        // if (set.contains(temp)) {
        // System.out.println(temp.value);
        // break;
        // } else {
        // set.add(temp);
        // }
        // temp = temp.next;
        // }

        // if (temp == null) {
        // System.out.println("Null");
        // }

        // HashMap Implementation (returns index)

        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        ListNode temp = head;

        int counter = 0;
        while (temp != null) {
            if (map.containsKey(temp)) {
                int val = map.get(temp);
                return "node is " + val;
            } else {
                map.put(temp, counter);
                counter++;
            }
            temp = temp.next;
        }

        return null;
    }

    public static void reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        PrintList(head);

    }

    public static void palindrome(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        int i = 1;
        while (temp != null) {
            map.put(i, temp.value);
            temp = temp.next;
            i++;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp = prev;
        int a = 1;
        while (temp != null) {

            if (temp.value == map.get(a)) {
                temp = temp.next;
                a++;
            } else {
                System.out.println("No, It's not a Palindrome.");
                break;
            }
        }

        if (a - 1 == map.size()) {
            System.out.println("Yes, It's a Palindrome.");
        }

    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(7);
        ListNode n5 = new ListNode(6, n6);
        ListNode n4 = new ListNode(5, n5);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode head = new ListNode(1, n1);
        // n6.next = n2;
        // PrintList(head);
        // addNode(4, 8, head);
        // deleteNode(8, head);
        // System.out.println(detectCycle(head));
        // PrintList(head);
        // reverseLL(head);
        palindrome(head);
    }

}
package week1;

public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }



    @Override
    public String toString() {
        return "week1.ListNode{" + "val=" + val + ", next=" + next + '}';
    }
}

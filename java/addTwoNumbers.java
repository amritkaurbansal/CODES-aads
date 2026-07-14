class Solution {
    public Node addTwoNumbers(Node head1, Node head2) {

        Node dummy = new Node();
        Node curr = dummy;
        int carry = 0;

        while (head1 != null || head2 != null || carry != 0) {

            int sum = carry;

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;

            Node temp = new Node();
            temp.data = sum % 10;
            curr.next = temp;
            curr = temp;
        }

        return dummy.next;
    }
}
package LeetcodeQuestions;

public class SplitLLInParts {

    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode ans[] = new ListNode[k];

        ListNode temp = head;

        //calculating length
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        //calculating baseSize and ExtraNodes
        int baseSize = (len / k);
        int extraNodes = (len % k);

        //creating pointers
        ListNode prev = null;
        ListNode curr = head;

        //converting into parts
        for (int part = 0; part < k; part++) {

            //handling an null exception
            if (curr == null) {
                ans[part] = curr;
                continue;
            }
            ans[part] = curr;

            //finding width of current subList
            int width = baseSize + (extraNodes > 0 ? 1 : 0);
            extraNodes--;

            for (int i = 1; i <= width; i++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = null;
            prev = null;

        }
        return ans;

    }
}

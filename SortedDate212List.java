public class SortedDate212List extends Date212List{
    public SortedDate212List(){
        super();
    } //no-argument constructor

    protected void add(Date212 d){
        if (length == 0) append(d); //if statement for when the sorted list is first established
        else{
            Date212Node newNode = new Date212Node(d);
            Date212Node cu = first;
            Date212Node pr = null;

            while (cu != null && d.compareTo(cu.data) >= 0){
                pr = cu;
                cu = cu.next;
            } //iterates through the while loop

            if (pr == null){
                newNode.next = first;
                first = newNode;
            }else{
                pr.next = newNode;
                newNode.next = cu;
                if (cu == null) last = newNode;
            } //inserts the newNode wherever appropiate (if statement handles if the list is empty [thus pr being null])
        }
        length++;
    } //add method
} //class SortedDate212List
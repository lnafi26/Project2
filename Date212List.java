public abstract class Date212List{
    protected Date212Node first, last;
    protected int length;

    public Date212List(){
        first = null;
        last = first;
        length = 0;
    } //no-argument constructor

    protected void append(Date212 d){
        if (first == null && last == null){
            Date212Node dummy = new Date212Node(d);
            first = dummy;
            last = dummy;
        }else{
            Date212Node newNode = new Date212Node(d);
            last.next = newNode;
            last = newNode;
            length++;
        }
    } //append method

    protected abstract void add(Date212 d); //abstract add method

    public void printList(){
        if (length < 1) System.out.println("Empty linked list!");
        else{
            Date212Node p = first;
            while (p != null){
                System.out.println((p.data).toString());
                p = p.next;
            }
        }
    } //printList method

    public int getLength(){
        return length;
    } //getter method for length of the list

    public Date212Node getFirst(){
        return first;
    } //getter method for the first node of the list
} //class Date212List
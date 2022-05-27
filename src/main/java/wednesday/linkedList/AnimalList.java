package wednesday.linkedList;

public class AnimalList {
    private AnimalListItem head;

    public void add (Animal animal){
        if (head == null){
            head = new AnimalListItem(animal);
        }
        else {
            AnimalListItem current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new AnimalListItem(animal));
        }
    }

    public void remove (Animal animal){
        }

    @Override
    public String toString() {
        //head.toString();
        AnimalListItem current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
            //return + "->" + "->" + ;
return "";

    }
}

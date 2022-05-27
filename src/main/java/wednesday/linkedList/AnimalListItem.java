package wednesday.linkedList;

public class AnimalListItem {
    Animal value;
    AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next){
        this.next = next;

    }
}

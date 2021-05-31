import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    Inventory(){
        this.items = new ArrayList<Item>();
    }

    public void add(Item item){
//        item.isPickedUp = false;
        items.add(item);
    };

    public void remove(Item item){

        items.get(items.indexOf(item)).isPickedUp = true;
        items.remove(item);

    };

    public ArrayList<Item> getList(){
        return items;
    }


    public void show(){

        if(items.size() == 0){
            System.out.println("У вас нет ни одного предмета");
        }
        else {
            System.out.println("В данный момент у вас есть вот что:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(i + " " + items.get(i).name);
            }
        }
    };
}

import org.jetbrains.annotations.NotNull;

public class Item {

    public String name;
    public String description;
    int x;
    int y;
    public boolean isPickedUp;


    Item(String n, String desc, int x, int y){
        this.name = n;
        this.description = desc;
        this.x = x;
        this.y = y;
        this.isPickedUp = false;
    }

    public void use(@NotNull Door door){
        if (description.equals(door.getMaterial())){
            door.Open();
        }
        else{
            System.out.println("Этот предмет не подходит чтобы открыть данную дверь.");
        }
    }

    public int getX(){
        if(!isPickedUp){
            return x;
        }
        return -100;
    };

    public int getY(){
        if(!isPickedUp){
            return y;
        }
        return -100;
    };

    @Override
    public int hashCode() {

        int k = name.length();
        int sum = 0;
        for(int i = 0 ; i < k-1 ; i++){
            sum += name.charAt(i)<<(5*i);
        }

        int hash = 7;
        hash = 31 * hash + sum;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Item i = (Item) o;
        return name.equals(i.name);
    }

    public String toString(){
        return name + " opens " + description + " doors";
    }
}

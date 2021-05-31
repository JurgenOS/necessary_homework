public class Player {

    public Location location;
    private  Inventory inventory;

    Player(Location l, Inventory inv){

        this.location = l;
        this.inventory = inv;

    }

    public void moveUP(){
        this.location.setY(
                this.location.getY() + 1
        );
    }

    public void moveDOWN(){
        this.location.setY(
                this.location.getY() - 1
        );
    }

    public void moveLEFT(){
        this.location.setX(
                this.location.getX() - 1
        );
    }

    public void moveRIGHT(){
        this.location.setX(
                this.location.getX() + 1
        );
    }

    public void pickItemUp(Item item){
        inventory.add(item);
    }


    public void addItemToInventory(Item item){
        inventory.add(item);
    }
    public void removeItemFromInventory(Item item){
        inventory.remove(item);
    }

    public void useItem(int i, Door door) throws IndexOutOfBoundsException{
        try {
            inventory.getList().get(i).use(door);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Элемента с индексом " + i + " нет в инветаре!");
        }
    }

    public void showItems(){
        inventory.show();
    }

}

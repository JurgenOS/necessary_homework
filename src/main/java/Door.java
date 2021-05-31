public class Door {

    public Location location_1;
    public Location location_2;

    private int x1;
    private int y1;

    private int x2;
    private int y2;

    private String material;
    private boolean isOpen;

    Door(Location location_1, Location location_2, int x1, int y1, int x2, int y2, String material){

        this.location_1 = location_1;
        this.location_2 = location_2;
        this.material = material;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.isOpen = false;
    }

    public String getMaterial(){return this.material;}

    public boolean isOpen(){
        return this.isOpen;
    }

    public void Open(){
        this.isOpen = true;
    }

    public int getX1(){
        return this.x1;
    }

    public int getY1(){
        return this.y1;
    }

    public int getX2(){ return this.x2; }

    public int getY2(){
        return this.y2;
    }
}

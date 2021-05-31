
public class Location {

    private int x;
    private int y;
    public int id;
    public String name;


    public Door[] doors;
    public Inventory inventory;

    Location(String name, int id, int x, int y){

        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.inventory = new Inventory();
    }

    public void setX(int x){

        if(x > 5 || x < 0){
            System.out.println("Вы успёрлись в стену по координате 'x'");
        }
        else {
            this.x = x;
        }
    }

    public void setY(int y){
        if(y > 5 || y < 0){
            System.out.println("Вы успёрлись в стену по координате 'y'");
        }
        else {
            this.y = y;
        }
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Location l = (Location) o;
        return id == l.id
                && (name.equals(l.name));
    }

    public boolean isFinish(){

        Integer temp_id = this.id;

        if(temp_id.equals(-100)){
            return true;
        }
        else{return false;}
    }
}

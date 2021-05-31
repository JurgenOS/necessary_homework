import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class GameTests {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void runTest(){

        Game g = new Game();
        String s;
        String commands =   "HELP" + "\n" +

                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "PICK UP" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "USE 0" + "\n" +
                            "CHANGE LOCATION" + "\n" +

                            "LEFT" + "\n" +
                            "LEFT" + "\n" +
                            "LEFT" + "\n" +
                            "LEFT" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "PICK UP" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "DOWN" + "\n" +
                            "DOWN" + "\n" +
                            "DOWN" + "\n" +
                            "USE 1" + "\n" +
                            "CHANGE LOCATION" + "\n" +

                            "UP" + "\n" +
                            "UP" + "\n" +
                            "UP" + "\n" +
                            "PICK UP" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "RIGHT" + "\n" +
                            "DOWN" + "\n" +
                            "DOWN" + "\n" +
                            "DOWN" + "\n" +
                            "INVENTORY" + "\n" +
                            "USE 2" + "\n" +
                            "CHANGE LOCATION";

        for(int j=0; j < commands.split("\n").length; j++) {

            s = commands.split("\n")[j];

            g.Pickupability = false;
            g.Changeability = false;
            g.currentDoor = null;

            if (g.p.location.isFinish()){
                System.out.println("Вы вышли наружу и спаслись, поздравляю!");
                System.out.println("КОНЕЦ");
                break;
            }

            System.out.println(
                    "Вы находитесь в локации: " + "'" + g.p.location.name + "'" + "\n" +
                            "x: " + g.p.location.getX() + " y: " + g.p.location.getY() + "\n" +
                            "для справки по командам введите 'HELP'" + "\n"
            );


            for(Item item : g.p.location.inventory.getList()){

                if(item == null){continue;}

                Integer temp_x = g.p.location.getX();
                Integer item_x = item.getX();

                Integer temp_y = g.p.location.getY();
                Integer item_y = item.getY();

                if(temp_x.equals(item_x) && temp_y.equals(item_y)) {
                    g.Pickupability = true;
                    g.PickUpItem = item;
                    System.out.println("Вы нашли " + item.name + ", поднять?");
                    break;
                }
            }


            for(Door door : g.p.location.doors){

                if(door == null){continue;}

                Integer temp_x = g.p.location.getX();
                Integer temp_y = g.p.location.getY();

                if(door.location_1.equals(g.p.location)){

                    Integer door_x = door.getX1();
                    Integer door_y = door.getY1();

                    if(temp_x.equals(door_x) && temp_y.equals(door_y)) {

                        if(!door.isOpen()){
                            System.out.println("Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.");
                            g.currentDoor = door;
                            break;
                        }

                        g.Changeability = true;
                        g.NextLocation = door.location_2;
                        g.NextLocation.setX(door.getX2());
                        g.NextLocation.setY(door.getY2());

                        System.out.println("Вы нашли дверь, она открыта, перейти в другую локацию?");
                        break;
                    }
                }
                else if(door.location_2.equals(g.p.location)){

                    if(!door.isOpen()){
                        System.out.println("Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.");
                        g.currentDoor = door;
                        break;
                    }

                    Integer door_x = door.getX2();
                    Integer door_y = door.getY2();

                    if(temp_x.equals(door_x) && temp_y.equals(door_y)){

                        g.Changeability = true;
                        g.NextLocation = door.location_1;
                        g.NextLocation.setX(door.getX1());
                        g.NextLocation.setY(door.getY1());
                        System.out.println("Вы нашли дверь, она открыта, перейти в другую локацию?");
                        break;
                    }

                }
            }
            g.handleCommand(s);
        }

        String t = systemOutRule.getLogWithNormalizedLineSeparator().trim();
        String c = CorrectOutput.output.toString();

        Assert.assertEquals(c, t);
    }
}


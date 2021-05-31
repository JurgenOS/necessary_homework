import java.util.Scanner;

public class Game {

    Inventory inv;
    Location l1;
    Location l2;
    Location l3;
    Location l4;
    Door l1_l2;
    Door l2_l3;
    Door l3_finish;
    Item axe;
    Item autogen;
    Item key;
    Player p;

    String s;
    Location NextLocation;
    Door currentDoor;
    boolean Changeability;
    boolean Pickupability;
    Item PickUpItem;

    Game(){

        this.inv = new Inventory();
        this.l1 = new Location("Комната 1",1,0,0);
        this.l2 = new Location("Комната 2", 2,0,0);
        this.l3 = new Location("Комната 3", 3,0,0);
        this.l4 = new Location("Улица", -100,0,0);
        this.l1_l2 = new Door(l1, l2, 3,5,3,0, "wood");
        this.l2_l3 = new Door(l2, l3, 5,2,0,2, "iron");
        this.l3_finish = new Door(l3, l4, 5,2,-100,0, "armored");
        this.axe = new Item("Топор", "wood", 0,5);
        this.autogen = new Item("Автоген", "iron", 0,5);
        this.key = new Item("Ключ", "armored", 0,5);
        this.p = new Player(l1, inv);

        this.l1.doors = new Door[1];
        this.l1.doors[0] = this.l1_l2;
        this.l2.doors = new Door[2];
        this.l2.doors[0] = this.l1_l2;
        this.l2.doors[1] = this.l2_l3;
        this.l3.doors = new Door[2];
        this.l3.doors[0] = this.l2_l3;
        this.l3.doors[1] = this.l3_finish;
        this.l4.doors = new Door[1];
        this.l4.doors[0] = this.l3_finish;
        this.l1.inventory.add(this.axe);
        this.l2.inventory.add(this.autogen);
        this.l3.inventory.add(this.key);

        this.s = "";

        this.NextLocation = null;
        this.currentDoor = null;
        this.Changeability = false;
        this.Pickupability = false;
        this.PickUpItem = null;


    };

    public void run(){


        Scanner in = new Scanner(System.in);




        Commands.introduction();

        boolean nextLoop = true;

        do {

            this.Pickupability = false;
            this.Changeability = false;
            this.currentDoor = null;

            if (this.p.location.isFinish()){
                System.out.println("Вы вышли наружу и спаслись, поздравляю!");
                System.out.println("КОНЕЦ");
                break;
            }

            System.out.println(
                    "Вы находитесь в локации: " + "'" + this.p.location.name + "'" + "\n" +
                    "x: " + this.p.location.getX() + " y: " + this.p.location.getY() + "\n" +
                    "для справки по командам введите 'HELP'" + "\n"
            );


            for(Item item : this.p.location.inventory.getList()){

                if(item == null){continue;}

                Integer temp_x = this.p.location.getX();
                Integer item_x = item.getX();

                Integer temp_y = this.p.location.getY();
                Integer item_y = item.getY();

                if(temp_x.equals(item_x) && temp_y.equals(item_y)) {
                    this.Pickupability = true;
                    this.PickUpItem = item;
                    System.out.println("Вы нашли " + item.name + ", поднять?");
                    break;
                }
            }


            for(Door door : this.p.location.doors){

                if(door == null){continue;}

                Integer temp_x = this.p.location.getX();
                Integer temp_y = this.p.location.getY();

                if(door.location_1.equals(this.p.location)){

                    Integer door_x = door.getX1();
                    Integer door_y = door.getY1();

                    if(temp_x.equals(door_x) && temp_y.equals(door_y)) {

                        if(!door.isOpen()){
                            System.out.println("Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.");
                            this.currentDoor = door;
                            break;
                        }

                        this.Changeability = true;
                        this.NextLocation = door.location_2;
                        this.NextLocation.setX(door.getX2());
                        this.NextLocation.setY(door.getY2());

                        System.out.println("Вы нашли дверь, она открыта, перейти в другую локацию?");
                        break;
                    }
                }
                else if(door.location_2.equals(p.location)){

                    if(!door.isOpen()){
                        System.out.println("Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.");
                        this.currentDoor = door;
                        break;
                    }

                    Integer door_x = door.getX2();
                    Integer door_y = door.getY2();

                    if(temp_x.equals(door_x) && temp_y.equals(door_y)){

                        this.Changeability = true;
                        this.NextLocation = door.location_1;
                        this.NextLocation.setX(door.getX1());
                        this.NextLocation.setY(door.getY1());
                        System.out.println("Вы нашли дверь, она открыта, перейти в другую локацию?");
                        break;
                    }
                }
            }

            this.s = in.nextLine();
            nextLoop = handleCommand(s);
//            if (s.equals(Commands.PICK_UP)){
//                if(Pickupability) {
//
//                    p.location.inventory.remove(PickUpItem);
//                    p.addItemToInventory(PickUpItem);
//
//                    System.out.println("теперь у вас есть " + PickUpItem.name);
//                    continue;
//                }
//                else{
//                    System.out.println("Здесь нечего поднять!");
//                }
//            }
//
//            if (s.equals(Commands.CHANGE_LOCATION)){
//                if(Changeability) {
//                    p.location = NextLocation;
//
//                    System.out.println("теперь вы в локации: '" + p.location.name + "'");
//                    continue;
//                }
//                else{
//                    System.out.println("Чтобы сменить локацию, подойдите к двери!");
//                }
//            }
//
//            if (s.contains(Commands.USE)){
//                if(currentDoor == null){
//                    System.out.println("Чтобы использовать предмет, нужно подойти к двери");
//                    continue;
//                }
//                try {
//                    int i = Integer.parseUnsignedInt(s.split(" ")[1]);
//                    p.useItem(i, currentDoor);
//                    continue;
//                }
//                catch (NumberFormatException e){
//                    System.out.println("для индексации предметов в инвентори используются целые числа от 0");
//                }
//            }
//
//            if (s.equals(Commands.SHOW_INVENTORY)){
//                p.showItems();
//            }
//
//
//            if (s.equals(Commands.MOVE_UP)){
//                p.moveUP();
//                continue;
//            }
//            if (s.equals(Commands.MOVE_DOWN)){
//                p.moveDOWN();
//                continue;
//            }
//            if (s.equals(Commands.MOVE_LEFT)){
//                p.moveLEFT();
//                continue;
//            }
//            if (s.equals(Commands.MOVE_RIGHT)){
//                p.moveRIGHT();
//                continue;
//            }
//            if (s.equals(Commands.HELP)){
//                Commands.showHelp();
//            }


        } while (nextLoop);
    };

    public boolean handleCommand(String command){

        if (command.equals(Commands.PICK_UP)){
            if(this.Pickupability) {

                this.p.location.inventory.remove(this.PickUpItem);
                this.p.addItemToInventory(this.PickUpItem);

                System.out.println("теперь у вас есть " + this.PickUpItem.name);
            }
            else{

                System.out.println("Здесь нечего поднять!");
            }
            return true;
        }

        if (command.equals(Commands.CHANGE_LOCATION)){
            if(this.Changeability) {
                this.p.location = this.NextLocation;

                System.out.println("теперь вы в локации: '" + this.p.location.name + "'");

            }
            else{
                System.out.println("Чтобы сменить локацию, подойдите к двери!");
            }
            return true;
        }


        if (command.contains(Commands.USE)){
            if(this.currentDoor == null){
                System.out.println("Чтобы использовать предмет, нужно подойти к двери");
                return true;
            }
            try {
                int i = Integer.parseUnsignedInt(command.split(" ")[1]);
                this.p.useItem(i, this.currentDoor);
                return true;
            }
            catch (NumberFormatException e){
                System.out.println("для индексации предметов в инвентаре" +
                        "используются целые числа от 0");
                return true;
            }
        }

        if (command.equals(Commands.SHOW_INVENTORY)){
            this.p.showItems();
            return true;
        }

        if (command.equals(Commands.TERMINATE_GAME)){
            return false;
        }
        if (command.equals(Commands.MOVE_UP)){
            this.p.moveUP();
            return true;
        }
        if (command.equals(Commands.MOVE_DOWN)){
            this.p.moveDOWN();
            return true;
        }
        if (command.equals(Commands.MOVE_LEFT)){
            this.p.moveLEFT();
            return true;
        }
        if (command.equals(Commands.MOVE_RIGHT)){
            this.p.moveRIGHT();
            return true;
        }
        if (command.equals(Commands.HELP)){
            Commands.showHelp();
            return true;
        }

        System.out.println("Такой команды нет! проверьте ввод.");
        return true;

    };
}

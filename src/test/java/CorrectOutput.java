import java.util.ArrayList;

public class CorrectOutput {
    static String output = "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Все команды вводятся в верхнем регистре.\n" +
            "В случае ввода неправильной команды, она просто будет проигнорированна.\n" +
            "для движения вверх введите: UP\n" +
            "для движения вниз введите: DOWN\n" +
            "для движения влево введите: LEFT\n" +
            "для движения вправо введите: RIGHT\n" +
            "чтобы поднять предмет введите: PICK UP\n" +
            "    вы должны находится на клетке с предметом\n" +
            "чтобы посмотреть какие предметы у вас уже есть введите: PICK UP\n" +
            "    также вы увидите индексы предметов в инвентаре, их значени пригодятся при использовании команды 'USE'\n" +
            "чтобы перейти в другую локацию введите: CHANGE LOCATION\n" +
            "    вы должны находится на клетке рядом с дверью\n" +
            "    дверь должна быть открыта. Открыт её можно при помощи предмета\n" +
            "чтобы использовать предмет из инвентаря введите: USE 'индекс в инвентаре'\n" +
            "    вы должны находится на клетке рядом с дверью, выбранный предмет должен быть способен открыть дверь\n" +
            "    Например: топор может отврыть деревянную дверь, но не может открыть железную\n" +
            "              автоген откроет стальную дверь, но не сможет открыть бетонную дверь\n" +
            "              бронированную дверь, можно открыть только колючом. Его надо найти\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 1\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 3\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 4\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли Топор, поднять?\n" +
            "теперь у вас есть Топор\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 1 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 2 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 3 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.\n" +
            "Вы находитесь в локации: 'Комната 1'\n" +
            "x: 3 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она открыта, перейти в другую локацию?\n" +
            "теперь вы в локации: 'Комната 2'\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 3 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она открыта, перейти в другую локацию?\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 2 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 1 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы успёрлись в стену по координате 'x'\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 0\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 1\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 3\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 4\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли Автоген, поднять?\n" +
            "теперь у вас есть Автоген\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 1 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 2 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 3 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 4 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 5 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 5 y: 4\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 5 y: 3\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 5 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.\n" +
            "Вы находитесь в локации: 'Комната 2'\n" +
            "x: 5 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она открыта, перейти в другую локацию?\n" +
            "теперь вы в локации: 'Комната 3'\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 0 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она открыта, перейти в другую локацию?\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 0 y: 3\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 0 y: 4\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли Ключ, поднять?\n" +
            "теперь у вас есть Ключ\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 0 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 1 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 2 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 3 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 4 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы успёрлись в стену по координате 'x'\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 5\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 4\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 3\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.\n" +
            "В данный момент у вас есть вот что:\n" +
            "0 Топор\n" +
            "1 Автоген\n" +
            "2 Ключ\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы нашли дверь, она закрыта. Попытайтесь открыть её предметом из инвентаря.\n" +
            "Вы находитесь в локации: 'Комната 3'\n" +
            "x: 5 y: 2\n" +
            "для справки по командам введите 'HELP'\n" +
            "\n" +
            "Вы успёрлись в стену по координате 'x'\n" +
            "Вы нашли дверь, она открыта, перейти в другую локацию?\n" +
            "теперь вы в локации: 'Улица'";
}
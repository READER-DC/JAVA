public class MainGun {
    public static void main(String[] args) throws NotReady, OutOfRounds {
        
        Gun gun = new Gun();
        Gun beretta = new Gun("Beretta", 10);
        beretta.shoot();

        System.out.println(gun.toString());
        System.out.println(beretta.toString());

        beretta.reload();
        beretta.prepare();

        beretta.shoot();

        System.out.println(gun.toString());
        System.out.println(beretta.toString());
    }
    
}

/*
Пистолет имеет следующие свойства:

    Емкость магазина (capacity)
    Количество патронов в магазине (amount)
    Название (model)
    Индикатор готовности пистолета к стрельбе (isReady)
    Общее количество выстрелов из пистолета (totalShots)

С завода пистолет приходит разряженным.
Пистолет может стрелять. Каждый выстрел сопровождается выводом надписи "Bang!" в консоль.
Пистолет можно зарядить. При зарядке магазин заряжается максимальным количеством патронов.
Перед стрельбой пистолет необходимо подготовить.
Без патронов пистолет не стреляет.
Gun gun;
   Gun beretta("Beretta", 10);

   std::cout << gun << std::endl;
   std::cout << beretta << std::endl;

   beretta.reload();
   beretta.prepare();

   beretta.shoot();

   std::cout << gun << std::endl;
   std::cout << beretta << std::endl;
*/
   
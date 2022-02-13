class MainUnit {
    public static void main(String[] args) throws UnitIsDead {
        
        Unit barbarian = new Unit("Barbarian", 200, 20);
        Unit knight = new Unit("Knight", 180, 25);

        System.out.println(barbarian.toString());
        System.out.println(knight.toString());


        for (; knight.getHitPoints() >= 0; ) {
            System.out.println(barbarian);
            System.out.println(knight);
            barbarian.attack(knight);
        }
        barbarian.attack(knight);

        System.out.println(barbarian);
        System.out.println(knight);
        }
    
}

/*
Реализовать нижеперечисленные фичи. Использовать мозг.
Каждый юнит обладает следующими характеристиками:

    максимальный запас здоровья (hitPointsLimit)
    текущее колическтво очков здоровья (hitPoints)
    сила атаки (damage)
    имя(название) юнита (name)

Каждому юниту можно нанести урон или восстановить какое-то количество очков здоровья. При этом текущее количество очков здоровья не может становиться отрицательным. Юнит считается мертвым, когда текущее количество очков здоровья равно нулю.
Восстановить юниту можно не больше его максимального запаса здоровья.
Юнит может атаковать другого юнита, отняв у него количество жизненных сил, соответствующее его силе атаки. Если противник не был убит при атаке, то он проводит контратаку (сила атаки/2) и наносит урон нападавшему юниту.

Ограничения:

    мертвых юнитов невозможно атаковать
    мертвым юнитам невозможно восстановить очки здоровья

Пояснение.
Метод ensureIsAlive будет использоваться только внутри класса. Делать его публичным неосмысленно. Реализация будет выглядеть следующим образом:
....
Usage:
CODE
Unit barbarian("Barbarian", 200, 20);
Unit knight("Knight", 180, 25);

std::cout << barbarian << std::endl;
std::cout << knight << std::endl;

barbarian.attack(knight);

std::cout << barbarian << std::endl;
std::cout << knight << std::endl;
*/
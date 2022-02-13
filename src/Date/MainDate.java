
public class MainDate {

    public static void main(String[] args) throws InvalidDate {
        Date date = new Date(18, 06, 1997);

        try {
            date = new Date(29, 02, 1997);
        } catch (InvalidDate obj) {
            System.out.println((obj.text));
        }

        System.out.println(date.toString());

    }
}


/*
Написать класс для обработки дат. Дата принимает 3 параметра: день, месяц и год.
При этом входящие параметры необходимо проверить на соответствие требованиям григорианского календаря. То есть, необходимо учесть, что каждый месяц состоит из определенного количества дней, в году определенное количество месяцев, а сами годы бывают високосными.
Date date(18, 06, 1997);

std::cout << date << std::endl;

return 0;
*/
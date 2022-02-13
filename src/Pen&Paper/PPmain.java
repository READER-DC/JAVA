public class PPmain  {
    

    public static void main(String[] args) throws OutOfSpace, OutOfInk{
        Pen pen = new Pen();
        Paper paper = new Paper();

        pen.write(paper, "Hello, world!");
        paper.show();
        pen.write(paper, "Hello, Java!");
        paper.show();
    }
}

/*
Ручка.
Каждая ручка имеет максимальный запас чернил (inkCapacity) и текущее количество чернил (inkAmount).
Ручка пишет по бумаге. За каждый написанный символ из текущего количества чернил ручки списывается одна единица чернил. Без чернил ручка писать не может.
Если в ручке недостаточно чернил, чтобы написать все сообщение, записывается столько символов, на сколько хватает чернил.
Ручку можно перезаправить до максимального запаса чернил.

Бумага.
Каждый лист бумаги может вместить определенное количество символов (maxSymbols). Так же, в произвольный момент времени можно узнать, сколько символов уже написано на листе (symbols).
На чистом листе бумаги нет ни одного символа. КО.
Если на лист бумаги невозможно поместить все сообщение, необходимо записать столько символов, сколько может вместить лист.
На заполненный лист бумаги невозможно ничего записать.
Всегда есть возможность прочитать текст, написанный на листе бумаги.

Примечания:
ознакомиться с методами объектов std::string. Особое внимание уделить методам size(), length() и substr().
Pen pen;
Paper paper;

pen.write(paper, "Hello, world!");
paper.show();
*/
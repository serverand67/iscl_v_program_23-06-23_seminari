package claswork2;
public class Task1 {
    public static void main(String[] args) {
        try {
            myInput(-1);   //5 ok,  -1 выдаст ошибку
        } catch (MyExcheption ex){
            System.out.println("Ошибка:" + ex.getMessage());
        } finally {
            System.out.println("Выполнения блока finally");
        }
    }
    public static void myInput(int value) throws MyExcheption{
        if (value < 0){
            throw new MyExcheption("Значение не может быть отрицательным");
        }
        System.out.println("Обработка значения текста" + value);
    }
}
class MyExcheption extends Exception {
    public MyExcheption(String mes){
        super(mes);
    }

}
// это к методу myInput - можно и так
//Разница между MyException n = new MyException("Текст")
// и throw new CustomException("Значение") заключается в
// том, как они используются и в каком контексте.
//
//MyException n = new MyException("Текст") - это
// создание экземпляра пользовательского исключения
// MyException и присваивание его переменной n.
// Это позволяет вам получить доступ к этому конкретному
// исключению и использовать его по своему усмотрению.
// Вы можете передать его в другие методы, сохранить
// его для дальнейшего использования или выполнить другие
// операции с этим объектом исключения.
//
//throw new CustomException("Значение") -
// это выброс исключения CustomException.
// В этом случае создается новый объект исключения
// CustomException с указанным сообщением, и это
// исключение немедленно передается обработчику
// исключений выше по стеку вызовов. Таким образом,
// код, следующий за этой инструкцией throw, не выполняется.
//
//Итак, разница заключается в том, что
// MyException n = new MyException("Текст")
// создает объект исключения, который может быть
// использован в дальнейшем, а throw new CustomException("Значение")
// выбрасывает исключение для обработки в соответствующем блоке
// try-catch или передает его дальше по стеку вызовов для обработки в другом месте.


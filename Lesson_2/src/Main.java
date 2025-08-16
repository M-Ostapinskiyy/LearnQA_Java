public class Main {
    public static void main(String[] args) {

        int x = 134;
        int y = 345345;

        System.out.println(x + y);

        int i = 10;

        double d = 1.5;

        System.out.println(10); // если в конце числа добавить L(long) / F(float) меняем тип данных

        int a = 14;
        int b = 20;

        int result = a + b;

        System.out.println(result);

        double summa = 1.0 + 1.0;

        //--------------------------

        int oranges = 10;
        int divideBy = 2;

        //--------------------------

        double result2 = oranges * 1.0 / divideBy;

        System.out.println(result2);

        System.out.println(15 % 2);

        //--------------------------
        // буквы это код, ASCII Table

        char p = 'P';
        short pShort = 80;

        System.out.println(p);
        System.out.println(pShort);

        //--------------------------
        // boolean

        int c = 10;
        int e = 10;

        boolean areEqual = c == e;

        System.out.println(areEqual);

        boolean result3 = c < e;

        System.out.println(result3);

        // что мы вообще можем делать с выводом boolean

        System.out.println(c == e);
        System.out.println(c != e);
        System.out.println(c < e);
        System.out.println(c > e);
        System.out.println(c <= e);
        System.out.println(c >= e);

        int actualResult = 8;
        boolean ate = false;

        //--------------------------

        System.out.println("Correct? " + ((oranges / divideBy) == actualResult));

        boolean dividedCorrectly = (oranges / divideBy) == actualResult;

        System.out.println("Too late? " + (!dividedCorrectly && ate));

        // оператор && - логическое "и"

        System.out.println(true && true);
        System.out.println(false && true); // если хоть с одной стороны будет false, результат всегда false
        System.out.println(false && false);

        // оператор || - логическое "или"

        System.out.println(true || true);
        System.out.println(false || false); // дает false, если с обеих сторон false, если хоть с одной стороны будет true, результат всегда true
        System.out.println(false || true);

        // оператор ! - логическое "отрицание", знак перед значением

        System.out.println(!true); // если мы отрицаем true, это false
        System.out.println(!false); // если мы отрицаем false, это true

    }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var firstNum = 78.2;
        var secondNum = 82.7;
        var totalNum = firstNum + secondNum;
        System.out.println(totalNum);
        var minusNum = secondNum - firstNum;
        System.out.println(minusNum);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var firstNum = 78.2;
        var secondNum = 82.7;
        var minusNum = secondNum - firstNum;
        System.out.println(minusNum);
        var minus2Num = secondNum % firstNum;
        System.out.println(minus2Num);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var clokWork = 640;
        var clokDay = 8;
        var worker = clokWork / clokDay;
        System.out.println("Всего работников в компании-"  + worker +  "человек");
        var peoplWork = worker + 94;
        var clokJob = peoplWork * clokDay;
        System.out.println("Если в компании работает"  + peoplWork +  "человек, то всего"  + clokJob +
                "часов работы может быть поделено между сотрудниками");
    }




}
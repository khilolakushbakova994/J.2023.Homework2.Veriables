public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
// Задача 1
//Необходимо присвоить переменным разные значения. Для решения этой задачи используйте тип переменной var.
//В программе IDEA в новом созданном вами проекте присвойте:
//переменной dog значение 8.0;
//переменной cat значение 3.6;
//переменной paper значение 763789.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println( "Задача 2");
        // Задача 2
        //Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        // Для решения этой задачи используйте тип переменной var.
        //Выведите в консоль новые значения переменных.

        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println( "Задача 3");

        //Задача 3
        //Теперь нужно уменьшить значение каждой переменной:
        // dog уменьшить на 3.5;
        // cat уменьшить на 1.6;
        // paper уменьшить на 7639.
        //Выведите в консоль новые значения переменных. Для решения этой задачи используйте тип переменной var.

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        System.out.println( "Задача 4");


        //Задача 4
        //Инициализируйте (присвойте значение) переменную friend значением 19.
        //Увеличьте значение переменной на 2, после чего поделите значение на 7.
        //После каждой операции выводите значение переменной в консоль.
        // В итоге у вас должно быть выведено 3 значения одной переменной.
        //Для решения этой задачи используйте тип переменной var.


        var friend = 19;
        System.out.println(friend);
        friend= friend + 2;
        System.out.println(friend);
        friend= friend/ 7;
        System.out.println(friend);


        System.out.println( "Задача 5");

        // Задача 5
        //Инициализируйте переменную frog значением 3.5.
        //Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.
        //После каждой операции выводите значение переменной в консоль.
        //В итоге у вас должно быть выведено 4 значения одной переменной.
        //Для решения этой задачи используйте тип переменной var.

        var frog = 3.5;
        System.out.println(frog);
        frog= frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog= frog + 4;
        System.out.println(frog);


        System.out.println( "Задача 6");

        //Задача 6
        //В боксе перед каждым боем спортсменов взвешивают.
        // Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и бой будет честным.
        //Вес одного боксера — 78.2 кг.
        //Вес второго боксера — 82.7 кг.
        //Подсчитайте и выведите в консоль общий вес двух бойцов.
        //Подсчитайте и выведите в консоль разницу между весами бойцов.
        // Для решения этой задачи используйте тип переменной var.

        var fistBoxerWeight = 78.2 ;
        var secondBoxerWeight = 82.7;
        var weightTogether = fistBoxerWeight + secondBoxerWeight ;
        System.out.println(weightTogether);
        var weightDifference = fistBoxerWeight - secondBoxerWeight ;
        System.out.println(weightDifference);


        System.out.println( "Задача 7");

        //Вычислите разницу весов спортсменов, используйте 2 способа:
        // Вычитание из большего веса меньшего.
        // С помощь функции остаток от деления.

        var difference =secondBoxerWeight % fistBoxerWeight ;
        System.out.println(difference);



        System.out.println( "Задача 8");

        // Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        // 1.   640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
        // то сколько всего работников в компании? Выведите результат задачи в консоль в формате:
        // «Всего работников в компании — … человек».
        // 2.   Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
        // если в компании работает на 94 человека больше. Выведите результат задачи в консоль в формате:
        // «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками».


        var totalWorkingHours = 640;
        var hourPerPerson = 8 ;
        var numferOfStuff = totalWorkingHours / hourPerPerson;
        System.out.println("Всего работников в компании -  " + numferOfStuff + "  человек");
        var moreWorkers = numferOfStuff + 94;
        var moreTotalHours = moreWorkers * hourPerPerson;
        System.out.println( "Если в компании работает  " + moreWorkers + " ,человек  то всего   " + moreTotalHours + "  часов работы может быть поделено между сотрудниками" );


        //только нет вычитания












    }

}




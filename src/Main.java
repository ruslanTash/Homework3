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
    public static void task1() {
        System.out.println("Задача 1");
        int i = 1548;
        byte b = 120;
        short sh = 600;
        long l = 888899999000L;
        float f = 745.5f;
        double d = 548.8;
        System.out.println();
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной sh с типом short равно " + sh);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        System.out.println();
        float fl = 27.2f;
        long lo = 987678965549L;
        double d2 = 2.786;
        short sh2 = 569;
        Short sh3 = -159;
        short sh4 = 27897;
        byte by = 67;
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        System.out.println();
        short studentsLudPavl = 23;
        short studentsAnnSerg = 27;
        short studentsEkaAndr = 30;
        short shits = 480;
        int students = studentsLudPavl + studentsAnnSerg + studentsLudPavl;
        int shitsForEver = shits / students;
        System.out.println("На каждого ученика рассчитано " + shitsForEver + " листов бумаги");
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        System.out.println();
        int minute2 = 16;
        int minute = minute2 / 16;
        int minute20 = minute2 * 10;
        int day = minute * 60 * 60;
        int day3 = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + minute20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        System.out.println();
        int tin = 120;
        int totalClasses = tin / (4 + 2);
        int tinWhite = totalClasses * 2;
        int tinBrown = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + tinWhite + " банок белой краски и " + tinBrown + " банок коричневой краски.");
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        System.out.println();
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastGr = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        float breakfastKg = breakfastGr / 1000f;
        System.out.println("Вес спортзавтрака составляет " + breakfastGr + " грамм, что соответствует " + breakfastKg + " килограммам");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        System.out.println();
        float targetReset = 7f;
        float dietLyteTotalDays = targetReset / 0.25f;
        float dietHardTotalDays = targetReset / 0.5f;
        float daysOnAverage = (dietHardTotalDays + dietLyteTotalDays) / 2f;
        System.out.println("В среднем, чтобы сбросить " + targetReset + " килограмм, необходимо " + daysOnAverage + " дней");
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        System.out.println();
        double incomeMasha = 67760;
        double incomeDenis = 83690;
        double incomeKris = 76230;
        System.out.println("Маша теперь получает " + incomeMasha * 1.1 + " рублей. Годовой доход вырос на " + incomeMasha * 0.1 * 12 + " рублей!");
        System.out.println("Денис теперь получает " + incomeDenis * 1.1 + " рублей. Годовой доход вырос на " + incomeDenis * 0.1 * 12 + " рублей!");
        System.out.println("Кристина теперь получает " + incomeKris * 1.1 + " рублей. Годовой доход вырос на " + incomeKris * 0.1 * 12 + " рублей!");
        System.out.println();
    }
}
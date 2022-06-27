package com.company;

public class Main {

    public static void main(String[] args) {
        // Кундорго enum тузунуз (Monday, Tuesday ...)
        //консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
        //Жуманын кундорун кыргыз тилинде корсотунуз.
        Week days = Week.CHETVERG;
        System.out.println(days);
        switch (days) {
            case PONEDELNIK:
                System.out.println("Понедельник лекция М. Алланов");
                break;
            case VTORNIK:
                System.out.println("Вторник практика айжамал");
                break;
            case SREDA:
                System.out.println("Среда кайрадан Алланов лекция");
                break;
            case CHETVERG:
                System.out.println("Четверг практика Айжамал");
                break;
            case PYATNISA:
                System.out.println("Пятница акыркы практика сабагы Максат агай");
                break;
            case SUBBOTA:
                System.out.println("Суббота кампуста даярданабыз");
                break;
            case VOSKRESENE:
                System.out.println("Воскресенье уйдо эс алам");
                break;
        }
    }
}

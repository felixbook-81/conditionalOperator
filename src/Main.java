public class Main {
    public static void main(String[] args) {


        //           Task 1

        int human = 6;

        if (human >= 18) {

            System.out.println("Если возраст человека равен " + human + " то он совершеннолетний! ");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }


    //           Task 2

    int a = 3;
        if(a< 5)

    {
        System.out.println("На улице " + a + " градусов,  нужно надеть шапку");

    } else

    {
        System.out.println("можно идти без шапки");
    }


    // task 3

    int speed = 380;
          if(speed >60)

    {
        System.out.println("Если скорость " + speed + " , то придется заплатить штраф !!!");
    }else

    {
        System.out.println("Можно ездить спокойно");
    }


    // task 4


    int age = 1;
        if(age <=2 && age< 6)

    {
        System.out.println("Если возраст человека равен " + age + "  лет , то ему нужно ходить в детский сад");
    } else if(age >=7&&age <=18)

    {
        System.out.println("Если возраст человека равен " + age + "  лет , то ему нужно ходить в школу");

    } else if(age >=18&&age <=24)

    {
        System.out.println("Если возраст человека равен " + age + "  лет , то ему нужно ходить в университет");
    }else
            System.out.println("Если возраст человека равен "+age +"  лет , то ему нужно ходить на работу");


                                      // task 5

    int childrenAge = 14;
        if (childrenAge <= 5) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему нельзя кататься на атракционе");
    } else if (childrenAge >= 5 && childrenAge <= 14) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
    } else if (childrenAge > 15) {
        System.out.println("Если возраст ребенка равен " + childrenAge + ", то он может кататься без сопровождения взрослого.");
    }




                                      // task 6


    int passengers=109;
          if(passengers <=60){
        System.out.println("Если "+passengers+" человек вагоне есть сидячие места");
    }
          else if(passengers >60 && passengers<=102 ){
        System.out.println("Если "+passengers+" человек вагоне есть стоячие места");
    }
          else if(passengers > 102 ){
        System.out.println("Если "+passengers+" человек то мест больше нет");
    }

                                        //task 7

    int one = 413;
    int two = 745;
    int three = 154;

        if (one > two && one > three){
        System.out.println("Максимальное число " + one);

    } else if (two > one && two > three) {
        System.out.println("Максимальное число " + two);

    } else if (three > one && three > two) {
        System.out.println("Максимальное число " + three);















}






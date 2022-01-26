package peaksoft.proccess;

import peaksoft.entity.Users;
import peaksoft.vseMetody.Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proccess {
    static Scanner scanner = new Scanner(System.in);

    public static void process() {
int number;
        Methods methody = new Methods();

        List<Users> users = new ArrayList<>();
        users.add(new Users(1L, "Kuti", "Gaparov", (byte) 20, "Kyrgyz"));
        users.add(new Users(2L, "Aza", "Baatyrov", (byte) 30, "Uzbek"));
        users.add(new Users(3L, "Aza", "Baatyrov", (byte) 24, "Kyrgyz"));
        users.add(new Users(4L, "Aza", "Baatyrov", (byte) 12, "Kyrgyz"));
        users.add(new Users(5L, "Bektur", "Baatyrov", (byte) 17, "Uzbek"));
        users.add(new Users(6L, "Nurik", "Babaev", (byte) 21, "Kyrgyz"));
while (true) {
    System.out.println("1.Для того чтобы вызывать готовую таблицу нажмите клавищу-->1");
    System.out.println("2.Для того чтобы Аты Аза жана жашы 20дан чон болгон баардык жумушчуларды алуу учун нажмите клавищу-->2");
    System.out.println("3.Для того чтобы Аты Аза болгон жумушчулардын жашын 18ге озгортуу учун нажмите клавищу-->3");
    System.out.println("4.Для того чтобы Аты Аза болгон жумушчуларды очуруну кааласаныз нажмите клавищу-->4");
    System.out.println("5.Для того чтобы удалить все данные в таблице нажмите клавищу-->5");
    number= scanner.nextInt();
    if(number==1) {
        for (int i = 0; i < users.size(); i++) {
            methody.create(users.get(i));
        }
    }else if (number==2){
        System.out.println(methody.reade());

    }else if(number==3){
         methody.update();
    }else if(number==4){
methody.cleane();
    }else if (number==5){
        methody.delete();
    }
    else {
        break;
    }






}

    }


}


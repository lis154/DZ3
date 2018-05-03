package com.company;



import java.util.Random;
import java.util.Scanner;

public class DZ3 {

    public static void main(String[] args) {

        igra_ugadai_chislo();
        igra_ugadai_slovo();


    }

    public static void igra_ugadai_chislo()
    {
        Scanner sc = new Scanner(System.in );
        int igra = 0;
        do {
        Random rand = new Random();
        int chisclo = rand.nextInt(9);
        int otvet = 0;
        boolean rezultat = false;

        System.out.println("Вам необходимо угадать число от 0 до 9: ");
        for (int i = 0; i < 3; i++) {
            otvet = sc.nextInt();
            if (otvet == chisclo) rezultat =  true;
            else if (otvet > chisclo) System.out.println("ваш ответ больше: ");
            else System.out.printf("Ваш ответ меньше");

            if (rezultat == true)
            {
                System.out.println("Вы угадали");
                break;
            }
            if (rezultat == false && i == 2) System.out.println("вы проиграли");
        }
            System.out.println("Повторить игру еще раз? 1 - да, 0 - нет");
            igra = sc.nextInt();

        }while (igra == 1);
        sc.close();
    }

    public static void igra_ugadai_slovo()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int chislo_v_mass = rand.nextInt(words.length);
        String zagad_slovo = words[chislo_v_mass];
        System.out.println("вы должны угадать слово");

        char[] mass_Otvetov2 = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};
        char[] mass_Otvetov = new char[zagad_slovo.length()];
        for (int i = 0; i < zagad_slovo.length(); i++) {
            mass_Otvetov[i] = '#';
        }
        boolean prov = true;
        do {
            Scanner sc1 = new Scanner(System.in );
            System.out.println("Введите слово");
            String prob_slovo = sc1.next();
            int dlinna = 0;
            if (prob_slovo.length() < zagad_slovo.length()) dlinna = prob_slovo.length(); else dlinna = zagad_slovo.length();
        for (int i = 0; i < dlinna; i++) {  //........................... Заполняем правильные буквы
            if (zagad_slovo.charAt(i) == prob_slovo.charAt(i))
                mass_Otvetov[i] = zagad_slovo.charAt(i);
        }
            for (int i = 0; i < mass_Otvetov.length; i++) { // ........... заполняем массив на вывод
                if (mass_Otvetov[i] != '#')
                {
                    mass_Otvetov2[i] = mass_Otvetov[i];
                }
            }
            String proverka1 = new String (mass_Otvetov);  // ............. из массива делаем слово

        if (proverka1.equals(zagad_slovo)) // ............................. проверяем угадали ли слово
        {
            System.out.printf("Вы угадали");
            prov = false;
        }
            else{
            String myStr = new String(mass_Otvetov2);
                System.out.println("вы пока не угадали: " + myStr);}

        }
        while (prov);



    }
}

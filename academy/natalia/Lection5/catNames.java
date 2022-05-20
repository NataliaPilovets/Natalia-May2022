package com.academy.natalia.Lection5;

public class catNames  {
//    private static String search;

    public static void main(String[] args) throws CatException{
        String catNames[] = new String[2];
        String search = "Cat";
        String result = "No CATS found";
        catNames[0] = "Barsik";
        catNames[1] = "Leopold";



        for (int i = 0;
        i < catNames.length; i++)

            if (catNames[i] == search) {
            System.out.println("имя Cat есть в массиве");
        }
        else { result = "No CATS found";
            System.out.println("имени Cat нет в массиве" + " " + result);
        }



        try { System.out.println("Начало Try");
                       testRisk(result);
            System.out.println("Конец Try");
        }
        catch (CatException e) {
            System.out.println("Найдено исключение" + result); }
        finally { System.out.println("Конец метлода");}

        }

        static void testRisk(String result) throws CatException {
            System.out.println("Начало опасного метода");
            if ("No CATS found".equals(result))
            {throw new CatException();}
                System.out.println("Конец опасного метода");
            return;

        }

            }


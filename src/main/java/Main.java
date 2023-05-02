public class Main {

    public static void main(String[] args) {


        float aFloat = 2.34f;
        boolean aBoolean = true;
        String aString = "Привет";
        short aShort = 2;
        long aLong = 2222;
        char aChar = 'b';

        // Переполнение
        byte aByte = 127;
        aByte++;
        System.out.println(aByte);

        // вычисления комбинаций типов данных (int и double)
        int aInt = 435;
        double aDouble = 2.0d;

        System.out.println(aInt + aDouble);
        System.out.println(aInt - aDouble);
        System.out.println(aInt / aDouble);
        System.out.println(aInt % aDouble);

    }
}

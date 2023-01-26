package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int iSq = i * i;
            if (iSq >= min) {
                if (iSq <= max)
                    counter++;

            }
        }
        System.out.println(counter);
        return counter;
    }
}

package by.itstep.javatraining.revision.task;

/*	Task 10. The Largest Sequence of Number Digits [наибольшая последовательность цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое наибольшее число подряд идущих
 *	цифр заданного числа равны друг другу. Если не нашлось ни одной пары, тройки
 *	и т.д. подряд идущих цифр, равных друг другу, то программа должна вывести число 1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[Sample function input 1]: 123456
 *	[Sample function output 1]: 1
 *
 *	[Sample function input 2]: 1234567789
 *	[Sample function output 2]: 2
 *
 *	[Sample function input 3]: 1122233335
 *	[Sample function output 3]: 4
 *
 *	[Sample function input 4]: 0
 *	[Sample function output 4]: 1
 *
 *	[Sample function input 5]: -15
 *	[Sample function output 5]: 1
 */

public class Task10 {
    public static int task10(long number) {
        if (number < 0) number = -number;
        int n = 1;
        int m = 1;
        for (long i = 1; i < number / 10; i *= 10) {
            if ((number / i) % 10 == (number / (i * 10)) % 10) {
                n++;
            } else if (n > m) {
                m = n;
                n = 1;
            } else n = 1;

        }
        if (n > m) m = n;
        return m;
    }
}
package by.itstep.javatraining.revision.task;

/*	Task 07. The Double Max [вторая максимальная цифра]
 *
 *	Дано целое число. Необходимо определить вторую по величине цифру данного числа,
 *	т.е. цифру, которая будет наибольшим, если из числа удалить наибольшую цифру.
 *	Если нет такой цифры, то должно быть возвращено число -1.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 12345
 *	[output 1]: 4
 *
 *	[ input 2]: -56789
 *	[output 2]: 8
 *
 *	[ input 3]: 11111
 *	[output 3]: -1
 *
 *	[ input 4]: 0
 *	[output 4]: -1
 */

public class Task07 {
    public static int task07(long number) {
        long max1 = 0;
        long a;
        if(number<0){
            number = -number;
        }
        if(number<10) return -1;
        for (long i = 1; i <= 1000000000000000000L; i = i * 10) {
            if(i>number) break;
            a =  (number / i) % 10;

            if (a > max1) {
                max1 = a;
            }
        }
        long max2 = max1;
        for (long i = 1; i <= 1000000000000000000L; i = i * 10) {
            if(i>number) break;
            a =  (number / i) % 10;

            if ((a > max2 && a != max1) || max2 == max1) {
                max2 = a;
            }
        }
        if(max2 == max1) return -1;
        return (int)max2;

    }
}

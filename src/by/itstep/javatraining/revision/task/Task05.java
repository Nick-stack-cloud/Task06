package by.itstep.javatraining.revision.task;

/*	Task 05. Max Number Digit [максимальная цифра числа]
 *
 *	Дано целое число. Необходимо найти максимальную цифру заданного числа
 *	с использованием эффективного алгоритма.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена максимальная цифра числа.
 *
 *	[ input 1]: 987_654_321
 *	[output 1]: 9
 *
 *	[ input 2]: 12345
 *	[output 2]: 5
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -15
 *	[output 4]: 5
 */


public class Task05 {
    public static int task05(long number) {
        long max = 0;
        long a;
if(number<0){
    number = -number;
}
        for (long i = 10; i <= 1000000000000000000L; i = i * 10) {
            a =  (number / i) % 10;

            if (i == 10) {
                a =  number % i;
            }
            if (a > max) {
                max = a;
            }
            if(i>number)return (int)max;
        }
        return (int)max;
    }
}
package by.itstep.javatraining.revision.task;

/*	Task X. Unique Number Digits [уникальные цифры числа]
 *
 *	Дано целое число. Необходимо определить, все ли цифры числа уникальны,
 *	т.е. среди цифр числа нет повторяющихся.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено булевское значение - результат решения задания.
 *
 *	[ input 1]: 12345
 *	[output 1]: true
 *
 *	[ input 2]: 54321
 *	[output 2]: true
 *
 *	[ input 3]: 11111
 *	[output 3]: false
 *
 *	[ input 4]: 121
 *	[output 4]: false
 *
 *	[ input 5]: -12345
 *	[output 5]: true
 *
 *	[ input 6]: 0
 *	[output 6]: true
 */

public class TaskX {
    public static boolean taskX(long number) {
        if (number < 0) number = -number;
        int flag = 1;
        for (long i = 1; i < number; i *= 10) {
            for (long j = i * 10; j < number; j *= 10) {
                if ((number / i) % 10 == (number / j) % 10) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break;
        }
        return flag == 1;
    }
    //9,78
}

package by.itstep.javatraining.revision.task;

/*	Task 06. The Count of Min Number Digits [количество наименьших цифр числа]
 *
 *	Дано целое число. Необходимо определить, какое количество цифр
 *	заданного числа равны его наименьшей цифре с использованием эффективного алгоритма.
 *
 *	Примечание
 *	Постарайтесь при решении задания использовать только одну циклическую конструкцию.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа long long.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено число, которое является решение задачи.
 *
 *	[ input 1]: 1234
 *	[output 1]: 1
 *
 *	[ input 2]: 4112
 *	[output 2]: 2
 *
 *	[ input 3]: 100
 *	[output 3]: 2
 *
 *	[ input 4]: -2222
 *	[output 4]: 4
 */

public class Task06 {
    public static int task06(long number) {
        long i=1;
        long m;
        long min=9;
        int k=0;
        if(number<0) number=-number;
        if(number == 0) return 1;
        while (i<number){
            if(i==1) m=number%10;
            else m=number/i%10;
            if(min>m) {
                min=m;
                k=0;
            }
            if(min==m) k++;
            if(i == 1000000000000000000L)return k;
            i*=10;

        }
        return k;
    }
}
package by.itstep.javatraining.revision.task;

/*	Task 03. All Integer Powers of Two [все целые степени двойк]
 *
 *	По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.
 *	В случае некорректных данных напечатайте ноль.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должна возвращаться строка, которая содержит ответ на задание.
 *
 *	[ input 1]: 40
 *	[output 1]: 1 2 4 8 16 32
 *
 *	[ input 2]: 1
 *	[output 2]: 1
 *
 *	[ input 3]: 0
 *	[output 3]: 0
 *
 *	[ input 4]: -40
 *	[output 4]: 0
 */

public class Task03 {
    public static String task03(int number) {
        int flag = 0;
        StringBuilder text = new StringBuilder("1");
        for (int i = 2; flag == 0; i = i * 2) {
            if (i <= number) {
                text.append(" ").append(i);
            } else flag = 1;
        }
        return number < 1 ? "0" : text.toString();
    }
}
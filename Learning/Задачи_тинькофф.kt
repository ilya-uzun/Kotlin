// Задачи тенькофф
/*У вас имеется ﻿N﻿ грамм серебра, из которого планируется выпускать монеты. 
Для монеты делается заготовка весом ﻿K грамм, после чего из каждой заготовки делаются монеты ﻿
M грамм каждая (из каждой заготовки — максимально возможное количество). 
Если от заготовок после этого что-то остается, то материал возвращают к началу производственного цикла и сплавляют с тем, 
что осталось при изготовлении заготовок. 
Таким образом, процесс остановится, когда в сплаве останется меньше, чем ﻿K﻿ грамм серебра.


Напишите программу, которая вычислит, сколько монет выплавится из ﻿N грамм серебра.


Формат входных данных

Числа ﻿N,K,M(1≤N,M,K≤200)N, K, M (1 ≤ N, M, K ≤ 200)N,K,M(1≤N,M,K≤200)﻿ вводятся в одну строку через пробел.


Формат выходных данных

Выведите одно число — количество изготовленных монет.


Замечание 

В первом тесте процесс выглядит так:
 из ﻿10 грамм серебра делается заготовка на ﻿5﻿ грамм, из которой вы сделаете ﻿2﻿ монеты по ﻿2 грамма каждая. 
Оставшееся серебро вернется в сплав, останется ﻿6 грамм.
 Повторив процесс, мы получим еще ﻿2 монеты, и в сплаве останется ﻿2 грамма, которых уже не хватит на заготовку. 
Таким образом, мы получим ﻿4 монеты.
*/

fun main(){
    try{
        val (N, K, M) = readLine()!!.split(' ').map(String::toInt)
        var N1 = N
        var coins = 0
        var i = 0
        println("Math.abs(K/M) - ${Math.abs(K/M)}")
        println("(M + Math.abs(K/M)) - ${(M + Math.abs(K/M))}")
        while(N1 > M){
            N1 = N1 - (M + Math.abs(K/M))
                coins += Math.abs(K/M)
                i++
        }
            println("${coins}")
            println("i - ${i}")

        } catch (ex: Exception) {
            println("Ошибка ввода")
    }
}


/* задача 2
Имеется ﻿10стаканов, по которым неравномерно разлита кола.
 Одним действием разрешается взять один стакан и сколько-то колы (возможно, всю) 
из этого стакана разлить по остальным стаканам в любых пропорциях 
(соответственно, в некоторые стаканы можно ничего не наливать).


За какое наименьшее количество действий можно честно (поровну) 
разделить колу между всеми стаканами?


Формат входных данных 

На вход подается ﻿10 целых чисел ﻿aia_iai​﻿ (﻿0≤ai≤100﻿), 
каждое в отдельной строке — объем колы в стаканах.


Формат выходных данных 

Выведите одно целое число — минимальное количество действий для честного дележа колы.


Замечание 

Для того, чтобы честно разделить колу в примере, 
достаточно разлить излишки из первого стакана и второго стакана 
(содержащих ﻿29 и ﻿27 единиц колы соответственно).
 В итоге во всех стаканах останется по ﻿10единиц колы. 
Ввод
29
27
2
3
4
5
6
7
8
9
Вывод 
2
*/


/*Задача 3
Магический квадрат — это квадрат ﻿3×33 × 33×3﻿, в каждой из ячеек которого записаны числа от ﻿000﻿ до ﻿999﻿. Ячейки пронумерованы и различны между собой, так что повороты такого квадрата не допускаются.


Посчитайте, сколько есть различных способов заполнить такой квадрат числами (не обязательно различными!), чтобы сумма в каждой строке и в каждом столбце была равна в точности ﻿NNN﻿.


Формат входных данных 

Единственная строка входных данных содержит целое число ﻿NNN﻿ ﻿(0≤N≤109)(0 ≤ N ≤ 10^9)(0≤N≤109)﻿.


Формат выходных данных 

Требуется вывести одно число — искомое количество расстановок.


Замечание 

В примере из условия существует всего одна допустимая расстановка — это таблица ﻿3×33 × 33×3﻿, состоящая из нулей. Очевидно, что сумма элементов в любой строке или столбце в такой расстановке равна ﻿000﻿.

ввод
0
вывод
1

*/


/*Задача 4
Вы решили провести эстафету на электросамокатах. Эстафета состоит из ﻿NNN﻿ этапов, каждый длиной ﻿aia_iai​﻿ километров ﻿(1≤i≤N)(1 ≤ i ≤ N)(1≤i≤N)﻿. У вас имеется бесконечное количество одноразовых аккумуляторов, каждый из которых может заправить электросамокат на ﻿KKK﻿ километров. Перед каждым этапом вы можете взять сколько угодно аккумуляторов с собой. В конце этапа вы должны сдать свои одноразовые аккумуляторы на переработку.

В процессе подготовки эстафеты выяснилось, что последовательно идущие этапы можно объединить в один этап. За счет этого вам может понадобиться меньше аккумуляторов. Тем не менее, нельзя объединять больше, чем ﻿MMM﻿ этапов подряд.


Напишите программу, которая определяет, какое максимальное число аккумуляторов можно сэкономить с помощью объединения этапов.


Формат входных данных 

В первой строке заданы ﻿333﻿ натуральных числа ﻿NNN﻿, ﻿MMM﻿ и ﻿KKK﻿ ﻿(N≤106,M≤10,K≤108)(N ≤ 10^6, M ≤ 10, K ≤ 10^8)(N≤106,M≤10,K≤108)﻿.

Во второй строке заданы ﻿NNN﻿ натуральных чисел ﻿aia_iai​﻿ ﻿(ai≤109)(a_i ≤ 10^9)(ai​≤109)﻿.


Формат выходных данных 

В первой строке выведите одно натуральное число ﻿FFF﻿ — на сколько можно сократить количество используемых аккумуляторов. Разумеется, ﻿FFF﻿ должно быть максимально возможным.

Во второй строке выведите одно натуральное число ﻿PPP﻿ — количество групп объединённых этапов.

Затем выведите сами группы в ﻿PPP﻿ строк — по ﻿222﻿ натуральных числа ﻿sis_isi​﻿ и ﻿cic_ici​﻿, где ﻿sis_isi​﻿ — номер первого этапа в группе, а ﻿cic_ici​﻿ — количество этапов в группе. Все ﻿sis_isi​﻿ должны идти в порядке возрастания, а ﻿cic_ici​﻿ не должно превосходить ﻿MMM﻿. Если существует несколько оптимальных решений, разрешается вывести любое.


Замечание 

В первом тесте вы можете объединить первые три этапа, тем самым потратив всего ﻿111﻿ аккумулятор вместо трех.

Во втором тесте видно, что по правилам нельзя объединить больше ﻿333﻿ этапов подряд, так что придется дважды объединять этапы. 

ввод
5 3 3
1 1 1 3 3
вывод
2

ввод
6 3 3
1 1 1 1 1 1
вывод
4
2
1 3
4 3

ввод
5 5 2
2 4 6 8 10
вывод
0
0


*/


/*Задача 5
Вам дана строка ﻿sss﻿, написанная на бумажной полоске, а также строки ﻿t1t_1t1​﻿ и ﻿t2t_2t2​﻿, состоящие из маленьких букв латинского алфавита. Вы хотите выделить некоторые буквы строки ﻿sss﻿ красным цветом, а остальные синим цветом таким образом, чтобы поставленные рядом красные куски давали строку ﻿t1t_1t1​﻿, а синие — ﻿t2t_2t2​﻿ (куски в новых строках должны находиться в том же порядке, что и в исходной строке ﻿sss﻿).

От вас требуется вывести количество стыков кусков разного цвета в корректной раскраске исходной строки ﻿sss﻿. Если существует несколько таких раскрасок, то выведите минимально возможный ответ.


Формат входных данных 

На вход подаются ﻿333﻿ строки ﻿sss﻿, ﻿t1t_1t1​﻿, ﻿t2t_2t2​﻿ ﻿(1≤∣t1∣,∣t2∣≤1000(1 ≤ |t_1|, |t_2| ≤ 1000(1≤∣t1​∣,∣t2​∣≤1000﻿, где ﻿∣ti∣|t_i|∣ti​∣﻿ — длина строки ﻿tit_iti​﻿﻿)))﻿.


Формат выходных данных 

Программа должна выводить на экран одно число — минимально возможное количество пар соседних символов разного цвета в корректной раскраске строки ﻿sss﻿.


Замечание 1

В первом примере предлагается разделение «stopgame» → StopgAMe (разные цвета обозначены разными регистрами). Можно видеть, что тут есть три пары соседних символов разного цвета.


Замечание 2

Гарантируется, что существует хотя бы одно корректное разбиение строки ﻿sss﻿ на строки ﻿t1t_1t1​﻿ и ﻿t2t_2t2​﻿.



ввод
stopgame
sam
topge

вывод
3
ввод
ababbaba
abbb
abaa

вывод
4


ввод
ljjljlljjl
jljjl
ljljl
вывод
3
*/


/*Задача 6
Вы пишете ПО, отслеживающее сорняки на ферме. Ваша ферма представлена двумерной плоскостью, а датчики передают вам события двух типов:

    Сорняк вырос в точке ﻿(x,y)(x, y)(x,y)﻿ (возможно, раньше там уже были другие сорняки).
    В точке ﻿(x,y)(x, y)(x,y)﻿ был срублен ровно один сорняк.

Поскольку на ферме есть всего два комбайна, от вас требуется не только обрабатывать информацию с датчиков, но еще и находить среднюю линию для сорняков. Средняя линия — это вертикальная прямая вида ﻿x=a+12x = a + \frac{1}{2}x=a+21​﻿ (﻿aaa﻿ — целое число), что количество сорняков слева от этой прямой строго равно количеству сорняков справа от этой прямой, и ﻿aaa﻿ максимально.


Формат входных данных 

В первой строке вводится одно целое число ﻿nnn﻿ — количество событий ﻿(1≤n≤106)(1 ≤ n ≤ 10^6)(1≤n≤106)﻿.

В следующих ﻿nnn﻿ строках вводятся описания событий трех видов.

    «﻿A x yA\ x\ yA x y﻿» — Сорняк вырос в точке с целочисленными координатами ﻿(x,y)(x, y)(x,y)﻿ ﻿(1≤x,y≤109)(1 ≤ x, y ≤ 10^9)(1≤x,y≤109)﻿.
    «﻿D x yD\ x\ yD x y﻿» — Сорняк исчез из точки с целочисленными координатами ﻿(x,y)(x, y)(x,y)﻿ ﻿(1≤x,y≤109)(1 ≤ x, y ≤ 10^9)(1≤x,y≤109)﻿. Гарантируется, что до этого запроса в этой точке существовал сорняк.
    «﻿QQQ﻿» — От вас требуется узнать текущую среднюю линию (либо вывести «﻿−1-1−1﻿», если ее нет).


Формат выходных данных 

Для каждого события третьего вида выведите в отдельной строке максимальное неотрицательное целое ﻿aaa﻿ такое, что прямая ﻿x=a+12x = a + \frac{1}{2}x=a+21​﻿ является средней линией. В случае, если такого ﻿aaa﻿ не существует, или подходящее ﻿aaa﻿ бесконечно велико, выведите «﻿−1-1−1﻿».


Замечание

На первый ﻿QQQ﻿-запрос ответ «﻿111﻿», так как среди двух сорняков с координатами ﻿(1,1)(1, 1)(1,1)﻿ и ﻿(2,1)(2, 1)(2,1)﻿ ровно один лежит левее прямой ﻿x=1+12x = 1 + \frac{1}{2}x=1+21​﻿. 


ввод
12
A 1 1
A 2 1
Q
A 2 2
A 3 1
Q
A 4 1
A 5 1
Q
D 1 1
D 5 1
Q
вывод
1
-1
2
2

*/

public class Main {
    static void main(){

        System.out.println("\n\tЗадание#1\n");
// от 1 до 10.
for(int i=1; i<=10; i++) {
    System.out.println(i);}

        System.out.println("\n\tЗадание#2\n");
// от 10 до 1.
for(int i=10; i>0; i--) {
    System.out.println(i);}

        System.out.println("\n\tЗадание#3\n");
// от 0 до 17.
    for(int i=0; i<=17; i=i+2) {
        System.out.println(i);}

        System.out.println("\n\tЗадание#4\n");
// 10 до -10.
    for(int i=10; i>-10; i--) {
        System.out.println(i);}

        System.out.println("\n\tЗадание#5\n");
// Високосные года с 1904 ПО 2096.
    for (int i=1904; i<2096; i=i+4){
        System.out.println(i+" год является високосным");}

        System.out.println("\n\tЗадание#6\n");
// Последовательность чисел от 7 до 98, каждое новое число больше на 7.
    for (int i=7; i<=98; i=i+7) {
        System.out.println(i);}

        System.out.println("\n\tЗадание#7\n");
// Последовательность чисел от 1 до 512, каждое новое число больше в 2.
        for (int i=1; i<=512; i=i*2) {
        System.out.println(i);}

        System.out.println("\n\tЗадание#8\n");
// Накапление каждый месяц 29000 руб., на год.
    int salary=29000;
    int totalSavings=0;
    for (int i=1; i<=12; i++){
        totalSavings=totalSavings+salary;
        System.out.println("Месяц " +i+ " сумма накоплений равна " +totalSavings+ " рублей");}

        System.out.println("\n\tЗадание#9\n");
// Накапление каждый месяц 29000 руб., на год под 12%.
    int total=0;
    for (int i=1; i<=12; i++){
        total=total+salary;
        total=total+total/100;
            System.out.println("Месяц " +i+ " сумма накоплений равна " +total+ " рублей");}
        System.out.println(total);

        System.out.println("\n\tЗадание#9\n");
// Таблица умножения на 2.
        int i=2;
    for (int j=1;j<=10; j++){
        System.out.println(i + "x" +j+ "="+i*j);
    }
}}
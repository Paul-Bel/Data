package HomeWork;
public class DAzadacha1 {

    public static void Prachka2(int machina, int... minutistirki) {
        System.out.print("Вы ввели следующее число минут для стирок: ");
        int u = 0;
        for (int w = 0; w < minutistirki.length; w++) {

            System.out.print(" " + minutistirki[w] + "мин.");
        }
        System.out.println();

        int max = minutistirki[0];
        int plus = minutistirki[0];
        int one = 0;
        int two = 0;
        int summ = 0;

        dveMash:
        if (machina == 2) {
            for (int b = 0; b < minutistirki.length; b++) {
                if (minutistirki[b] > one) {
                    one = minutistirki[b];
                } else {
                    plus += minutistirki[b];
                    if (plus > one) {
                        one = plus;
                    }
                }
            }
            System.out.println("Первая цифа 2, это кол-во стиральных машин ( вводить можно 1 или 2 ).");
            System.out.println("Последующие цифры: количество минут для стирки оставшимся клиентам.");
            System.out.println("Вы ввели: 2 машины, потребуется " + one + " мин.");
//            System.out.println("Если машины две, то стирать: " + one + " мин.");

        } else if (machina == 1) {
            odnaMash:
            for (int b = 0; b < minutistirki.length; b++) {
                summ += minutistirki[b];

            }
        }
        System.out.println("Первая цифа 1, это кол-во стиральных машин ( вводить можно 1 или 2 ).");
        System.out.println("Последующие цифры: количество минут для стирки оставшимся клиентам.");
        System.out.println("Если машина одна, то стирать: " + summ + " мин.");
    }
}

class Start1 {

    public static void main(String[] args) {
        DAzadacha1 r = new DAzadacha1();
        r.Prachka2(1, 3, 15, 2, 6);
    }
}

//f([3, 7, 8, 4], 1) => 22, 
//f([3, 15, 2, 6], 2) => 15, 


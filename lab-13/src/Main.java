public class Main {

    public static void main(String[] args) {
        String text = "ЗТЕФТИ ЧЦФТ!/n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ./n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ./n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";

        String[] str = text.split("/n");
        String[] words = str[3].split(" ");

        Csc csc = new Csc();

        System.out.println("Расшифровка первого предложения\n" + csc.decode(str[0], -4));

        System.out.println("\nРасшифровка второго предложения\n" + csc.decode(str[1], 8));

        System.out.println("\nРасшифровка третьего предложения");
        for (int i = 1; i < 34; i++) {
            String k = csc.decode(str[2], i);
            System.out.println(i + ". " + k);
        }

        System.out.println("\nРасшифровка чествертого предложения");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Варианты расшифровки " + (i + 1) + " слова");
            for (int j = 1; j < 34; j++) {
                System.out.println(j + ". " + csc.decode(words[i], j));
            }
        }
        System.out.println("\n" + csc.decode(str[0], -4));
        System.out.println(csc.decode(str[1], 8));
        System.out.println(csc.decode(str[2], 15));
        System.out.println(csc.decode(words[0], 3) + " " + csc.decode(words[1], 28)+ " " + csc.decode(words[2], 10) + " " + csc.decode(words[3], 2) + " " + csc.decode(words[4], 32)
                + " " + csc.decode(words[5], 29) + " " + csc.decode(words[6], 1) + " " + csc.decode(words[7], 7) + " " + csc.decode(words[8], 31)
                + " " + csc.decode(words[9], 30));
    }
}
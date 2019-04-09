public class Csc {
    private String abc = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public boolean isLetter(String ch) {
        return abc.contains(ch);
    }

    public String decode(String str, int n) {
        String[] symbols = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String symbol : symbols) {
            if (isLetter(symbol)) {
                int pos = n + abc.indexOf(symbol);
                if (pos > 32) pos = pos - 33;
                if (pos < 0) pos = pos + 33;
                stringBuilder.append(abc.charAt(pos));
            } else stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }
}
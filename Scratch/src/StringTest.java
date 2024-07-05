class StringTest {
    public static void main(String[] args) {
        String city1 = "gatlinburg";
        String city2 = "gatlinburg";


        System.out.println(city1 == city2); // incorrect
        System.out.println(city1.equals(city2));
        System.out.println();

        String city1new = city1.substring(0, 3); // returns "new"
        String city2new = city2.substring(0, 3); // returns "new"

        System.out.println(city1new == city2new); // incorrect
        System.out.println(city1new.equals(city2new));
        System.out.println();

        // in WA state, license plates are "637Y0C"
        // | means or
        String pattern = "\\d{3}[A-Z]{3}|[A-Z]{3}\\d{4}";
        String plate1 = "637YOC";
        System.out.println(plate1.matches(pattern));

        String plate2 = "AAS1124";
        System.out.println(plate2.matches(pattern));
        System.out.println();

        String poem = """
                Roses are red
                Violets are blue
                Sugar is "sweet"
                And so are you!
                """;
        System.out.println(poem);

        String pika = """
                    ■            ■
                   ■  ■        ■  ■
                   ■    ■■■■■■    ■
                  ■                ■
                 ■                  ■
                 ■     ■      ■     ■
                 ■ ■       -      ■ ■
                  ■■              ■■
                     ■ ■■■■■■■■■ ■
                """;
        System.out.println(pika);
    }
}
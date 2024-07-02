// Validates Pokemon is assigned an appropriate level in setLvl() method
class PokemonValidationTest {
    public static void main(String[] args) {
        Pokemon pkmn = new Pokemon();

        pkmn.setLvl(1); // value should "stick" and be 1, no error message
        System.out.println(pkmn);

        pkmn.setLvl(100); // value should "stick" and be 100, no error message
        System.out.println(pkmn);

        pkmn.setLvl(0); // error message, value rejected (value is still 100)
        System.out.println(pkmn);

        pkmn.setLvl(101); // error message, value rejected (value is still 100)
        System.out.println(pkmn);
    }

}
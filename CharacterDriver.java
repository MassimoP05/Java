public class CharacterDriver {
    // This class is used to test the CartoonCharacter class
    public static void main(String[] args) {
        CartoonCharacter character = new CartoonCharacter();

        character.setName("Homer");
        character.setCatchPhrase("Doh");

        System.out.println("Character Name: " + character.getName());
        System.out.println("Catch Phrase: " + character.getCatchPhrase());
    }
}

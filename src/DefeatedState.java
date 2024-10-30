public class DefeatedState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + " is defeated and cannot attack.");
    }
}

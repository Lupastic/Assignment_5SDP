public class NormalState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + " attacks with normal strength.");
    }
}

public class PoweredUpState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + " attacks with boosted strength!");
    }
}

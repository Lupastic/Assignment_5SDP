public class BoostEffectVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println(character.getName() + " receives a strength boost!");
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println(character.getName() + " takes damage!");
    }
}

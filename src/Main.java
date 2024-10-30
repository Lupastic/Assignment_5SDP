public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero");
        hero.setState(new PoweredUpState());
        hero.attack();
        hero.setStrategy(new RangedStrategy());
        hero.attack();
        GameAction attack = new AttackAction();
        attack.executeAction(hero);
        GameAction defend = new DefendAction();
        defend.executeAction(hero);
        EffectVisitor boostVisitor = new BoostEffectVisitor();
        boostVisitor.applyBoost(hero);
        boostVisitor.applyDamage(hero);
    }
}

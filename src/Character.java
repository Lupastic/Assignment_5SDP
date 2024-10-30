public class Character {
    private CharacterState state;
    private FightStrategy strategy;
    private String name;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState(); // Default state
        this.strategy = new MeleeStrategy(); // Default strategy
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack(this); // State-specific attack behavior
        strategy.fight(); // Strategy-specific fight behavior
    }

    public String getName() {
        return name;
    }
}

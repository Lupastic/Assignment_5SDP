public abstract class GameAction {
    public final void executeAction(Character character) {
        startAction();
        performAction(character);
        endAction();
    }

    protected void startAction() {
        System.out.println("Starting action...");
    }

    protected abstract void performAction(Character character);

    protected void endAction() {
        System.out.println("Action completed.");
    }
}

class AttackAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        character.attack();
    }
}

class DefendAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " is defending.");
    }
}

class HealAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " is healing.");
    }
}

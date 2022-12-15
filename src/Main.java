public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setHealth(300);
boss.setDamage(200);
boss.setDefenceType("musculs");
        System.out.println("health: " + boss.getHealth() + "\ndamage:" + boss.getDamage() + "\nTypeDefence: " + boss.getDefenceType()
        );

    }
}
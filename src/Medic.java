public class Medic extends Hero{
    int healPoints;

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность.DAMAGE");
    }
    public void increaseExperience(){
       healPoints +=   healPoints * 0.1;
    }
}

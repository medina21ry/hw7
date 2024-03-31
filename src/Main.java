public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100,20,"Телепортация"),
                new Medic(120,15,"healing",20),
                new Warrior(110,25,"CRITICAL DAMAGE")
        };

        for (Hero hero:heroes){
            if(hero instanceof Medic ){
                Medic medic = (Medic) hero;
                medic.increaseExperience();

            }
        }
    }
}
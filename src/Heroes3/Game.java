package Heroes3;

public class Game {
    public static void main(String[] args) {
        Hero Marian = new Hero(23,12,5);
        System.out.println(Marian.getAttackPoint());
        System.out.println(Marian.getDefencePoint());
        System.out.println(Marian.getFullMevementPoints());
        System.out.println(Marian.getMovementPoints());

        Marian.move(22);
        System.out.println(Marian.getMovementPoints());

        Marian.resetMovementPoints();
        System.out.println(Marian.getMovementPoints());

        Castle zamekMariana = new Castle();
        zamekMariana.setName();
        System.out.println(" ");

        Castle zamekTomka = new Castle();
        zamekTomka.setName();
        Marian.visitCastle(zamekTomka);


        System.out.println("");

        Castle zamekBozeny = new Castle();
        zamekBozeny.setName();
        zamekBozeny.ustawArmie();


        Marian.visitCastle(zamekBozeny);
        int[] potArmi = {2,3,4,6,0,0,8};
        Marian.takeArmy(potArmi);
        Marian.takeArmy(potArmi);

        System.out.println("");

    }
}

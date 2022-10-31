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

    }
}

package Heroes3;

public class Hero {
    private int movementPoints;
    private int fullMevementPoints;
    private int attackPoint;
    private int defencePoint;
    private Castle castle;

    public Hero(int movementPoints, int attackPoint, int defencePoint) {
        this.movementPoints = movementPoints;
        this.fullMevementPoints=movementPoints;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
    }

    public int getMovementPoints() {
        System.out.print("Twoje pkt ruchu to : ");
        return movementPoints;
    }

    public int getFullMevementPoints() {
        System.out.print("Twoje pełne punkty pkt ruchu to : ");
        return fullMevementPoints;
    }

    public int getAttackPoint() {
        System.out.print("Twoje pkt ataku to : ");
        return attackPoint;
    }

    public int getDefencePoint() {
        System.out.print("Twoje pkt obrony to : ");
        return defencePoint;
    }

    public Castle getCastle() {
        return castle;
    }
    public int move(int step){

        if (this.movementPoints>step) {
            this.movementPoints = this.movementPoints - step;
        } else {
            System.out.println("Nie masz tyle pkt ruchu!!");
        }
        System.out.println(" Wykonuję ruch o " +step);
        return this.movementPoints;
    }

    public void resetMovementPoints(){
        System.out.println("Resetuję punkty ruchu!!!!!### q" +
                "#);
        this.movementPoints = this.fullMevementPoints;
    }

}

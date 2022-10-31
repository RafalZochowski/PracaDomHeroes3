package Heroes3;

public class Hero {
    private double movementPoints;
    private double fullMevementPoints;
    private int attackPoint;
    private int defencePoint;
    private Castle castle;
    private int[] army = new int[7];

    public Hero(int movementPoints, int attackPoint, int defencePoint) {
        this.movementPoints = movementPoints;
        this.fullMevementPoints=movementPoints;
        this.attackPoint = attackPoint;
        this.defencePoint = defencePoint;
    }

    public double getMovementPoints() {
        System.out.print("Twoje pkt ruchu to : ");
        return movementPoints;
    }

    public double getFullMevementPoints() {
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
    public double move(int step){

        if (this.movementPoints>step) {
            this.movementPoints = this.movementPoints - step;
        } else {
            System.out.println("Nie masz tyle pkt ruchu!!");
        }
        System.out.println(" Wykonuję ruch o " +step);
        return this.movementPoints;
    }

    public void resetMovementPoints(){
        System.out.println("Resetuję punkty ruchu!!!!");
        this.movementPoints = this.fullMevementPoints;
    }

    public void visitCastle(Castle zamek){
        if (zamek.getName() == "Rampart"){
            this.attackPoint +=1;
            this.castle = zamek;
        } else if (zamek.getName() == "Stronghold" ) {
            this.defencePoint +=1;
            this.castle = zamek;
        } else if (zamek.getName() == "Necropolis") {
            this.fullMevementPoints = this.fullMevementPoints *1.1;
            this.castle = zamek;
        }else {
            this.castle = zamek;
        }
    }

    public void takeArmy(int[] wez){
        for (int i = 0; i < 7 ; i++) {
            if (castle.getArmy()[i] >wez[i]){
                this.army[i] = this.army[i] + wez[i];
                int[] arm = castle.getArmy();
                arm[i] = (arm[i] - wez[i]);
                castle.setArmy(arm);
        }
        }

    }
}

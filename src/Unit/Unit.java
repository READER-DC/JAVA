class Unit {

    private int damage;
    private int hitPoints;
    private int hitPointsLimit;
    private String name;

    public Unit(String name, int hp, int dmg){
        this.damage = dmg;
        this.hitPoints = hp;
        this.hitPointsLimit = hp;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public int getHitPointsLimit() {
        return hitPointsLimit;
    }
    public String getName() {
        return name;
    }

    public void addHitPoints(int hp) throws UnitIsDead {
        this.ensureIsAlive();
        if ( hitPoints + hp >= hitPointsLimit ){
          hitPoints = hitPointsLimit;
        } else {
          hitPoints += hp;
        }
    }

    public void takeDamage(int dmg) throws UnitIsDead {
        this.ensureIsAlive();
        if ( damage >= hitPoints ) {
          hitPoints = 0;
        } else  {
          hitPoints -= dmg;
        }
    }

    public void attack(Unit enemy) throws UnitIsDead {
        enemy.ensureIsAlive();
        enemy.takeDamage(this.damage);
        enemy.counterAttack(this);
    }

    public void counterAttack(Unit enemy) throws UnitIsDead {
        enemy.ensureIsAlive();
        enemy.takeDamage(this.damage / 2);
    }

    public String toString() {
        return name + " (" + hitPoints + ")";
    }

    private void ensureIsAlive() throws UnitIsDead {
        if ( this.hitPoints == 0 ) {
            throw new UnitIsDead();
        }
    }

}
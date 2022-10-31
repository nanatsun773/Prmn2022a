package monster;

public class HP {
    private int hp;

    // マジックナンバーを避け、瀕死の値を表す定数を用意する
    private static final int dead = 0;

    public HP(final int hp){
        this.hp = hp;
    }

    // 生きているかどうかはHPに依存する。ゆえに計算ロジックはHPクラスに記述
    public boolean isAlive(){
        return hp <= dead;
    }

    public int getHP(){
        return hp;
    }

    public void setHp(final int hp){
        this.hp = hp;
    }

}

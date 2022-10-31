import battle.IBattleMonster;
import battle.EnemyMonster;
import battle.PlayerMonster;

public class Field {
    private final IBattleMonster playerMonster;
    private final IBattleMonster enemyMonster;

    public Field(PlayerMonster playerMonster, EnemyMonster enemyMonster){
        this.playerMonster = playerMonster;
        this.enemyMonster = enemyMonster;
    }
    public void battleStart(){
        System.out.println("あ! 野生の "+enemyMonster.getName()+" が飛び出してきた！");
        System.out.println("ゆけっ！ "+playerMonster.getName()+"！\n");
        battle();
    }

    private void battle(){
        // 攻撃コマンドしかないので愚直に実装
        System.out.println("-------------");
        playerMonster.remainHpOutput();
        enemyMonster.remainHpOutput();
        System.out.println();

        // プレイヤーが先行
        if(playerMonster.getSpeed() >= enemyMonster.getSpeed()){
            if(Turn(playerMonster, enemyMonster)) return;
        }
        // 敵が先行
        else{
            if(Turn(enemyMonster, playerMonster)) return;
        }
        battle();
    }

    private boolean Turn(IBattleMonster first, IBattleMonster second){
        int firstMonsterSkillIndex = commandSelectPhase(first);
        int secondMonsterSkillIndex = commandSelectPhase(second);
        first.attackOutput();
        first.attack(firstMonsterSkillIndex, second);
        if(second.isAlive()) {
            second.loseOutput();
            first.winOutput();
            return true;
        }

        second.attackOutput();
        second.attack(secondMonsterSkillIndex, first);
        if(first.isAlive()) {
            first.loseOutput();
            second.winOutput();
            return true;
        }
        return false;
    }

    private int commandSelectPhase(IBattleMonster command){
        // 今はコマンドが「攻撃のみ」なので、戻り値がintでif文がない
        command.skillListOutput();
        return command.skillSelect();
    }

}

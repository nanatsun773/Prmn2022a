package battle;

import monster.IMonster;

public interface IBattleMonster extends IBattleOutput, IBattleCommand, IMonster {
    /**
     * ダメージを与える
     * @param skillIndex 使うスキルのindex
     * @param opponent 相手モンスター
     */
    void attack(int skillIndex, IMonster opponent);
}

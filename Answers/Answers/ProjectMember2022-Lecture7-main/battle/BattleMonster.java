package battle;

import monster.IMonster;
import monster.Monster;
import skill.Skill;

import java.util.List;

public abstract class BattleMonster extends Monster implements IBattleMonster{
    protected BattleMonster(IMonster monster) {
        super(monster);
    }

    @Override
    public final void attack(int skillIndex, IMonster opponent){
        List<Skill> skills = this.getSkills();
        int skillPower = skills.get(skillIndex).getPower();
        System.out.printf("%s は %s を繰り出した\n", this.getName(), skills.get(skillIndex).getName());
        int damage = this.getPower()+skillPower - opponent.getDefense();
        receiveDamage(damage, opponent);
    }

    protected void receiveDamage(int damage, IMonster opponent){
        int HP = opponent.getHP().getHP();
        int remainHP = HP - damage;
        if(remainHP < 0) remainHP = 0;
        opponent.getHP().setHp(remainHP);
        System.out.printf("%s に %d のダメージ！ ", opponent.getName(), damage);
        System.out.printf("(HP %d -> %d)\n\n", HP, remainHP);
        System.out.println();
    }
}

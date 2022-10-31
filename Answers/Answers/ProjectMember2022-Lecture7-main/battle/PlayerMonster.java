package battle;

import monster.IMonster;
import skill.Skill;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PlayerMonster extends BattleMonster {
    public PlayerMonster(IMonster monster) {
        super(monster);
    }

    @Override
    public final int skillSelect() {
        List<Skill> skills = this.getSkills();
        int skillMaxIndex = skills.size()-1;
        Scanner scanner = new Scanner(System.in);
        int skillIndex;
        while (true){
            try {
                System.out.print("技を選べ > ");
                skillIndex =  scanner.nextInt();
                if(!(0 <= skillIndex && skillIndex <= skillMaxIndex)) throw new InputMismatchException(String.format("0 ~ %d の範囲で入力してください\n",  skillMaxIndex));
                break;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        return skillIndex;
    }

    @Override
    public final void attackOutput(){
        System.out.println("プレイヤーの "+this.getName()+" の攻撃！");
    }

    @Override
    public final void remainHpOutput(){
        System.out.printf("プレイヤーの%sのHP: %d\n", this.getName(), this.getHP().getHP());
    }

    @Override
    public final void skillListOutput(){
        int index = 0;
        for (Skill skill: this.getSkills()){
            System.out.printf("%d -> %s (power: %d)\n", index, skill.getName(), skill.getPower());
            index++;
        }
    }

    @Override
    public void winOutput(){
        System.out.println("プレイヤーの "+this.getName()+" の勝ち！");
    }

    @Override
    public void loseOutput(){
        System.out.println("プレイヤーの "+this.getName()+" は倒れた！");
    }
}

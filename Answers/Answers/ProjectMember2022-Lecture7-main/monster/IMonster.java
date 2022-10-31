package monster;

import skill.Skill;
import java.util.List;

public interface IMonster {
    String getName();
    HP getHP();
    int getPower();
    int getDefense();
    int getSpeed();
    List<Skill> getSkills();
    boolean isAlive();
    void viewSkillList();
}

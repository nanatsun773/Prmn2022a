package monster;

import skill.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Monkey extends Monster{
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Scratch(), new Tackle(), new Ember()));
    public Monkey() {
        super("Monkey", 44, 14, 11, 31, skills);
    }
}

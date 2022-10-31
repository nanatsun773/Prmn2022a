package monster;

import skill.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Penguin extends Monster{
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Peck(), new Tackle(), new Bubble()));
    public Penguin() {
        super("Penguin", 53, 12, 13, 20, skills);
    }
}

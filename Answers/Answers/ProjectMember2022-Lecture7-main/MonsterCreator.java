

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import monster.Monkey;
import monster.Monster;
import monster.Penguin;
import monster.Turtle;

/**
 * Enumのストラテジーパターン
 * 仕様によってこういったパターンを使うかどうかは変わる(DBにMonsterデータ→オンメモリ→生成)
 */
public enum MonsterCreator {
    MONKEY(1, Monkey::new),
    PENGUIN(2, Penguin::new),
    TURTLE(3, Turtle::new);

    private final int id;
    private final Supplier<Monster> supplier;

    MonsterCreator(int id, Supplier<Monster> supplier){
        this.id = id;
        this.supplier = supplier;
    }

    private static final Map<Integer, MonsterCreator> map = Stream
            .of(MonsterCreator.values())
            .collect(Collectors.toMap(a -> a.id, a -> a));

    public static Monster of(int id){
        return Optional.ofNullable(map.get(id))
                .map(a -> a.supplier.get())
                .orElseThrow(IllegalArgumentException::new);
    }

    public static void viewMonsterList(){
        Stream.of(MonsterCreator.values()).forEach(a -> System.out.printf("%d -> %s\n", a.id, a.name()));
    }

    public static int monsterMinId(){
        return 1;
    }

    public static int monsterMaxId(){
        return MonsterCreator.values().length;
    }
}

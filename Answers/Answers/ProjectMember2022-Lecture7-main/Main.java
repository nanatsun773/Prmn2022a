import battle.EnemyMonster;
import battle.PlayerMonster;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PlayerMonster playerMonster = new PlayerMonster(MonsterCreator.of(stdinMonsterId()));
        EnemyMonster enemyMonster = new EnemyMonster(MonsterCreator.of(randomMonsterId()));
        Field filed = new Field(playerMonster, enemyMonster);
        filed.battleStart();
    }

    private static int stdinMonsterId(){
        Scanner scanner = new Scanner(System.in);
        int monsterMinId = MonsterCreator.monsterMinId();
        int monsterMaxId = MonsterCreator.monsterMaxId();
        int playerMonsterId;
        while (true){
            try {
                MonsterCreator.viewMonsterList();
                System.out.print("オー○ド博士「ここに三匹のMonsterがおるじゃろ？好きなのを一匹選ぶんじゃ」 > ");
                playerMonsterId = scanner.nextInt();
                if(!(monsterMinId <= playerMonsterId && playerMonsterId <= monsterMaxId)) throw new InputMismatchException(String.format("%d ~ %d の範囲で入力してください", monsterMinId, monsterMaxId));
                break;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
        return playerMonsterId;
    }

    private static int randomMonsterId(){
        return new Random().nextInt(MonsterCreator.values().length) + 1;
    }

}

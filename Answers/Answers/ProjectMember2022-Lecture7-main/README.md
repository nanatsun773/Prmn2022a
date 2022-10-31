【Java総合問題】○ケモンのバトルシステムの簡易版

[ProjectMember2022](https://github.com/fujiitomoko/ProjectMember2022Document)の最終問題です

目的：継承やinterface、enum, VO等を用いて実装する。
※クラス図の構成が(システム的に)正しいとは限りないので、自由に実装してみてください

![Exercise7](https://user-images.githubusercontent.com/73931800/198674135-fa6aac32-c2e8-43d5-a044-47364ea81147.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198674170-046042c8-79e0-47da-aa1e-2644b5c89dd5.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198674207-d70985fa-759a-4a8e-8faf-c75846d7760e.png)
![Exercise7](https://user-images.githubusercontent.com/73931800/198674228-e7885e6e-73be-4285-b5cd-852945ba3b65.png)

## 実行例

```shell
1 -> MONKEY
2 -> PENGUIN
3 -> TURTLE
オー○ド博士「ここに三匹のMonsterがおるじゃろ？好きなのを一匹選ぶんじゃ」 >  1
あ! 野生の Monkey が飛び出してきた！
ゆけっ！ Monkey！

-------------
プレイヤーのMonkeyのHP: 44
野生のMonkeyのHP: 44

0 -> scratch (power: 10)
1 -> tackle (power: 10)
2 -> ember (power: 10)
技を選べ > 2


プレイヤーの Monkey の攻撃！
Monkey は ember を繰り出した
Monkey に 13 のダメージ！ (HP 44 -> 31)


野生の Monkey の攻撃！
Monkey は tackle を繰り出した
Monkey に 13 のダメージ！ (HP 44 -> 31)


-------------
プレイヤーのMonkeyのHP: 31
野生のMonkeyのHP: 31

0 -> scratch (power: 10)
1 -> tackle (power: 10)
2 -> ember (power: 10)
技を選べ > 2


プレイヤーの Monkey の攻撃！
Monkey は ember を繰り出した
Monkey に 13 のダメージ！ (HP 31 -> 18)


野生の Monkey の攻撃！
Monkey は scratch を繰り出した
Monkey に 13 のダメージ！ (HP 31 -> 18)


-------------
プレイヤーのMonkeyのHP: 18
野生のMonkeyのHP: 18

0 -> scratch (power: 10)
1 -> tackle (power: 10)
2 -> ember (power: 10)
技を選べ > 2


プレイヤーの Monkey の攻撃！
Monkey は ember を繰り出した
Monkey に 13 のダメージ！ (HP 18 -> 5)


野生の Monkey の攻撃！
Monkey は ember を繰り出した
Monkey に 13 のダメージ！ (HP 18 -> 5)


-------------
プレイヤーのMonkeyのHP: 5
野生のMonkeyのHP: 5

0 -> scratch (power: 10)
1 -> tackle (power: 10)
2 -> ember (power: 10)
技を選べ > 2


プレイヤーの Monkey の攻撃！
Monkey は ember を繰り出した
Monkey に 13 のダメージ！ (HP 5 -> 0)


野生の Monkey は倒れた！
プレイヤーの Monkey の勝ち！
```

このリポジトリ内にソースコードあるのでよかったら参考にしてください

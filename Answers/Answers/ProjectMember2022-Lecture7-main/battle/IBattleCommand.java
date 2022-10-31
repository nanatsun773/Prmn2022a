package battle;

/**
 * バトルでユーザ入力を強いるクラス
 * interfaceを使うと、敵とプレイヤーで異なるコードでもアクションは同じと見なすことできる
 */
interface IBattleCommand {
    /**
     * プレイヤーと敵(CPU)のスキル選択コマンド
     * @return skillリストのindex
     */
    int skillSelect();
}

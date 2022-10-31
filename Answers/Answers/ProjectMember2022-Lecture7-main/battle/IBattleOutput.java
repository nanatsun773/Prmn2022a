package battle;

/**
 * 処理が出力のみのクラス
 */
interface IBattleOutput {
    /**
     * 攻撃時の(標準)出力
     */
    void attackOutput();

    /**
     * 残りHP出力
     */
    void remainHpOutput();

    /**
     * 使えるスキル一覧出力
     */
    void skillListOutput();

    /**
     * 勝利出力
     */
    void winOutput();

    /**
     * 敗北出力
     */
    void loseOutput();

}

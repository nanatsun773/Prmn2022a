package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private List<Account> accountList;

    public ATM() {
        this.accountList = new ArrayList<>();
    }

    //アカウントの登録
    public void registerAccount(String name, String number) {
        Account account = new Account(name, number);
        this.accountList.add(account);
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    //アカウントの存在確認
    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName() == name && account.getNumber() == number) {
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                return true;
            }
        }
        System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
        return false;
    }

    //入金
    public void deposit(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber() == number) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + number + " に " + money + " 円入金しました。");
                return;
            }
        }
        System.out.println("口座番号:" + number + " は存在しませんでした。");
    }

    //引き出し
    public long withdraw(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber() == number) {
                long newBalance = account.getBalance() - money;

                if (newBalance < 0) {
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出せませんでした。");
                    System.out.println("残高:" + account.getBalance() + "円です。");
                    return 0;
                } else {
                    System.out.print("口座番号:" + number + " から " + money + " 円引き出しました。");
                    account.setBalance(newBalance);
                    System.out.println("残高:" + account.getBalance() + "円です。");
                    return money;
                }
            }
        }
        System.out.println("口座番号:" + number + " は存在しませんでした。");
        return 0;
    }
}

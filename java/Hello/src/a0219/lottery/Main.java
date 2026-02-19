package a0219.lottery;

public class Main {
    public static void main(String[] args) {

        Membership m = Membership.getInstance();
        m.membershipGuide();

        Purchase p = Purchase.getInstance();
        p.purchaseQuestion();

        Loading l = new Loading();
        l.loading();

        Lottery lt = new Lottery();

        lt.randomLotteryNum();

        lt.lotteryNum();

        lt.result();
    }
}

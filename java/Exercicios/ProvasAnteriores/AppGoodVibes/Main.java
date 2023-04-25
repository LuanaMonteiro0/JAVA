package Exercicios.ProvasAnteriores.AppGoodVibes;

public class Main{
    public static void main(String[] args) {
        final UserAccount luana = new UserAccount("luxo@gmail.com", "Luana Monteiro");
        final UserAccount luan = new UserAccount("luan@gmail.com", "Luan Marqueti");
        final UserAccount lucas = new UserAccount("lucas@gmail.com", "Lucas Professor");
        final UserAccount ramos = new UserAccount("ramos@gmail.com", "Ramos professor aluno");

        ramos.acceptFollower(luan);
        System.out.println("Ramos Postou: To com fome");
        ramos.publish("To com fome");
        System.out.println("Posts do ramos: ");
        System.out.println(ramos.getMyPostsAsString());
        System.out.println("Posts do luan: ");
        System.out.println(luan.getTimelineAsString());
        System.out.println("Posts do lucas: ");
        System.out.println(lucas.getTimelineAsString());

        ramos.acceptFollower(lucas);
        System.out.println("Ramos Postou (dps lucas seguir): ainda To com fome");
        ramos.publish("ainda To com fome");
        System.out.println("Posts do ramos: ");
        System.out.println(ramos.getMyPostsAsString());
        System.out.println("Posts do luan: ");
        System.out.println(luan.getTimelineAsString());
        System.out.println("Posts do lucas apos seguir ramos: ");
        System.out.println(lucas.getTimelineAsString());

        lucas.clapPost(0);
        lucas.clapPost(0);
        lucas.clapPost(0);

        luan.booPost(1);
        luan.booPost(1);

        System.out.println("Posts do ramos apos reações: ");
        System.out.println(ramos.getMyPostsAsString());

        System.out.println("Overflow de timeline ramos");
        ramos.blockFollower(luan);
        for (int i = 0; i < 10; i++) {
            ramos.publish("[" + i + "]" + "oi");
        }
        System.out.println("timeline do lucas");
        System.out.println(lucas.getTimelineAsString());
        System.out.println("timeline do luan dps ramos bloqueou");
        System.out.println(luan.getTimelineAsString());

        System.out.println("follower do ramos");
        System.out.println(ramos.getMyFollowersAsString());

    }
}

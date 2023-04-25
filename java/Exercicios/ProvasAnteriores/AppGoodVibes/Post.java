package Exercicios.ProvasAnteriores.AppGoodVibes;

import java.time.LocalDateTime;

public class Post {
    private final String quote;
    private final LocalDateTime dateTime;
    private int claps;
    private int boos;
    private final UserAccount user;

    public String getQuote() {
        return quote;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

    public UserAccount getUser() {
        return user;
    }

    public Post(UserAccount account, String Quote){
        this.user = account;
        this.quote = Quote;
        this.dateTime = LocalDateTime.now();
    }

    public String getPostInfo(){
        return String.format("[%s] %s says \"%s\" | Claps: %d | Boos: %d ", dateTime, user.getUserName(), quote, claps, boos);
    }

    public void clap(){
        claps++;
    }
    public void boo(){
        boos++;
    }

}

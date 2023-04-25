package Exercicios.ProvasAnteriores.AppGoodVibes;

import java.util.LinkedList;

public class UserAccount {
    private final String email;
    private final String userName;
    private Post[] posts;
    private int numPosts;
    private Post[] timeline;
    private int numTimeline;
    private UserAccount[] followers;
    private int numFollowers;

    public UserAccount(String email, String userName){
        this.email = email;
        this.userName = userName;
        this.timeline = new Post[10];
        this.followers = new UserAccount[20];
        this.posts = new Post[20];
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public Post[] getPosts() {
        return posts;
    }

    public Post[] getTimeline() {
        return timeline;
    }

    public UserAccount[] getFollowers() {
        return followers;
    }

    public void publish(String quote){
        final Post post = new Post(this, quote);
        posts[numPosts++] = post;
        for (int i = 0; i < numFollowers; i++) {
            UserAccount follower = followers[i];
            follower.updateTimeline(post);
        }
    }

    private void updateTimeline(Post post){
        timeline[numTimeline % 10] = post;
        numTimeline++;
    }

    public void deletePost(int postInx){
        if (postInx < 0 || postInx >= numPosts) return;
        for (int i = postInx; i < numPosts-1; i++) {
            posts[i] = posts[i+1];
        }
        posts[--numPosts] = null;
    }

    public void clapPost(int postInx){
        if (postInx < 0 || postInx >= Math.min(timeline.length, numTimeline)) return;
        timeline[postInx].clap();
    }

    public void booPost(int postInx){
        if (postInx < 0 || postInx >= Math.min(timeline.length, numTimeline)) return;
        timeline[postInx].boo();
    }

    public void acceptFollower(UserAccount newFollower){
        followers[numFollowers++] = newFollower;
    }

    public void blockFollower(UserAccount theFollower){
        for (int i = 0; i < numFollowers; i++) {
            if(followers[i] == theFollower){
                for (int j = i; j < numFollowers-1; j++) {
                    followers[j] = followers[j+1];
                }
            }
        }
        followers[--numFollowers] = null;
    }

    public String getTimelineAsString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.min(numTimeline, timeline.length); i++) {
            result.append(timeline[i].getPostInfo()).append("\n");
        }
        return result.toString();
    }

    public String getMyPostsAsString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numPosts; i++) {
            result.append(posts[i].getPostInfo()).append("\n");
        }
        return result.toString();
    }
    public String getMyFollowersAsString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numFollowers; i++) {
            result.append(followers[i].getUserName()).append("\n");
        }
        return result.toString();
    }



}

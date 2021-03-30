package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private String copyright;
    private LikesInfo likeInfo;
    private ViewsInfo viewInfo;
    private RepostsInfo repostInfo;
    private int canPin;
    private int canDelete;
    private boolean isFavorite;
    private Geo geo;
    private PostSource postSource;
    private int isPinned;
    private int markedAsAds;
    public int getId() {
        return id;
    }
}
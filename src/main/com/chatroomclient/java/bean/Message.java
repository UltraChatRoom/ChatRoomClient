package main.com.chatroomclient.java.bean;

/**
 * @className: Messages
 * @program: ChatRoomClient
 * @description: //TODO 消息列表实体类（测试中）
 * @author: GirtSeanking
 * @create: 2020-11-21 12:29
 **/

public class Message {

    private String friendsName;

    private String avatarUrl;

    private String latestNews;

    public Message(String friendsName, String avatarUrl, String latestNews) {
        this.friendsName = friendsName;
        this.avatarUrl = avatarUrl;
        this.latestNews = latestNews;
    }

    public Message() {
    }

    public String getFriendsName() {
        return friendsName;
    }

    public void setFriendsName(String friendsName) {
        this.friendsName = friendsName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
    }
}
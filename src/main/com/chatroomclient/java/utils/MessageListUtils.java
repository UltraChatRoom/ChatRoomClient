package main.com.chatroomclient.java.utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import main.com.chatroomclient.java.bean.Message;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @className: MessageListUtils
 * @program: ChatRoomClient
 * @description: //TODO 消息列表工具
 * @author: GirtSeanking
 * @create: 2020-11-21 11:10
 **/

public class MessageListUtils {

    private List<Message> messages = new ArrayList<Message>();

    public void setMessages() {
        messages.add(new Message("单身hen", "main/com/chatroomclient/resources/static/img/Bro.png", "最新消息最新消息"));
        messages.add(new Message("单身hen", "main/com/chatroomclient/resources/static/img/Bro.png", "最新消息最新消息"));
        messages.add(new Message("单身hen", "main/com/chatroomclient/resources/static/img/Bro.png", "最新消息最新消息"));
    }

    public List<AnchorPaneCell> getMessagesList() {
        setMessages();
        List<AnchorPaneCell> messageItemList = new ArrayList<AnchorPaneCell>();
        for (Message message : messages) {
            messageItemList.add(new AnchorPaneCell(message));
        }
        return messageItemList;
    }

    public AnchorPane getAnchorPane(Message message) {
        AnchorPane anchorPane = new AnchorPane();

        ImageView userAvatar = new ImageView();
        Image userAvatarImage = new Image(message.getAvatarUrl());
        Circle avatarCircle = new Circle();
        avatarCircle.setCenterX(25);
        avatarCircle.setCenterY(25);
        avatarCircle.setFill(Paint.valueOf("aqua"));
        avatarCircle.setRadius(25);
        userAvatar.setImage(userAvatarImage);
        userAvatar.setFitWidth(50);
        userAvatar.setFitHeight(50);
        userAvatar.setClip(avatarCircle);
        userAvatar.setLayoutX(10);
        userAvatar.setLayoutY(10);

        Label friendName = new Label();
        friendName.setText(message.getFriendsName());
        friendName.setLayoutX(70);
        friendName.setLayoutY(10);

        Label latestNews = new Label();
        latestNews.setText(message.getLatestNews());
        latestNews.setLayoutX(70);
        latestNews.setLayoutY(30);

        anchorPane.getChildren().addAll(userAvatar,friendName,latestNews);
        return anchorPane;
    }

    public static class AnchorPaneCell extends AnchorPane {
        ImageView userAvatar = new ImageView();
        Label friendName = new Label();
        Label latestNews = new Label();
        Circle avatarCircle = new Circle();
        Label latestTime = new Label();

        public AnchorPaneCell(Message message) {

            avatarCircle.setCenterX(20);
            avatarCircle.setCenterY(20);
            avatarCircle.setFill(Paint.valueOf("aqua"));
            avatarCircle.setRadius(20);

            userAvatar.setImage(new Image(message.getAvatarUrl()));
            userAvatar.setFitWidth(40);
            userAvatar.setFitHeight(40);
            userAvatar.setClip(this.avatarCircle);
            userAvatar.setLayoutX(10);
            userAvatar.setLayoutY(10);

            friendName.setText(message.getFriendsName());
            friendName.setLayoutX(70);
            friendName.setLayoutY(10);

            latestNews.setText(message.getLatestNews());
            latestNews.setLayoutX(70);
            latestNews.setLayoutY(30);

            latestTime.setText("11-17");
            latestTime.setLayoutX(290);
            latestTime.setLayoutY(40);

            this.getChildren().addAll(userAvatar,friendName,latestNews,latestTime);
        }
    }

}
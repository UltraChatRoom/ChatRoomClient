package main.com.chatroomclient.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.com.chatroomclient.java.utils.DragUtile;

public class Main extends Application {

    private static Stage loginStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resources/view/loginView.fxml"));
        primaryStage.setTitle("登录");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/static/img/MagicChatLogo.png")));
        //窗口拖动监听器
        DragUtile.addDragListener(primaryStage, root);
        loginStage = primaryStage;
        primaryStage.show();
    }

    public static Stage getLoginStage() {
        return loginStage;
    }

    public static void main(String[] args) {
    launch(args);
  }
}

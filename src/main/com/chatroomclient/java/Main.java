package main.com.chatroomclient.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import main.com.chatroomclient.java.utils.DragUtil;

public class Main extends Application {

    /** 登陆界面 */
    private static Stage loginStage;

    /** 注册界面 */
    private static Stage registerStage = null;

    /** 密码找回界面 */
    private static Stage recoverStage = null;

    /** 好友列表界面 */
    private static Stage friendsListStage = null;

    /** 启动窗口 */
    public void startApplication() {
        launch();
    }
    public void startSucceeded() {
        System.out.println("(♥◠‿◠)ﾉﾞ  MagicChat启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "       /------\\          /------\\\n" +
                "      /        \\        /        \\\n" +
                "     /          \\      /          \\\n" +
                "    /     /\\     \\____/      /\\    \\\n" +
                "   /     /  \\     Magic     /  \\    \\\n" +
                "  /     /    \\    C.hat    /    \\     \\\n" +
                " /_____/      \\___________/      \\_____\\\n" +
                "o(*^＠^*)o 欢迎使用！！！ O(∩_∩)O\n");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册 登录窗口 启动程序
     * @Date 11:24
     * @Param [primaryStage]
     * @return void
     **/

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main/com/chatroomclient/resources/view/loginView.fxml"));
        primaryStage.setTitle("登录");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/static/img/MagicChatLogo.png")));

        //窗口拖动监听器
        DragUtil.addDragListener(primaryStage, root);
        loginStage = primaryStage;
        primaryStage.show();

        /* 创建注册窗口 */
        createRegisterStage();
        
        /* 创建找回密码窗口 */
        createRecoverStage();

        /*  创建主界面（好友列表）*/
        createFrindsListeStage();
        
        startSucceeded();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 程序主界面 好友列表窗口
     * @Date 20:11 
     * @Param []
     * @return void
     **/
    public void createFrindsListeStage() {
        friendsListStage = new Stage();
        friendsListStage.initStyle(StageStyle.UNDECORATED);
        friendsListStage.setTitle("MC");
        friendsListStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/static/img/MagicChatLogo.png")));
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 找回密码窗口
     * @Date 11:40 
     * @Param []
     * @return void
     **/
    public void createRecoverStage() {
        recoverStage = new Stage();
        recoverStage.initStyle(StageStyle.UNDECORATED);
        recoverStage.setTitle("找回密码");
        recoverStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/static/img/MagicChatLogo.png")));
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册 账号注册窗口
     * @Date 11:23
     * @Param []
     * @return void
     **/
    public void createRegisterStage() {
        registerStage = new Stage();
        registerStage.initStyle(StageStyle.UNDECORATED);
        registerStage.setTitle("注册");
        registerStage.getIcons().add(new Image(Main.class.getResourceAsStream("../resources/static/img/MagicChatLogo.png")));
    }

    public static Stage getFriendsListStage() {
        return friendsListStage;
    }

    public static Stage getRecoverStage() {
        return recoverStage;
    }

    public static Stage getRegisterStage() {
        return registerStage;
    }

    public static Stage getLoginStage() {
        return loginStage;
    }

}

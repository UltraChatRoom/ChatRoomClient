package main.com.chatroomclient.java.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import main.com.chatroomclient.java.Main;
import main.com.chatroomclient.java.utils.DragUtil;

import java.io.IOException;

/**
 * @Author GirtSeanking
 * @Description //TODO 登录窗口的控制层
 * @Date 11:26
 **/
public class LoginController {

    @FXML
    private Button loginBtn;

    @FXML
    private Button closeBtn;

    @FXML
    private TextField loginName;

    @FXML
    private TextField password;

    @FXML
    private Label forget;

    @FXML
    private Label register;
    
    /**
     * @Author GirtSeanking
     * @Description //TODO 登录按钮样式变化设置
     * @Date 10:15 
     * @Param [mouseEvent]
     * @return void
     **/
    public void loginBtnMouseEnter(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");
    }
    public void loginBtnMouseExit(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to right, #4facfe 0%, #00f2fe 100%)");
    }
    public void loginBtnMousePress(MouseEvent mouseEvent) {
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #30cfd0 0%, #330867 100%)");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 登录按钮点击响应事件
     * @Date 10:17 
     * @Param [mouseEvent]
     * @return void
     **/
    public void loginBtnMouseRelease(MouseEvent mouseEvent) {
        /* 登录按钮样式变化 */
        loginBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/com/chatroomclient/resources/view/friendsListView.fxml"));
            Parent root = loader.load();
            Main.getFriendsListStage().setScene(new Scene(root));
            /* 窗口移动监听器 */
            DragUtil.addDragListener(Main.getFriendsListStage(), root);

            /* 界面初始化 */
//            new HomeController().initialize();

            Main.getLoginStage().hide();
            Main.getFriendsListStage().show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 关闭窗口按钮点击事件响应
     * @Date 10:17 
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeMouseClick(MouseEvent mouseEvent) {
        System.out.println("(♥◠‿◠)ﾉﾞ  MagicChat关闭成功   ლ(´ڡ`ლ)ﾞ  \n" + "o(*^＠^*)o 感谢您的使用！！！ O(∩_∩)O\n");
        System.exit(0);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 关闭窗口按钮样式变化设置
     * @Date 20:43
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeMouseEnter(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #99999999");
    }
    public void closeMouseExit(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 忘记密码按钮样式变化设置
     * @Date 10:19 
     * @Param [mouseEvent]
     * @return void
     **/
    public void forgetMouseEnter(MouseEvent mouseEvent) {
        forget.setTextFill(Color.web("#4facfe"));
        forget.setUnderline(true);
    }
    public void forgetMouseExit(MouseEvent mouseEvent) {
        forget.setTextFill(Color.web("#a1a1a1"));
        forget.setUnderline(false);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 忘记密码按钮点击响应事件
     * @Date 10:49
     * @Param [mouseEvent]
     * @return void
     **/
    public void forgetMouseClick(MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/com/chatroomclient/resources/view/recoverView.fxml"));
            Parent root = loader.load();
            Main.getRecoverStage().setScene(new Scene(root));
            /* 窗口移动监听器 */
            DragUtil.addDragListener(Main.getRecoverStage(), root);
            Main.getLoginStage().hide();
            Main.getRecoverStage().show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册按钮样式变化设置
     * @Date 10:19 
     * @Param [mouseEvent]
     * @return void
     **/
    public void registerMouseEnter(MouseEvent mouseEvent) {
        register.setTextFill(Color.web("#4facfe"));
        register.setUnderline(true);
    }
    public void registerMouseExit(MouseEvent mouseEvent) {
        register.setTextFill(Color.web("#a1a1a1"));
        register.setUnderline(false);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册按钮响应事件
     * @Date 10:18 
     * @Param [mouseEvent]
     * @return void
     **/
    public void registerMouseClick(MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/com/chatroomclient/resources/view/registerView.fxml"));
            Parent root = loader.load();
            Main.getRegisterStage().setScene(new Scene(root));
            /* 窗口移动监听器 */
            DragUtil.addDragListener(Main.getRegisterStage(), root);
            Main.getLoginStage().hide();
            Main.getRegisterStage().show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

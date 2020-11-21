package main.com.chatroomclient.java.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import main.com.chatroomclient.java.common.constant.ApplicationConstant;
import main.com.chatroomclient.java.utils.SkinUtil;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;


/**
 * @author GirtSeanking
 */
public class HomeController implements Initializable {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private ImageView background = new ImageView();

    @FXML
    private Button closeBtn = new Button();

    @FXML
    private Button minBtn = new Button();

    @FXML
    private ChoiceBox<String> skinBtn = new ChoiceBox<String>();
    private ObservableList<String> options = FXCollections.observableArrayList(new SkinUtil().getSkinNames());

    @FXML
    private ImageView avatar;

    @FXML
    private Label userName = new Label();

    @FXML
    private TextField signature = new TextField();

    @FXML
    private VBox messageList = new VBox();

    /**
     * @Author GirtSeanking
     * @Description //TODO 好友列表界面初始化
     * @Date 19:22
     * @Param []
     * @return void
     **/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("主界面初始化");

        /* 皮肤选择器按钮初始化 */
        skinBtnInitialize();

        /* 设置皮肤样式和更改背景图片 */
        setBackground(ApplicationConstant.DEFAULT_SKIN);

        /* 设置用户信息 */
        setUserImformation();

        /* 设置消息列表 */
        setMessageList();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 设置皮肤样式和更改背景图片
     * @Date 20:59
     * @Param [mainSkin]
     * @return void
     **/
    public void setBackground(ApplicationConstant.MAIN_BACKGROUND mainSkin) {
        /* 设置背景图片 */
        if (mainSkin.getSkinName().equals("苏州") || mainSkin.getSkinName().equals("深圳")) {
            background.setImage(new Image(mainSkin.getSkinUrl()));
            background.setVisible(true);
            mainPane.setStyle("");
        } else {
            background.setVisible(false);
            mainPane.setStyle("-fx-background-image: url('" + mainSkin.getSkinUrl() +"');" +
                    "-fx-background-position: center center;" +
                    "-fx-background-repeat: stretch");
        }

        /* 设置按钮字体颜色 */
        closeBtn.setStyle("-fx-text-fill: rgb(" + mainSkin.getBtnColor().getRed() +"," + mainSkin.getBtnColor().getGreen() + "," + mainSkin.getBtnColor().getBlue() + ");");
        minBtn.setStyle("-fx-text-fill: rgb(" + mainSkin.getBtnColor().getRed() +"," + mainSkin.getBtnColor().getGreen() + "," + mainSkin.getBtnColor().getBlue() + ");");

        /* 设置字体颜色 */
        userName.setStyle("-fx-text-fill: rgb(" + mainSkin.getBtnColor().getRed() +"," + mainSkin.getBtnColor().getGreen() + "," + mainSkin.getBtnColor().getBlue() + ");");
        signature.setStyle("-fx-text-fill: rgb(" + mainSkin.getBtnColor().getRed() +"," + mainSkin.getBtnColor().getGreen() + "," + mainSkin.getBtnColor().getBlue() + ");");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 关闭窗口按钮点击事件响应
     * @Date 20:44
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeBtnMouseClick(MouseEvent mouseEvent) {
        System.out.println("(♥◠‿◠)ﾉﾞ  MagicChat关闭成功   ლ(´ڡ`ლ)ﾞ  \n" + "o(*^＠^*)o 感谢您的使用！！！ O(∩_∩)O\n");
        System.exit(0);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 关闭窗口按钮样式变化设置
     * @Date 20:44
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeBtnMouseEnter(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #99999999");
    }
    public void closeBtnMouseExit(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #00000000");
    }

    public void minBtnMouseClick(MouseEvent mouseEvent) {
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 小化窗口按钮点击样式变化设置
     * @Date 20:44
     * @Param [mouseEvent]
     * @return void
     **/
    public void minBtnMouseEnter(MouseEvent mouseEvent) {
        minBtn.setStyle("-fx-background-color: #99999999");
    }
    public void minBtnMouseExit(MouseEvent mouseEvent) {
        minBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 皮肤更换按钮样式变化设置
     * @Date 20:46
     * @Param [mouseEvent]
     * @return void
     **/
    public void skinBtnMouseEnter(MouseEvent mouseEvent) {
        skinBtn.setStyle("-fx-background-color: #99999999");
    }
    public void skinBtnMouseExit(MouseEvent mouseEvent) {
        skinBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 皮肤选择按钮初始化
     * @Date 20:18
     * @Param []
     * @return void
     **/
    public void skinBtnInitialize() {
        /* 设置皮肤选择器按钮的默认值 */
        skinBtn.setValue(ApplicationConstant.DEFAULT_SKIN.getSkinName());

        /* 设置选择器列表内容 */
        skinBtn.setItems(options);

        /* 添加选择器选中监听 */
        skinBtn
                .getSelectionModel()
                .selectedIndexProperty()
                .addListener(
                        new ChangeListener<Number>() {
                            @Override
                            public void changed(
                                    ObservableValue<? extends Number> observableValue,
                                    Number number,
                                    Number selectedIndex) {
                                /* 设置背景图片 */
                                setBackground(new SkinUtil().getSkinEntity(selectedIndex.intValue()));
                            }
                        });
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 设置用户的信息
     * @Date 15:44
     * @Param []
     * @return void
     **/
    private void setUserImformation() {
        /* 设置用户名 */
        userName.setText("GirtSeanking");

        /* 设置用户个性签名 */
        signature.setText("Break a leg! Someone like you. Carpe diem!");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 个性签名点击事件响应
     * @Date 18:23
     * @Param [mouseEvent]
     * @return void
     **/
    public void signatureMouseClick(MouseEvent mouseEvent) {
        signature.setEditable(true);
        signature.selectAll();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 初始化消息列表 (未实现)
     * @Date 20:54
     * @Param []
     * @return void
     **/
    public void setMessageList() {
        ImageView userAvatar = new ImageView();
        Image userAvatarImage = new Image("main/com/chatroomclient/resources/static/img/test1.png");
        Circle avatarCircle = new Circle();
        avatarCircle.setCenterX(25);
        avatarCircle.setCenterY(25);
        avatarCircle.setFill(Paint.valueOf("aqua"));
        avatarCircle.setRadius(25);
        userAvatar.setImage(userAvatarImage);
        userAvatar.setFitWidth(50);
        userAvatar.setFitHeight(50);
        userAvatar.setClip(avatarCircle);
        messageList.getChildren().add(userAvatar);
        ImageView userAvatar2 = new ImageView();
        userAvatarImage = new Image("main/com/chatroomclient/resources/static/img/Bros.png");
        userAvatar2.setImage(userAvatarImage);
        userAvatar2.setFitWidth(50);
        userAvatar2.setFitHeight(50);
        userAvatar2.setClip(avatarCircle);
        messageList.getChildren().add(userAvatar2);
        ImageView userAvatar3 = new ImageView();
        userAvatarImage = new Image("main/com/chatroomclient/resources/static/img/GitHub.png");
        userAvatar3.setImage(userAvatarImage);
        userAvatar3.setFitWidth(50);
        userAvatar3.setFitHeight(50);
        userAvatar3.setClip(avatarCircle);
        messageList.getChildren().addAll(userAvatar3);
    }
}

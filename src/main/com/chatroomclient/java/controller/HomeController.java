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
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import main.com.chatroomclient.java.common.constant.ApplicationConstant;
import main.com.chatroomclient.java.utils.MessageListUtils;
import main.com.chatroomclient.java.utils.SkinUtil;

import javax.swing.text.Style;
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
    private ListView messageList = new ListView();

    @FXML
    private AnchorPane messagesPane = new AnchorPane();
    
    @FXML
    private TreeView contactList = new TreeView();

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
        
        /* 设置联系人列表 */
        
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
                    "-fx-background-repeat: stretch;");
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

    public void minBtnMouseClick(MouseEvent mouseEvent) {
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
        messageList.setStyle("-fx-background-color: #00000000");
        messagesPane.setStyle("-fx-background-color: #00000000");

        ObservableList<MessageListUtils.AnchorPaneCell> myList = FXCollections.observableArrayList(new MessageListUtils().getMessagesList());
        messageList.setItems(myList);

        if (messageList.getItems().isEmpty()) {
            messagesPane.setStyle("-fx-background-image: url('" + ApplicationConstant.MESSAGES_BACKGROUND +"');" +
                    "-fx-background-position: center center;" +
                    "-fx-background-repeat: stretch;" +
                    "-fx-background-color: white;");
        }
    }
    
    /**
     * @Author GirtSeanking
     * @Description //TODO 设置联系人列表
     * @Date 14:05
     * @Param []
     * @return void
     **/
    public void setContactList() {
        
    }
}

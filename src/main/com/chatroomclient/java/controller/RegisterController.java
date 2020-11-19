package main.com.chatroomclient.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import main.com.chatroomclient.java.Main;
import main.com.chatroomclient.java.common.constant.UserConstants;

/**
 * @className: RegisterController
 * @program: ChatRoomClient
 * @description: //TODO 注册窗口控制层
 * @author: GirtSeanking
 * @create: 2020-11-16 21:35
 **/

public class RegisterController {

    @FXML
    private Button closeBtn;
    
    @FXML
    private Button backBtn;

    @FXML
    private Label welcomeLabel;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField registerPassword;

    @FXML
    private PasswordField registerPasswordAgain;

    @FXML
    private TextField securityQuestion;

    @FXML
    private TextField questionAnswer;

    @FXML
    private Button registerBtn;

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册窗口关闭
     * @Date 18:53
     * @Param [mouseEvent]
     * @return void
     **/
    public void closeMouseClick(MouseEvent mouseEvent) {
        System.out.println("(♥◠‿◠)ﾉﾞ  MagicChat关闭成功   ლ(´ڡ`ლ)ﾞ  \n" + "o(*^＠^*)o 感谢您的使用！！！ O(∩_∩)O\n");
        System.exit(0);
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口关闭按钮样式变化设置
     * @Date 18:53
     **/
    public void closeMouseEnter(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #99999999");
    }
    public void closeMouseExit(MouseEvent mouseEvent) {
        closeBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口返回按钮点击事件响应
     * @Date 16:39
     * @Param [mouseEvent]
     * @return void
     **/
    public void backMouseClick(MouseEvent mouseEvent) {
        Main.getRegisterStage().close();
        Main.getLoginStage().show();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 窗口返回按钮样式变化设置
     * @Date 10:50 
     * @Param [mouseEvent]
     * @return void
     **/
    public void backMouseEnter(MouseEvent mouseEvent) {
        backBtn.setStyle("-fx-background-color: #99999999");
    }
    public void backMouseExit(MouseEvent mouseEvent) {
        backBtn.setStyle("-fx-background-color: #00000000");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置昵称时的事件响应
     * @Date 18:55 
     * @Param [keyEvent]
     * @return void
     **/
    public void userNameKeyReleas(KeyEvent keyEvent) {
        judgeUserName();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户鼠标点击设置昵称时的事件响应
     * @Date 21:42 
     * @Param [mouseEvent]
     * @return void
     **/
    public void userNameMouseClick(MouseEvent mouseEvent) {
        judgeUserName();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户昵称校验
     * @Date 17:07
     * @Param []
     * @return void
     **/
    public boolean judgeUserName() {
        if (userName.getText().isEmpty()) {
            welcomeLabel.setText("注册");
            return false;
        } else if (!userName.getText().matches(UserConstants.SPACE_REG)) {
            welcomeLabel.setText("昵称中不能有空格");
            userName.setText("");
            return false;
        } else {
            if (userName.getText().length() > UserConstants.USERNAME_MAX_LENGTH) {
                welcomeLabel.setText("您输入的昵称过长");
                return false;
            }  else {
                welcomeLabel.setText("欢迎 " + userName.getText() + " 来到MC");
                return true;
            }
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置密码时的事件响应
     * @Date 18:49
     * @Param [keyEvent]
     * @return void
     **/
    public void passwordKeyRelease(KeyEvent keyEvent) {
        judgePassword();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户密码校验
     * @Date 21:28
     * @Param []
     * @return boolean
     **/
    public boolean judgePassword() {
        if (registerPassword.getText().isEmpty()) {
            welcomeLabel.setText("注册");
            return false;
        } else if (!registerPassword.getText().matches(UserConstants.SPACE_REG)) {
            welcomeLabel.setText("密码中不能存在空格");
            registerPassword.setText("");
            return false;
        } else if (registerPassword.getText().length() < UserConstants.PASSWORD_MIN_LENGTH) {
            welcomeLabel.setText("密码长度过短");
            return false;
        } else if (registerPassword.getText().length() > UserConstants.PASSWORD_MAX_LENGTH) {
            welcomeLabel.setText("密码长度过长");
            return false;
        } else if (!passwordStrengthJudgement()) {
            welcomeLabel.setText("密码至少包含数字、大小写字母、特殊字符中的两种");
            return false;
        } else if (registerPassword.getText().length() != registerPassword.getText().getBytes().length) {
            welcomeLabel.setText("密码中不能存在汉字");
            return false;
        } else {
            welcomeLabel.setText("密码格式正确");
            return true;
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 密码强度校验
     * @Date 17:06
     * @Param []
     * @return java.lang.String
     **/
    public boolean passwordStrengthJudgement() {
        int flag = 0;
        if (registerPassword.getText().matches(UserConstants.PASSWORD_REG_NUMBER)) {
            flag++;
        }
        if (registerPassword.getText().matches(UserConstants.PASSWORD_REG_LOWERCASE)) {
            flag++;
        }
        if (registerPassword.getText().matches(UserConstants.PASSWORD_REG_UPPERCASE)) {
            flag++;
        }
        if (registerPassword.getText().matches(UserConstants.PASSWORD_REG_SYMBOL)) {
            flag++;
        }
        return flag >= 2;
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户再次确认密码时的事件响应
     * @Date 18:50
     * @Param [keyEvent]
     * @return void
     **/
    public void passwordAaginKeyRelease(KeyEvent keyEvent) {
        judgePasswordAaging();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户确认密码校验
     * @Date 21:27
     * @Param []
     * @return boolean
     **/
    public boolean judgePasswordAaging() {
        if (registerPasswordAgain.getText().isEmpty()) {
            welcomeLabel.setText("注册");
            return false;
        } else if (!registerPasswordAgain.getText().matches(UserConstants.SPACE_REG)) {
            welcomeLabel.setText("不能输入空格");
            registerPasswordAgain.setText("");
            return false;
        } else if (registerPassword.getText().isEmpty()) {
            welcomeLabel.setText("您还未设置登录密码");
            registerPasswordAgain.setText("");
            return false;
        } else if (registerPassword.getText().equals(registerPasswordAgain.getText())) {
            welcomeLabel.setText("两次密码一致");
            return true;
        } else {
            welcomeLabel.setText("两次密码不一致");
            return false;
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置密保问题时的事件响应
     * @Date 21:08
     * @Param [keyEvent]
     * @return void
     **/
    public void securityQuestionKeyRelease(KeyEvent keyEvent) {
        judgeScurityQuestion();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置密保问题校验
     * @Date 21:30
     * @Param []
     * @return boolean
     **/
    public boolean judgeScurityQuestion() {
        if (securityQuestion.getText().isEmpty()) {
            welcomeLabel.setText("注册");
            return false;
        } else if (!securityQuestion.getText().matches(UserConstants.SPACE_REG)) {
            welcomeLabel.setText("设置的密保问题中不能存在空格");
            return false;
        } else if (securityQuestion.getText().length() > UserConstants.SCURITY_QUESTION_MAX_LENGTH) {
            welcomeLabel.setText("设置的密保问题内容过长");
            return false;
        } else {
            welcomeLabel.setText("请尽量设置简短又好记的问题");
            return true;
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置密保问题的答案时的事件响应
     * @Date 21:14 
     * @Param [keyEvent]
     * @return void
     **/
    public void questionAnswerKeyRelease(KeyEvent keyEvent) {
        judgeQuestionAnswer();
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 用户设置密保问题答案校验
     * @Date 21:31
     * @Param []
     * @return boolean
     **/
    public boolean judgeQuestionAnswer() {
        if (questionAnswer.getText().isEmpty()) {
            welcomeLabel.setText("注册");
            return false;
        } else if (questionAnswer.getText().matches(UserConstants.SPACE_REG)) {
            welcomeLabel.setText("设置答案中不能存在空格");
            return false;
        } else if (questionAnswer.getText().length() > UserConstants.QUESTION_ANSWER_MAX_LENGTH) {
            welcomeLabel.setText("设置的答案内容过长");
            return false;
        } else {
            welcomeLabel.setText("请尽量设置简短又好记的答案");
            return true;
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册按钮样式变化设置
     * @Date 21:33
     * @Param [mouseEvent]
     * @return void
     **/
    public void registerBtnMouseEnter(MouseEvent mouseEvent) {
        registerBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");
    }
    public void registerBtnMouseExit(MouseEvent mouseEvent) {
        registerBtn.setStyle("-fx-background-color: linear-gradient(to right, #4facfe 0%, #00f2fe 100%)");
    }
    public void registerBtnMousePress(MouseEvent mouseEvent) {
        registerBtn.setStyle("-fx-background-color: linear-gradient(to top, #30cfd0 0%, #330867 100%)");
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 注册按钮点击后的事件响应
     * @Date 21:34
     * @Param [mouseEvent]
     * @return void
     **/
    public void registerBtnMouseRelease(MouseEvent mouseEvent) {
        /* 按钮点击后样式 */
        registerBtn.setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%)");

        if (judgeRegisterForm()) {
            userReister();
        } else {
            welcomeLabel.setText("请仔细填写注册信息");
        }
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 判断注册表单
     * @Date 21:37
     * @Param []
     * @return boolean
     **/
    public boolean judgeRegisterForm() {
        if (judgeUserName()) {
            if (judgePassword()) {
                if (judgePasswordAaging()) {
                    if (judgeScurityQuestion()) {
                        if (judgeQuestionAnswer()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 进行用户注册功能
     * @Date 9:39 
     * @Param []
     * @return void
     **/
    public void userReister() {
        
    }



}

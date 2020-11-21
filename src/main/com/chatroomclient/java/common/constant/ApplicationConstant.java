package main.com.chatroomclient.java.common.constant;

import java.awt.*;

/**
 * @className: SystemConstant
 * @program: ChatRoomClient
 * @description: //TODO 系统常量信息设置
 * @author: GirtSeanking
 * @create: 2020-11-18 09:17
 **/

public class ApplicationConstant {

    /** 用户登陆账号的账号长度 */
    public static final int LOGIN_NAME_MAX_LENGTH = 10;

    /** 程序主界面背景选项 */
    public static enum  MAIN_BACKGROUND {
        /* 皮肤 */
        /* 需要添加新的皮肤在这里设置并且添加参数 */
        SUZHOU("苏州", "main/com/chatroomclient/resources/static/img/Suzhou.png", Color.black),
        SHENGZHEN("深圳", "main/com/chatroomclient/resources/static/img/Shenzhen.png", Color.black),
        SHOES("Shoes", "main/com/chatroomclient/resources/static/img/Shoes.png", Color.black);

        /** 皮肤名字 */
        private final String skinName;

        /** 皮肤地址 */
        private final String skinUrl;

        /** 按钮字体颜色 */
        private final Color btnColor;

        MAIN_BACKGROUND(String skinName, String skinUrl, Color btnColor) {
            this.skinName = skinName;
            this.skinUrl = skinUrl;
            this.btnColor = btnColor;
        }

        public String getSkinName() {
            return skinName;
        }

        public String getSkinUrl() {
            return skinUrl;
        }

        public Color getBtnColor() {
            return btnColor;
        }
    }

    /**
     * 程序主界面默认背景
     * 修改参数可以实现系统默认皮肤的更改
     */
    public static final MAIN_BACKGROUND DEFAULT_SKIN = MAIN_BACKGROUND.SHENGZHEN;

}
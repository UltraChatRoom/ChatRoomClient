package main.com.chatroomclient.java.utils;

import main.com.chatroomclient.java.common.constant.ApplicationConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: SkinUtil
 * @program: ChatRoomClient
 * @description: //TODO 程序皮肤 工具类
 * @author: GirtSeanking
 * @create: 2020-11-18 21:02
 **/

public class SkinUtil {

    public List<ApplicationConstant.MAIN_BACKGROUND> getSkinList() {
        List<ApplicationConstant.MAIN_BACKGROUND > skinList = new ArrayList<ApplicationConstant.MAIN_BACKGROUND>();
        for (ApplicationConstant.MAIN_BACKGROUND skin : ApplicationConstant.MAIN_BACKGROUND.values()) {
            skinList.add(skin);
        }
        return skinList;
    }

    /**
     * @Author GirtSeanking
     * @Description //TODO 返回皮肤列表名字
     * @Date 20:19 
     * @Param []
     * @return java.util.List<java.lang.String>
     **/
    public List<String > getSkinNames() {
        List<String> skinNames = new ArrayList<String>();
        for (ApplicationConstant.MAIN_BACKGROUND skin : ApplicationConstant.MAIN_BACKGROUND.values()) {
            skinNames.add(skin.getSkinName());
        }
        return skinNames;
    }

    public ApplicationConstant.MAIN_BACKGROUND getSkinEntity(int selectedId) {
        String skinName = getSkinNames().get(selectedId);
        for (ApplicationConstant.MAIN_BACKGROUND skin : ApplicationConstant.MAIN_BACKGROUND.values()) {
            if (skinName.equals(skin.getSkinName())) {
                return skin;
            }
        }
        return null;
    }

}
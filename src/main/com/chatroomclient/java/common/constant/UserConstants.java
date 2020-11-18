package main.com.chatroomclient.java.common.constant;

/**
 * @className: UserConstants
 * @program: ChatRoomClient
 * @description: //TODO 用户常量信息设置
 * @author: GirtSeanking
 * @create: 2020-11-17 16:20
 **/

public class UserConstants {

    /** 用户名长度限制 */
    public static final int USERNAME_MAX_LENGTH = 15;

    /** 用户名和密码空格限制 */
    public static final String SPACE_REG = "^[^\\s]*$";

    /** 用户密码长度限制 */
    public static final int PASSWORD_MAX_LENGTH = 16;
    public static final int PASSWORD_MIN_LENGTH = 8;

    /** 用户密码强度检验(正则表达式) */
    public static final String PASSWORD_REG_NUMBER = ".*\\d+.*";
    public static final String PASSWORD_REG_UPPERCASE = ".*[A-Z]+.*";
    public static final String PASSWORD_REG_LOWERCASE = ".*[a-z]+.*";
    public static final String PASSWORD_REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    /** 用户密码强度级别 */
    public static final String PASSWORD_STRENGTH_IS_WEAK = "0";
    public static final String PASSWORD_STRENGTH_IS_MEDIUM = "1";
    public static final String PASSWORD_STRENGTH_IS_BETTER = "2";
    public static final String PASSWORD_STRENGTH_IS_PERFECT = "3";

    /** 密保问题长度设置 */
    public static final int SCURITY_QUESTION_MAX_LENGTH = 20;

    /** 密保问题答案长度设置 */
    public static final int QUESTION_ANSWER_MAX_LENGTH = 50;

    /** 手机号码格式限制 */
    public static final String MOBILE_PHONE_NUMBER_PATTERN = "^0{0,1}(13[0-9]|15[0-9]|14[0-9]|18[0-9])[0-9]{8}$";

    /** 邮箱格式限制 */
    public static final String EMAIL_PATTERN = "^((([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+(\\.([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+)*)|((\\x22)((((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(([\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f]|\\x21|[\\x23-\\x5b]|[\\x5d-\\x7e]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(\\\\([\\x01-\\x09\\x0b\\x0c\\x0d-\\x7f]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]))))*(((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(\\x22)))@((([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.)+(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.?";

}
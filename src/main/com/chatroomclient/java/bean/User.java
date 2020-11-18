package main.com.chatroomclient.java.bean;

import java.util.Date;

public class User {

    /** 用户id（主键） */
    private int userId;

    /** MC号（用户登录账号） */
    private String loginName;

    /** 用户昵称 */
    private String userName;

    /** 账号密码 */
    private String password;

    /** 个性签名 */
    private String sign;

    /** 用户头像id */
    private int photoId;

    /** 性别 */
    private String sex;

    /** 生日 */
    private Date birthday;

    /** 星座 */
    private String constellation;

    /** 血型 */
    private String bloodType;

    /** 学历 */
    private String diploma;

    /** 电话号码 */
    private String telNumber;

    /** 电子邮件 */
    private String email;

    /** 家庭住址 */
    private String address;

    /** 密保问题 */
    private String question;

    /** 密保答案 */
    private String answer;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sign='" + sign + '\'' +
                ", photoId=" + photoId +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", constellation='" + constellation + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", diploma='" + diploma + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

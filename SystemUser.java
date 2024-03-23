public class SystemUser extends Pessoa {
    private String name;
    private String email;
    private String site;
    private String login;
    private String password;
    private int systemUnitId;
    private int frontpageId;
    private String photoPath;
    private char active;
    private Character acceptedTermPolicy;
    private String acceptedTermPolicyAt;

    public SystemUser(int id, String telefones, String active, int id1, String name, String email, String site, String login, String password, int systemUnitId, int frontpageId, String photoPath, char active1, Character acceptedTermPolicy, String acceptedTermPolicyAt, String acceptedTermPolicyData, String phone, String address, String about, String functionName, String customCode, String otpSecret) {
        super( id, telefones, active);
        this.name = name;
        this.email = email;
        this.site = site;
        this.login = login;
        this.password = password;
        this.systemUnitId = systemUnitId;
        this.frontpageId = frontpageId;
        this.photoPath = photoPath;
        this.active = active1;
        this.acceptedTermPolicy = acceptedTermPolicy;
        this.acceptedTermPolicyAt = acceptedTermPolicyAt;
        this.acceptedTermPolicyData = acceptedTermPolicyData;
        this.phone = phone;
        this.address = address;
        this.about = about;
        this.functionName = functionName;
        this.customCode = customCode;
        this.otpSecret = otpSecret;
    }

    private String acceptedTermPolicyData;
    private String phone;
    private String address;
    private String about;
    private String functionName;
    private String customCode;
    private String otpSecret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSystemUnitId() {
        return systemUnitId;
    }

    public void setSystemUnitId(int systemUnitId) {
        this.systemUnitId = systemUnitId;
    }

    public int getFrontpageId() {
        return frontpageId;
    }

    public void setFrontpageId(int frontpageId) {
        this.frontpageId = frontpageId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public Character getAcceptedTermPolicy() {
        return acceptedTermPolicy;
    }

    public void setAcceptedTermPolicy(Character acceptedTermPolicy) {
        this.acceptedTermPolicy = acceptedTermPolicy;
    }

    public String getAcceptedTermPolicyAt() {
        return acceptedTermPolicyAt;
    }

    public void setAcceptedTermPolicyAt(String acceptedTermPolicyAt) {
        this.acceptedTermPolicyAt = acceptedTermPolicyAt;
    }

    public String getAcceptedTermPolicyData() {
        return acceptedTermPolicyData;
    }

    public void setAcceptedTermPolicyData(String acceptedTermPolicyData) {
        this.acceptedTermPolicyData = acceptedTermPolicyData;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public String getOtpSecret() {
        return otpSecret;
    }

    public void setOtpSecret(String otpSecret) {
        this.otpSecret = otpSecret;
    }
}
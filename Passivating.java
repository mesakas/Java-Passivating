
// 敏感数据钝化
public class Passivating {

    // 对用户名的钝化
    public static String usernamePassivating(String username) {
        int prefixAndSuffixLength = 2;
        if (username.length() < 6) prefixAndSuffixLength = 1;

        String username_prefix = username.substring(0, prefixAndSuffixLength);
        String username_suffix = username.substring(username.length() - prefixAndSuffixLength);

        return username_prefix + "********" + username_suffix;
    }

    // 对手机号的钝化
    public static String phonePassivating(String phone) {
        int prefixLength = 3;
        int suffixLength = 4;

        String username_prefix = phone.substring(0, prefixLength);
        String username_suffix = phone.substring(phone.length() - suffixLength);

        return username_prefix + "****" + username_suffix;
    }

    // 对邮箱的钝化
    public static String emailPassivating(String email) {

        String prefix = email.substring(0, email.indexOf("@"));

        if (prefix.length() < 3) return prefix.substring(0, 2) + "*****" + email.substring(email.indexOf("@"));
        else return prefix.substring(0, 2) + "********" + email.substring(email.indexOf("@") - 2);
    }

}

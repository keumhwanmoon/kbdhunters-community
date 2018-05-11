import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * @author Jason, Moon
 * @since 2018-05-11.
 */
public class JasyptEncrypt {
    public static void main(String[] args) {

        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("jason"); //2번 설정의 암호화 키를 입력

        String enc = pbeEnc.encrypt("localhost"); //암호화 할 내용
        System.out.println("enc = " + enc); //암호화 한 내용을 출력

        //테스트용 복호화
        String des = pbeEnc.decrypt(enc);
        System.out.println("des = " + des);
    }
}

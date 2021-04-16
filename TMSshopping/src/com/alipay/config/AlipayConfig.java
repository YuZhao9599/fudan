package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092600600990";
    //public static String app_id = "2021002139637401";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDbKyG5jTkNIhR6JoHGVtNECxqNmyVQpSCSygjR3IIPdkCH0AG32tNSfjwgVxRxiGcLca1hcuANa0crrzOg+ChH3X9mncQL9IfojzvIYSaWUgMVAuqkKU0cf3TwDIj1GwZrb7BlhI6Km6bay5ZeCouA7fOu8aZ5m6B9UQ+j8BzY7tm+BPEsCdN3LcCiqyiDfdNHlLr6futt4ZuLh5cIvFo+ppVH/yewqnfoEmpIPN+GJsGRVV09VXvrhMUpr+JeoUnbPIFML8cneCvpLhmiYUd8G/0OL42exWIScox8KX0M9Kslh8efgp7CRx0/jjIHM0EJFwUCPzG9jtvHkHMJ7zxnAgMBAAECggEBAKnztF8yh78LYl2mZpPq2EC3a4vLdxAmPDAXwucZ2zEqPbgTMIHlimE5yl45qHyxjVZufEhI0D0Xp0TUw3BbfsDbneNxC4lJweowx+cGjumaBxHQBSvvawBiRcevsLSAlGXTYjIWrIIHWUfo/11FSBBedMyATtuWNsl2hm5Vz8jXXtAPzljMpaQEbRJxrDx0xDI/ADLHobEAuvtFEesnbIrEsWy1m2kn/SFBmdgwUkb8+KW8V3H7PgfeDaHYTOeifs3TnapAYHDQbC4W8ZRr3+FFiRRBSXkP89FRGLmXJMMwYHHltI0xp88kcvmUavReCOnlVjFVWqjVuHcwXdrd+8ECgYEA+jY8JGZ1mQs8ZVh+UqQMLhTAHO4JILeZMh4CVKdQKKOPLGqQpXUKWvHanm3eV0fd5TfRs+9Kp0JL1tlm2Enq/BC9+TLRx/iaKC7QL8ibul2rOsj0YGol3VzKGVa+e7ZBzWdloLTETYCciGDUc6ks7HkfxAMJB7/wOvD4BOei1S8CgYEA4D0OgVQus9boBZlzJNQDmveyFsFxuCGG1c/uQKqt+8ulSBhAye5lLzDcCi/K3SgvMSpmUVH6Y3xJ2VakkJ6osM3jKTnB4nvvVpH915QG2rqsRM9x9FoS7jn0kIK7MEZ+Ivw5Nf6POQ2JxHP57/i1M6iTxm8Virzgkjmqo+BuLkkCgYAtsTnKa+uNxz+AQmjPLqYKxD9RCSchkmWngVNroiJBSZ0bv1oq3PTHJuOFiwrPZZBgC5GACnLXmIPA+HKPjPAcl/IZT+5/VibQr7vU/g1yOyjJ02jNMpU3l3pQpkai0OWzXO5yKpCulo3/Wa9yb7KEfJoQcX10rNhx6w9f1e0mgQKBgQCgvqQbScGA4dnJycqk5+b9u/pKHbnriP0jYL8mVDQMgFunZttq5h5ayeey1bfS+e96iy51tRKNJpe52UZ29YVv2OeysdivBrD3mggh9ddEDPVZDmxeAgP4CkurHEwbuyzI344TirwY5f+QeKL+x4b91Sa55P/ISMWjjPsqJsRVIQKBgD+XYRJKwPAHcEFxwV/0LGu+hN/Nlqa0vfy951aritGDcB+UyZjIC9utSTg5pPvW0C3TZhM8DVWX6HIJnZAaVsiOVoz94TyzEGILz/Zd8y55njfQuXjvR0Je8Gm48z1aYhadAHXNwLg08UC8Hyi+zSZe8VAMyWg42cO3Twe4/bmn";
    //public static String merchant_private_key = "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";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuM8dz+8SF7BMG4fxuhjmg2lwgz4izXIynFmYHk544HyVwFAV2h1pL0n0sbvxwmdQ3OLcesr0ZliZ8lV6Hw/flfiFRcBoNuzO4ZFn+tdg5oGcx/yShqqWfZI7gn/IjNhq9yy0Lthv6d39CDsiJ/u2sHmChWEycpy2TCwiEdsbg5AmyhWQF5EP+YJk2briPY0Safur5jmLBAbzJU9fCDvZWdk1Max5x5dkd+oBVTUPLHBdiAbam9KNCKkGW7AwqFsU2LygVk+rQabnq05m3kqpHz4v0mW+pV0lGTke6dT4arPoXpKF++NkH+MOTE9DHXG+8lKpvWMNjVN3llDBuWoS+QIDAQAB";
    //public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Kr9aQpEkjFcaoYffOnvq0b5a6RzGrdPHVxPdV+bMt8W96V+p3xvm8RIRUVBu/nB+nXvcjh6r2lEHXMjNBQ872dnGlGNlIjVJO8XdUtZPDZq9DroKrINXPdCx4Uz4CAj+UE0UIWR5wkKpabdyAuuGciZzmxpsGr9oGy1aZulbV8Ah9Zy0Xuzpzd3cRMQy+WA6f+xWoOCP2L4BhIddmOZpCvGSUD6rzjZwS5NPUspZuhplsDdi+MnGEUI86CuDb3MClb+TIfqbfmzwgv8CIjrNy3CrUSJDH0ea69lwWkPn7iml425Zul58Rh2u28RZ/jZkOpqog1QRCBA9cOoBEpfUQIDAQAB+8SF7BMG4fxuhjmg2lwgz4izXIynFmYHk544HyVwFAV2h1pL0n0sbvxwmdQ3OLcesr0ZliZ8lV6Hw/flfiFRcBoNuzO4ZFn+tdg5oGcx/yShqqWfZI7gn/IjNhq9yy0Lthv6d39CDsiJ/u2sHmChWEycpy2TCwiEdsbg5AmyhWQF5EP+YJk2briPY0Safur5jmLBAbzJU9fCDvZWdk1Max5x5dkd+oBVTUPLHBdiAbam9KNCKkGW7AwqFsU2LygVk+rQabnq05m3kqpHz4v0mW+pV0lGTke6dT4arPoXpKF++NkH+MOTE9DHXG+8lKpvWMNjVN3llDBuWoS+QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/shopping-result.jsp";
	//public static String notify_url = "http://localhost:8080/shopping-result.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/TMSshopping/shopping-result.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\Users\\LINCK\\Desktop\\PAY-LOGIN";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


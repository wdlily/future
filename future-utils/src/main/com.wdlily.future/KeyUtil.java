package main.com.wdlily.future;

import java.util.Random;

/**
 * @Description:
 * @Author: WangDi
 * @Date: 2018/2/24 17:52
 */
public class KeyUtil {

    private KeyUtil(){}

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(9000) + 1000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(KeyUtil.genUniqueKey());
    }

}

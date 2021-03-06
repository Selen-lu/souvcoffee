package config.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//참고 링크
//https://engkimbs.tistory.com/861
public class Log4j2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2.class);

    public static void main(String[] args) {
        LOGGER.info("a test message");
        System.out.println("반가워");
    }
}



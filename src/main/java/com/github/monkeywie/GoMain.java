package com.github.monkeywie;

import com.github.monkeywie.proxyee.handler.HttpProxyServerHandle;
import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
测试命令行
curl -k "/data/git_proj/proxyee/src/main/resources/ca.crt"  -x "9.134.19.211:9911"  "https://play.google.com/store/apps/collection/topselling_free?s
curl -k D:\Git_proj\github-open\proxyee\src\main\resources\ca.crt -x "9.134.19.211:9911"  https://www.baidu.com/ -v
* */
public class GoMain {
    private static final Logger logger = LoggerFactory.getLogger(HttpProxyServerHandle.class);

    public static void main(String[] args) throws Exception {

        logger.info("server begin");
        HttpProxyServerConfig config =  new HttpProxyServerConfig();
        config.setHandleSsl(true);
        new HttpProxyServer()
                .serverConfig(config)
                .start(9911);
    }
}

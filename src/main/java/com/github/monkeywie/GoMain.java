package com.github.monkeywie;

import com.github.monkeywie.proxyee.handler.HttpProxyServerHandle;
import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

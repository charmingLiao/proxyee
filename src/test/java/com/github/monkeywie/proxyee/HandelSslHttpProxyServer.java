package com.github.monkeywie.proxyee;

import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;

public class HandelSslHttpProxyServer {

  public static void main(String[] args) throws Exception {

    System.setProperty("http.proxyHost", "127.0.0.1");
    System.setProperty("http.proxyPort", "12639");
    System.setProperty("https.proxyHost", "127.0.0.1");
    System.setProperty("https.proxyPort", "12639");

    HttpProxyServerConfig config =  new HttpProxyServerConfig();
    config.setHandleSsl(true);
    new HttpProxyServer()
        .serverConfig(config)
        .start(9911);
  }
}

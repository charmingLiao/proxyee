package com.github.monkeywie.proxyee.server;

import io.netty.channel.EventLoopGroup;
import io.netty.handler.ssl.SslContext;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;
/**
 * Http代理的配置信息
 * */
public class HttpProxyServerConfig {

  private SslContext clientSslCtx;
  // CA证书的使用者信息
  private String issuer;
  // CA证书的有效时段
  private Date caNotBefore;
  private Date caNotAfter;
  // CA私钥用于给动态生成的网站SSL证书签证
  private PrivateKey caPriKey;
  // 生产一对随机公私钥用于网站SSL证书动态创建
  private PrivateKey serverPriKey;
  private PublicKey serverPubKey;
  private EventLoopGroup proxyLoopGroup;
  private int bossGroupThreads;
  private int workerGroupThreads;
  private int proxyGroupThreads;
  private boolean handleSsl;

  public SslContext getClientSslCtx() {
    return clientSslCtx;
  }

  public void setClientSslCtx(SslContext clientSslCtx) {
    this.clientSslCtx = clientSslCtx;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public Date getCaNotBefore() {
    return caNotBefore;
  }

  public void setCaNotBefore(Date caNotBefore) {
    this.caNotBefore = caNotBefore;
  }

  public Date getCaNotAfter() {
    return caNotAfter;
  }

  public void setCaNotAfter(Date caNotAfter) {
    this.caNotAfter = caNotAfter;
  }

  public PrivateKey getCaPriKey() {
    return caPriKey;
  }

  public void setCaPriKey(PrivateKey caPriKey) {
    this.caPriKey = caPriKey;
  }

  public PrivateKey getServerPriKey() {
    return serverPriKey;
  }

  public void setServerPriKey(PrivateKey serverPriKey) {
    this.serverPriKey = serverPriKey;
  }

  public PublicKey getServerPubKey() {
    return serverPubKey;
  }

  public void setServerPubKey(PublicKey serverPubKey) {
    this.serverPubKey = serverPubKey;
  }

  public EventLoopGroup getProxyLoopGroup() {
    return proxyLoopGroup;
  }

  public void setProxyLoopGroup(EventLoopGroup proxyLoopGroup) {
    this.proxyLoopGroup = proxyLoopGroup;
  }

  public boolean isHandleSsl() {
    return handleSsl;
  }

  public void setHandleSsl(boolean handleSsl) {
    this.handleSsl = handleSsl;
  }

  public int getBossGroupThreads() {
    return bossGroupThreads;
  }

  public void setBossGroupThreads(int bossGroupThreads) {
    this.bossGroupThreads = bossGroupThreads;
  }

  public int getWorkerGroupThreads() {
    return workerGroupThreads;
  }

  public void setWorkerGroupThreads(int workerGroupThreads) {
    this.workerGroupThreads = workerGroupThreads;
  }

  public int getProxyGroupThreads() {
    return proxyGroupThreads;
  }

  public void setProxyGroupThreads(int proxyGroupThreads) {
    this.proxyGroupThreads = proxyGroupThreads;
  }
}

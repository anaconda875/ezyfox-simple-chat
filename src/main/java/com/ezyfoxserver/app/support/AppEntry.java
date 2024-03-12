package com.ezyfoxserver.app.support;

import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.support.entry.EzySimpleAppEntry;

public class AppEntry extends EzySimpleAppEntry {

  @Override
  protected void preConfig(EzyAppContext ctx) {
    logger.info("\n=================== APP START CONFIG ================\n");
  }

  @Override
  protected void postConfig(EzyAppContext ctx) {
    logger.info("\n=================== APP END CONFIG ================\n");
  }

  //  @Override
  //  protected void setupBeanContext(EzyAppContext context, EzyBeanContextBuilder builder) {
  //    EzyAppSetting setting = context.getApp().getSetting();
  //    String appConfigFile = getConfigFile(setting);
  //    builder.addProperties(appConfigFile);
  //    logger.info("app config file: {}", appConfigFile);
  //  }

  //  protected String getConfigFile(EzyAppSetting setting) {
  //    return setting.getConfigFile();
  //  }

  @Override
  public void start() {
    logger.info("start app");
  }

  @Override
  protected String[] getScanablePackages() {
    return new String[] {
      "com.ezyfoxserver.app", "com.ezyfoxserver.event.handler", "com.ezyfoxserver.service",
    };
  }
}

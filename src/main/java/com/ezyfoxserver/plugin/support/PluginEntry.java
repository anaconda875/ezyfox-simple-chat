package com.ezyfoxserver.plugin.support;

import com.tvd12.ezyfox.bean.EzyBeanContextBuilder;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;
import com.tvd12.ezyfoxserver.support.entry.EzySimplePluginEntry;

public class PluginEntry extends EzySimplePluginEntry {

  @Override
  protected void preConfig(EzyPluginContext ctx) {
    logger.info("\n=================== PLUGIN START CONFIG ================\n");
  }

  @Override
  protected void postConfig(EzyPluginContext ctx) {
    logger.info("\n=================== PLUGIN END CONFIG ================\n");
  }

  @Override
  protected void setupBeanContext(EzyPluginContext context, EzyBeanContextBuilder builder) {
    //    EzyPluginSetting setting = context.getPlugin().getSetting();
    //    String pluginConfigFile = getConfigFile(setting);
    //    builder.addProperties(pluginConfigFile);
    //    logger.info("plugin config file: {}", pluginConfigFile);
  }

  //  protected String getConfigFile(EzyPluginSetting setting) {
  //    return setting.getConfigFile();
  //  }

  @Override
  public void start() {
    getLogger().info("plugin: start");
  }

  @Override
  protected String[] getScanablePackages() {
    return new String[] {
      "com.ezyfoxserver.plugin",
    };
  }
}

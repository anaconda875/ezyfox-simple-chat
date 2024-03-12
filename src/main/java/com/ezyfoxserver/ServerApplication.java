package com.ezyfoxserver;

import com.ezyfoxserver.app.support.AppEntryLoader;
import com.tvd12.ezyfoxserver.embedded.EzyEmbeddedServer;
import com.tvd12.ezyfoxserver.setting.EzyAppSettingBuilder;
import com.tvd12.ezyfoxserver.setting.EzySettingsBuilder;
import com.tvd12.ezyfoxserver.setting.EzySimpleSettings;
import com.tvd12.ezyfoxserver.setting.EzyZoneSettingBuilder;

public class ServerApplication {

  public static void main(String[] args) throws Exception {
    /*EzyPluginSettingBuilder pluginSettingBuilder = new EzyPluginSettingBuilder()
    .name("hello-world")
    .addListenEvent(EzyEventType.USER_LOGIN)
    .entryLoader(PluginEntryLoader.class);*/

    EzyAppSettingBuilder appSettingBuilder =
        new EzyAppSettingBuilder().name("hello-world").entryLoader(AppEntryLoader.class);

    EzyZoneSettingBuilder zoneSettingBuilder =
        new EzyZoneSettingBuilder().name("example").application(appSettingBuilder.build())
        /*.plugin(pluginSettingBuilder.build())*/ ;

    //    EzyWebSocketSettingBuilder socketSettingBuilder = new EzyWebSocketSettingBuilder();

    //    EzyUdpSettingBuilder udpSettingBuilder = new EzyUdpSettingBuilder()
    //        .active(true);

    //    EzySimpleSessionManagementSetting sessionManagementSetting = new
    // EzySessionManagementSettingBuilder()
    //        .sessionMaxIdleTimeInSecond(25)
    //        .sessionMaxWaitingTimeInSecond(25)
    //        .build();
    //    sessionManagementSetting.init();

    //    EzyThreadPoolSizeSettingBuilder threadPoolSizeSettingBuilder = new
    // EzyThreadPoolSizeSettingBuilder()
    //        .socketDataReceiver(1);

    EzySimpleSettings settings =
        new EzySettingsBuilder()
            .debug(true)
            //        .websocket(socketSettingBuilder.build())
            //        .udp(udpSettingBuilder.build())
            .zone(zoneSettingBuilder.build())
            //        .sessionManagement(sessionManagementSetting)
            /*.addEventController(
                EzyEventType.SERVER_INITIALIZING,
                ServerInitializingHandler.class
            )*/
            //        .addEventController(
            //            EzyEventType.CLIENT_HANDSHAKE,
            //            ClientHandshakeController.class
            //        )
            //        .threadPoolSize(threadPoolSizeSettingBuilder.build())
            .build();

    EzyEmbeddedServer server = EzyEmbeddedServer.builder().settings(settings).build();
    server.start();
  }
}

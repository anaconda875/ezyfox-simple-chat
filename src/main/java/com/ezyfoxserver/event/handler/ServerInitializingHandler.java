package com.ezyfoxserver.event.handler;

import com.tvd12.ezyfoxserver.command.EzyAddExceptionHandler;
import com.tvd12.ezyfoxserver.context.EzyServerContext;
import com.tvd12.ezyfoxserver.controller.EzyAbstractServerEventController;
import com.tvd12.ezyfoxserver.event.EzyServerInitializingEvent;

public class ServerInitializingHandler
    extends EzyAbstractServerEventController<EzyServerInitializingEvent> {

  @Override
  public void handle(EzyServerContext ctx, EzyServerInitializingEvent event) {
    ctx.cmd(EzyAddExceptionHandler.class)
        .add(
            (thread, exception) ->
                logger.error("there is an uncaught exception on thread: {}", thread, exception));
  }
}

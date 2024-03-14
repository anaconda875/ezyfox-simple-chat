package com.ezyfoxserver.event.handler;

import com.ezyfoxserver.dto.request.ChatRequest;
import com.ezyfoxserver.dto.response.ChatResponse;
import com.ezyfoxserver.dto.response.UserResponse;
import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzyPrototype;
import com.tvd12.ezyfox.core.annotation.EzyDoHandle;
import com.tvd12.ezyfox.core.annotation.EzyRequestController;
import com.tvd12.ezyfox.core.annotation.EzyRequestListener;
import com.tvd12.ezyfox.core.exception.EzyBadRequestException;
import com.tvd12.ezyfox.util.EzyLoggable;
import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.context.EzyAppContextAware;
import com.tvd12.ezyfoxserver.entity.EzyUser;
import com.tvd12.ezyfoxserver.support.factory.EzyResponseFactory;
import lombok.Setter;

@EzyRequestController
@Setter
public class ChatRequestHandler extends EzyLoggable {

  @EzyAutoBind("appResponseFactory")
  protected EzyResponseFactory responseFactory;

  @EzyDoHandle("chat")
  public void secureChat(EzyUser user, EzyAppContext appContext, ChatRequest request) {
    responseFactory.newObjectResponse()
        .encrypted()
        .command("chat")
        .param("chat", new ChatResponse(request))
        .user(appContext.getApp().getUserManager().getUser(request.getTo()))
        .execute();
  }
}

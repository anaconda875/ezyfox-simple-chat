package com.ezyfoxserver.event.handler;

import com.ezyfoxserver.dto.response.UserResponse;
import com.tvd12.ezyfox.bean.annotation.EzyPrototype;
import com.tvd12.ezyfox.core.annotation.EzyRequestListener;
import com.tvd12.ezyfox.core.exception.EzyBadRequestException;

import java.util.stream.Collectors;

@EzyPrototype
@EzyRequestListener("active-users")
public class ActiveUsersRequestHandler extends AbstractClientRequestHandler  {

  protected void execute() throws EzyBadRequestException {
    responseFactory
        .newObjectResponse()
        .command("active-users")
        .param("active-users", appContext.getApp().getUserManager().getUserList().stream().map(UserResponse::new).collect(Collectors.toList()))
        .session(session)
        .execute();
  }
}

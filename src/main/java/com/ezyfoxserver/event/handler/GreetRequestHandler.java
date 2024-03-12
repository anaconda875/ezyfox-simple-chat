package com.ezyfoxserver.event.handler;

import com.ezyfoxserver.service.Greeting;
import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzyPrototype;
import com.tvd12.ezyfox.binding.EzyDataBinding;
import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import com.tvd12.ezyfox.core.annotation.EzyRequestListener;
import lombok.Setter;

@Setter
@EzyPrototype
@EzyObjectBinding(write = false)
@EzyRequestListener("greet")
public class GreetRequestHandler extends AbstractClientRequestHandler implements EzyDataBinding {

  private String who;

  @EzyAutoBind private Greeting greeting;

  @Override
  protected void execute() {
    responseFactory
        .newObjectResponse()
        .command("greet")
        .param("message", greeting.greet(who))
        .session(session)
        .execute();
  }
}

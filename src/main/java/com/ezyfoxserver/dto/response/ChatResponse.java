package com.ezyfoxserver.dto.response;

import com.ezyfoxserver.dto.request.ChatRequest;
import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EzyObjectBinding
public class ChatResponse {

  private Long from;
  private Long to;
  private String content;

  public ChatResponse(ChatRequest request) {
    this(request.getFrom(), request.getTo(), request.getContent());
  }
}

package com.ezyfoxserver.dto.request;

import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EzyObjectBinding
public class ChatRequest {

  private Long from;
  private Long to;
  private String content;

}

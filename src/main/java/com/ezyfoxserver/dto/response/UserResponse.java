package com.ezyfoxserver.dto.response;

import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import com.tvd12.ezyfoxserver.entity.EzyUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EzyObjectBinding(read = false)
public class UserResponse {

  private Long id;
  private Integer zoneId;
  private String name;
  private Boolean active;

  public UserResponse(EzyUser ezyUser) {
    this(ezyUser.getId(), ezyUser.getZoneId(), ezyUser.getName(), Boolean.TRUE);
  }

}

package com.ezyfoxserver.app.support;

import com.tvd12.ezyfoxserver.ext.EzyAbstractAppEntryLoader;
import com.tvd12.ezyfoxserver.ext.EzyAppEntry;

public class AppEntryLoader extends EzyAbstractAppEntryLoader {

  @Override
  public EzyAppEntry load() {
    return new AppEntry();
  }
}

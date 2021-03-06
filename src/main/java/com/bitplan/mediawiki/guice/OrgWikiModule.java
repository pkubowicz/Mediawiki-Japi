/**
 *
 * This file is part of the https://github.com/WolfgangFahl/Mediawiki-Japi open source project
 *
 * Copyright 2015-2018 BITPlan GmbH https://github.com/BITPlan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *  http:www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bitplan.mediawiki.guice;

import com.bitplan.mediawiki.japi.MediawikiApi;
import com.google.inject.AbstractModule;

/**
 * Guice Module to use the wrapper {@link org.wikipedia.Mediawiki} for the one class 
 * solution {@link org.wikipedia.Wiki}
 * as the implementation for the {@link com.bitplan.mediawiki.japi.MediawikiApi} interface 
 * @author wf
 *
 */
public class OrgWikiModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MediawikiApi.class).to(org.wikipedia.Mediawiki.class); 
  }

}

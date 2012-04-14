/*
 * Copyright (c) 2010-2011. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.test.matchers;

import org.axonframework.domain.EventMessage;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * Matcher that matches against a <code>null</code> or <code>void</code> value. Can be used to make sure no trailing
 * events remain when using an Exact Sequence Matcher.
 *
 * @author Allard Buijze
 * @since 1.1
 */
public class NullOrVoidMatcher extends BaseMatcher<EventMessage> {

    @Override
    public boolean matches(Object item) {
        return item == null || Void.class.equals(item);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("<nothing>");
    }
}

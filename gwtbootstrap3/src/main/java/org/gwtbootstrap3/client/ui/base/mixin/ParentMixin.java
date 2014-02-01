package org.gwtbootstrap3.client.ui.base.mixin;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.user.client.ui.UIObject;
import org.gwtbootstrap3.client.ui.HasParent;
import org.gwtbootstrap3.client.ui.HasToggle;
import org.gwtbootstrap3.client.ui.constants.Attributes;

/**
 * @author Grant Slender
 */
public class ParentMixin<T extends UIObject & HasToggle> extends AbstractMixin implements HasParent {

    public ParentMixin(final T uiObject) {
        super(uiObject);
    }

    @Override
    public void setDataParent(final String href) {
        if (href != null) {
            uiObject.getElement().setAttribute(Attributes.DATA_PARENT, href);
        } else {
            uiObject.getElement().removeAttribute(Attributes.DATA_PARENT);
        }
    }

    @Override
    public String getDataParent() {
        return uiObject.getElement().getAttribute(Attributes.DATA_PARENT);
    }

}

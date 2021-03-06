/*
 * Copyright 2017 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.core;

import org.eclipse.jface.action.Action;

import com.amazonaws.eclipse.core.mobileanalytics.AwsToolkitMetricType;
import com.amazonaws.eclipse.core.mobileanalytics.ToolkitAnalyticsUtils;

public class OpenLinkAction extends Action {
    private final String linkName;

    public OpenLinkAction(String linkName) {
        this.linkName = linkName;
    }

    @Override
    public void run() {
        ToolkitAnalyticsUtils.publishBooleansEvent(AwsToolkitMetricType.OVERVIEW_OPEN_LINK_ITEM, linkName, true);
    }
}

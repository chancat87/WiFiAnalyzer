/*
 * WiFiAnalyzer
 * Copyright (C) 2019  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.wifi.refresh;

import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;

import com.vrem.util.BuildUtils;

public class RefreshListener implements OnRefreshListener {
    private RefreshAction refreshAction;

    public RefreshListener(@NonNull RefreshAction refreshAction) {
        this.refreshAction = refreshAction;
    }

    @Override
    public void onRefresh() {
        if (!BuildUtils.isMinVersionP()) {
            refreshAction.refresh();
        }
    }

}
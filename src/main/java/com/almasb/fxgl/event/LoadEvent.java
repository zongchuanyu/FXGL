/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2016 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.almasb.fxgl.event;

import com.almasb.fxgl.settings.UserProfile;
import javafx.event.Event;
import javafx.event.EventType;

/**
 * Event related to any type of loading.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class LoadEvent extends Event {

    public static final EventType<LoadEvent> ANY =
            new EventType<>(Event.ANY, "LOAD_EVENT");

    public static final EventType<LoadEvent> LOAD_PROFILE =
            new EventType<>(ANY, "LOAD_PROFILE");

    public static final EventType<LoadEvent> RESTORE_SETTINGS =
            new EventType<>(ANY, "RESTORE_SETTINGS");

    private UserProfile profile;

    public UserProfile getProfile() {
        return profile;
    }

    public LoadEvent(EventType<LoadEvent> eventType, UserProfile profile) {
        super(eventType);
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "LoadEvent[type=" + getEventType() + "]";
    }
}

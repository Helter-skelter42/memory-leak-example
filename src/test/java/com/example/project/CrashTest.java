/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class CrashTest {

	@Test
	@DisplayName("Let's make the JVM die")
	void memoryleakTest(TestInfo testInfo) {
        Map<Key, String> m = new HashMap<Key, String>();
        while (true)
           for (int i = 0; i < Integer.MAX_VALUE; i++)
              if (!m.containsKey(new Key(i)))
                 m.put(new Key(i), "Number:" + i);
	}

}

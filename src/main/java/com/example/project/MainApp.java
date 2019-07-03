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

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        // This code will lead in a memory leak and death of the jvm
        /*Map<Key, String> m = new HashMap<Key, String>();
        while (true)
           for (int i = 0; i < Integer.MAX_VALUE; i++)
              if (!m.containsKey(new Key(i)))
                 m.put(new Key(i), "Number:" + i);*/
     }
}

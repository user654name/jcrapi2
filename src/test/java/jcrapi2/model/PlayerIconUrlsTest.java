/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jcrapi2.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Generated;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Generated("org.mili.generator")
class PlayerIconUrlsTest {

  private PlayerIconUrls unitUnderTest;

  @BeforeEach
  void setUp() {
    unitUnderTest = new PlayerIconUrls();
  }

  @Test
  void setMedium_whenWithValidParameter_thenSetMedium() {
    String expected = "astring";
    unitUnderTest.setMedium(expected);
    assertEquals(expected, unitUnderTest.getMedium());
  }

  @Test
  void toString_whenCalled_thenReturnStringRepresentation() {
    unitUnderTest.setMedium("astring");
    String expected = "PlayerIconUrls(medium=astring)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}
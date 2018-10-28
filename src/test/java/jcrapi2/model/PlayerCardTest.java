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
class PlayerCardTest {

  private PlayerCard unitUnderTest;

  @BeforeEach
  void setUp() {
    unitUnderTest = new PlayerCard();
  }

  @Test
  void setName_whenWithValidParameter_thenSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  void setLevel_whenWithValidParameter_thenSetLevel() {
    int expected = 815;
    unitUnderTest.setLevel(expected);
    assertEquals(expected, unitUnderTest.getLevel());
  }

  @Test
  void setMaxLevel_whenWithValidParameter_thenSetMaxLevel() {
    int expected = 815;
    unitUnderTest.setMaxLevel(expected);
    assertEquals(expected, unitUnderTest.getMaxLevel());
  }

  @Test
  void setCount_whenWithValidParameter_thenSetCount() {
    int expected = 815;
    unitUnderTest.setCount(expected);
    assertEquals(expected, unitUnderTest.getCount());
  }

  @Test
  void setIconUrls_whenWithValidParameter_thenSetIconUrls() {
    PlayerIconUrls expected = new PlayerIconUrls();
    unitUnderTest.setIconUrls(expected);
    assertEquals(expected, unitUnderTest.getIconUrls());
  }

  @Test
  void toString_whenCalled_thenReturnStringRepresentation() {
    unitUnderTest.setName("astring");
    unitUnderTest.setLevel(815);
    unitUnderTest.setMaxLevel(815);
    unitUnderTest.setCount(815);
    unitUnderTest.setIconUrls(new PlayerIconUrls());
    String expected = "PlayerCard(name=astring, level=815, maxLevel=815, count=815, iconUrls=" + new PlayerIconUrls() + ")";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}
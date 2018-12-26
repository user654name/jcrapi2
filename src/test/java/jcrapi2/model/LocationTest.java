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
class LocationTest {

  private Location unitUnderTest;

  @BeforeEach
  void setUp() {
    unitUnderTest = new Location();
  }

  @Test
  void setId_whenWithValidParameter_thenSetId() {
    int expected = 815;
    unitUnderTest.setId(expected);
    assertEquals(expected, unitUnderTest.getId());
  }

  @Test
  void setName_whenWithValidParameter_thenSetName() {
    String expected = "astring";
    unitUnderTest.setName(expected);
    assertEquals(expected, unitUnderTest.getName());
  }

  @Test
  void setCountry_whenWithValidParameter_thenSetCountry() {
    boolean expected = false;
    unitUnderTest.setCountry(expected);
    assertEquals(expected, unitUnderTest.isCountry());
  }

  @Test
  void toString_whenCalled_thenReturnStringRepresentation() {
    unitUnderTest.setId(815);
    unitUnderTest.setName("astring");
    unitUnderTest.setCountry(false);
    String expected = "Location(id=815, name=astring, country=false)";
    String actual = unitUnderTest.toString();
    assertEquals(expected, actual);
  }

}
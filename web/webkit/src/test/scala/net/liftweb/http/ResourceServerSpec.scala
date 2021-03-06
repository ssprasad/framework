/*
 * Copyright 2010-2011 WorldWide Conferencing, LLC
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

package net.liftweb
package http

import org.specs.Specification

/**
 * System under specification for ResourceServer.
 */
object ResourceServerSpec extends Specification("ResourceServer Specification") {
  "ResourceServer.pathRewriter" should {
    "default jquery.js to jquery-1.3.2" in {
      ResourceServer.pathRewriter("jquery.js"::Nil) must_== List("jquery-1.3.2-min.js")
    }
  }
}


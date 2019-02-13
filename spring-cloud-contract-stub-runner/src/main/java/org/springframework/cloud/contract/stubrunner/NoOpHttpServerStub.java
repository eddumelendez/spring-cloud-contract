/*
 * Copyright 2013-2019 the original author or authors.
 *
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
 */

package org.springframework.cloud.contract.stubrunner;

import java.io.File;
import java.util.Collection;

/**
 * @author Marcin Grzejszczak
 */
class NoOpHttpServerStub implements HttpServerStub {

	@Override
	public int port() {
		return -1;
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public HttpServerStub start() {
		return this;
	}

	@Override
	public HttpServerStub start(int port) {
		return this;
	}

	@Override
	public HttpServerStub stop() {
		return this;
	}

	@Override
	public HttpServerStub registerMappings(Collection<File> stubFiles) {
		return this;
	}

	@Override
	public String registeredMappings() {
		return "";
	}

	@Override
	public boolean isAccepted(File file) {
		return true;
	}

}

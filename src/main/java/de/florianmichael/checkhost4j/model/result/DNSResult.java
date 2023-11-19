/*
 * This file is part of CheckHost4J - https://github.com/FlorianMichael/CheckHost4J
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.checkhost4j.model.result;

import java.util.Map;

public class DNSResult {

	public final int ttl;
	public final Map<String, String[]> result;

	public DNSResult(int ttl, Map<String, String[]> result) {
		this.ttl = ttl;
		this.result = result;
	}

	public boolean isSuccessful() {
		return ttl >= 0;
	}
}
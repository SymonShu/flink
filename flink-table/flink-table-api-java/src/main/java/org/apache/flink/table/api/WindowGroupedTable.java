/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.api;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.table.expressions.Expression;

/**
 * A table that has been windowed and grouped for {@link GroupWindow}s.
 */
@PublicEvolving
public interface WindowGroupedTable {

	/**
	 * Performs a selection operation on a window grouped table. Similar to an SQL SELECT statement.
	 * The field expressions can contain complex expressions and aggregations.
	 *
	 * <p>Example:
	 *
	 * <pre>
	 * {@code
	 *   windowGroupedTable.select("key, window.start, value.avg as valavg")
	 * }
	 * </pre>
	 */
	Table select(String fields);

	/**
	 * Performs a selection operation on a window grouped table. Similar to an SQL SELECT statement.
	 * The field expressions can contain complex expressions and aggregations.
	 *
	 * <p>Scala Example:
	 *
	 * <pre>
	 * {@code
	 *   windowGroupedTable.select('key, 'window.start, 'value.avg as 'valavg)
	 * }
	 * </pre>
	 */
	Table select(Expression... fields);
}

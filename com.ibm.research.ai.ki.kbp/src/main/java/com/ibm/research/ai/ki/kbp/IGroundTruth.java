/**
 * cc-dbp-dataset
 *
 * Copyright (c) 2017 IBM
 *
 * The author licenses this file to You under the Apache License, Version 2.0
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
package com.ibm.research.ai.ki.kbp;

import java.io.*;
import java.util.*;

/**
 * A generic ground truth interface, the methods needed for preprocessing.
 * @author mrglass
 *
 */
public interface IGroundTruth extends Serializable {
	public String getType(String id);
	public Set<String> getRelevantIds();
	
	public Map<String,String[]> buildEntitySetId2Relations();
}

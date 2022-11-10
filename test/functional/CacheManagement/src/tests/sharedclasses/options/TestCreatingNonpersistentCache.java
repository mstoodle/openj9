/*******************************************************************************
 * Copyright (c) 2010, 2019 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

package tests.sharedclasses.options;

import tests.sharedclasses.TestUtils;

/*
 * Create a new non-persistent cache using default options and check the file goes to the
 * default location as expected.
 */
public class TestCreatingNonpersistentCache extends TestUtils {
  public static void main(String[] args) {
	  
	 if (isMVS()) {
			// this test checks persistent and non persistent cahces ... zos
			// only has nonpersistent ... so we assume other tests cover this
			return;
		}
	  
	destroyPersistentCache("Bar");
	destroyNonPersistentCache("Bar");
	checkNoFileForPersistentCache("Bar");
	checkNoFileForNonPersistentCache("Bar");
	
	createNonPersistentCache("Bar");
	checkForSuccessfulNonPersistentCacheCreationMessage("Bar");
	
	checkFileExistsForNonPersistentCache("Bar");
	checkNoFileForPersistentCache("Bar");
	destroyCache("Bar");
	
	runDestroyAllCaches();
  }
	
}

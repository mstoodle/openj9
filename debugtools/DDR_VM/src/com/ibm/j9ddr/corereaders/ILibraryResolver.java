/*******************************************************************************
 * Copyright (c) 2009, 2014 IBM Corp. and others
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
package com.ibm.j9ddr.corereaders;

import java.io.FileNotFoundException;

/**
 * Object for resolving libraries
 * 
 * @author andhall
 *
 */
public interface ILibraryResolver
{

	/**
	 * 
	 * @param fileName Path of the module
	 * @param silent If true, suppress log messages if file cannot be found
	 * @return File handle on library on local system
	 * @throws FileNotFoundException
	 */
	public LibraryDataSource getLibrary(String fileName, boolean silent) throws FileNotFoundException;
	
	/**
	 * Equivalent to getLibrary(fileName, false);
	 * @param fileName Path of the module
	 * @return File handle on library on local system
	 * @throws FileNotFoundException
	 */
	public LibraryDataSource getLibrary(String fileName) throws FileNotFoundException;
	
	/**
	 * Instructs the resolver to dispose of any resources that it has created 
	 * as part of the resolution process.
	 */
	public void dispose();
}

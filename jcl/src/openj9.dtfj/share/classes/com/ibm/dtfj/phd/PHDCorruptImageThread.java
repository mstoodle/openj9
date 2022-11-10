/*[INCLUDE-IF Sidecar18-SE]*/
/*******************************************************************************
 * Copyright (c) 2008, 2017 IBM Corp. and others
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
package com.ibm.dtfj.phd;

import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;

import com.ibm.dtfj.image.CorruptData;
import com.ibm.dtfj.image.CorruptDataException;
import com.ibm.dtfj.image.DataUnavailable;
import com.ibm.dtfj.image.ImageAddressSpace;
import com.ibm.dtfj.image.ImageRegister;
import com.ibm.dtfj.image.ImageSection;
import com.ibm.dtfj.image.ImageStackFrame;
import com.ibm.dtfj.image.ImageThread;

/** 
 * @author ajohnson
 */
public class PHDCorruptImageThread extends PHDCorruptData implements
		ImageThread {
	
	public PHDCorruptImageThread(ImageAddressSpace space, CorruptData cd) {
		super(space, cd);
	}

	public String getID() throws CorruptDataException {
		throw new CorruptDataException(this);
	}

	public Properties getProperties() {
		return new Properties();
	}

	public Iterator<ImageRegister> getRegisters() {
		return Collections.<ImageRegister>emptyList().iterator();
	}

	public Iterator<ImageStackFrame> getStackFrames() throws DataUnavailable {
		throw new DataUnavailable();
	}

	public Iterator<ImageSection> getStackSections() {
		return Collections.<ImageSection>emptyList().iterator();
	}

}

package com.ibm.ws.objectManager.utils.concurrent.locks;

/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

/**
 * @see java.util.concurrent.locks.ReentrantReadWriteLock
 */
public interface ReentrantReadWriteLock
                extends ReadWriteLock {

    /*
     * (non-Javadoc)
     * 
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#readLock()
     */
    public abstract Lock readLock();

    /*
     * (non-Javadoc)
     * 
     * @see java.util.concurrent.locks.ReentrantReadWriteLock#writeLock()
     */
    public abstract Lock writeLock();

} // interface ReentrantReadWriteLock.
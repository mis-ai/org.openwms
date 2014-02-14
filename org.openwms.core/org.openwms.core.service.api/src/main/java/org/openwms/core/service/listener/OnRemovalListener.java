/*
 * openwms.org, the Open Warehouse Management System.
 * Copyright (C) 2014 Heiko Scherrer
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.core.service.listener;

import org.openwms.core.domain.AbstractEntity;
import org.openwms.core.service.exception.RemovalNotAllowedException;

/**
 * An OnRemovalListener is able to hook in the lifecycle of an entity class. A class implementing this interface is called before an entity
 * of type <code>T</code> is removed.
 * 
 * @param <T>
 *            Any kind of {@link AbstractEntity}
 * @author <a href="mailto:russelltina@users.sourceforge.net">Tina Russell</a>
 * @version $Revision$
 * @since 0.1
 */
public interface OnRemovalListener<T extends AbstractEntity> {

    /**
     * Do something prior the <code>entity</code> instance is been removed.
     * 
     * @param entity
     *            The instance to be removed.
     * @return <code>true</code> if removal is allowed, otherwise <code>false</code>
     * @throws RemovalNotAllowedException
     *             When it is not allowed to remove the entity, because depending items exist
     */
    boolean preRemove(T entity) throws RemovalNotAllowedException;
}
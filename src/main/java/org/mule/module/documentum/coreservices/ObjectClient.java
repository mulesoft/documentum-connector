/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.module.documentum.coreservices;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.emc.documentum.fs.datamodel.core.ObjectIdentity;
import com.emc.documentum.fs.datamodel.core.acl.AclIdentity;
import com.emc.documentum.fs.datamodel.core.content.ContentTransferMode;
import com.emc.documentum.fs.services.core.SerializableException;
import com.emc.documentum.fs.services.core.acl.ServiceException;

public interface ObjectClient {

    public ObjectIdentity createObject(String type, String filePath, String name, String folderPath, ContentTransferMode transferMode) throws IOException, SerializableException;

    public ObjectIdentity createPath(String folderPath) throws SerializableException;

    public File getObject(ObjectIdentity objectIdentity, String outputPath, ContentTransferMode transferMode) throws IOException, SerializableException;

    public ObjectIdentity updateObject(ObjectIdentity objectIdentity, String type, String newContentFilePath, Map<String, String> newProperties, ObjectIdentity oldParentFolder,
            ObjectIdentity newParentFolder, ContentTransferMode transferMode) throws SerializableException, IOException;

    public ObjectIdentity deleteObject(ObjectIdentity objectIdentity) throws SerializableException;

    public ObjectIdentity copyObject(ObjectIdentity objectIdentity, ObjectIdentity folderIdentity) throws SerializableException;

    public ObjectIdentity moveObject(ObjectIdentity objectIdentity, ObjectIdentity toFolderIdentity, ObjectIdentity fromFolderIdentity) throws SerializableException;

    public ObjectIdentity applyAcl(ObjectIdentity objectIdentity, AclIdentity aclIdentity) throws ServiceException, SerializableException;

}
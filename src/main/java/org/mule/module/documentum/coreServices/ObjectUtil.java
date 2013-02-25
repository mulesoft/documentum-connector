/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */

package org.mule.module.documentum.coreServices;

import com.emc.documentum.fs.datamodel.core.*;
import com.emc.documentum.fs.datamodel.core.profiles.ContentTransferProfile;
import com.emc.documentum.fs.datamodel.core.profiles.ContentProfile;
import com.emc.documentum.fs.datamodel.core.profiles.FormatFilter;
import com.emc.documentum.fs.datamodel.core.profiles.Profile;
import com.emc.documentum.fs.datamodel.core.profiles.PropertyFilterMode;
import com.emc.documentum.fs.datamodel.core.content.*;
import com.emc.documentum.fs.datamodel.core.context.RepositoryIdentity;
import com.emc.documentum.fs.datamodel.core.context.ServiceContext;
import com.emc.documentum.fs.services.core.ObjectService;
import com.emc.documentum.fs.services.core.ObjectServicePort;
import com.emc.documentum.fs.services.core.SerializableException;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.soap.MTOMFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectUtil extends Util {
    
    private String repositoryName;
    private ObjectServicePort port;
    private ContentTransferMode transferMode;

    public ObjectUtil(ServiceContext serviceContext, ContentTransferMode transferMode, String target) {
        this.transferMode = transferMode;
        setObjectServicePort(serviceContext, target);
        this.repositoryName = ((RepositoryIdentity) (serviceContext.getIdentities().get(0))).getRepositoryName();
    }
        
    public ObjectIdentity createObject(String type, String filePath, String name, String folderPath) throws IOException, SerializableException {
        Map<String, String> properties = new HashMap<String, String>();
        DataObject dataObject = createDataObject(createObjectIdentity(repositoryName), type);
        if (type.equals("dm_document")) {
            File file = new File(filePath);
            addContent(dataObject, transferMode, fileToByteArray(file));
            properties.put("object_name", file.getName());
            properties.put("a_content_type", file.getName().substring((file.getName().indexOf('.') + 1)));
        }
        else { 
            properties.put("object_name", name);
        }
        addProperties(dataObject, properties);
        dataObject.getRelationships().add(createRelationship(createFolderIdentity(repositoryName, createObjectPath(folderPath))));
        return port.create(createDataPackage(dataObject), null).getDataObjects().get(0).getIdentity();
    }
    
    public ObjectIdentity createPath(String folderPath) throws SerializableException {
        return port.createPath(createObjectPath(folderPath), repositoryName);
    }
    
    public File getObject(ObjectIdentity objectIdentity, String outputPath) throws IOException, SerializableException {
        List<Profile> profiles = new ArrayList<Profile>();
        ContentTransferProfile contentTransferProfile = createContentTransferProfile(transferMode);
        ContentProfile contentProfile = createContentProfile(FormatFilter.ANY);
        profiles.add(contentTransferProfile);
        profiles.add(contentProfile);
        return contentToFile(port.get(createObjectIdentitySet(objectIdentity), createOperationOptions(profiles)).getDataObjects().get(0).getContents().get(0), new File(outputPath));
    }
    
    public ObjectIdentity updateObject(ObjectIdentity objectIdentity, String type, String newContentFilePath, Map<String, String> newProperties, ObjectIdentity oldParentFolder, ObjectIdentity newParentFolder) throws SerializableException, IOException {        
        DataObject dataObject = createDataObject(objectIdentity, type);
        if (newContentFilePath != null) {
            File file = new File(newContentFilePath);
            addContent(dataObject, transferMode, fileToByteArray(file));
            Map<String, String> properties = new HashMap<String, String>();
            properties.put("object_name", file.getName());
            properties.put("a_content_type", file.getName().substring((file.getName().indexOf('.') + 1)));
            addProperties(dataObject, properties);
        }
        if (newProperties != null) {
            addProperties(dataObject, newProperties);
        }
        if (oldParentFolder != null && newParentFolder != null) {
            dataObject.getRelationships().add(createRelationship(oldParentFolder, RelationshipIntentModifier.REMOVE));
            dataObject.getRelationships().add(createRelationship(newParentFolder));
        }
        return port.update(createDataPackage(dataObject), createOperationOptions(createPropertyProfile(PropertyFilterMode.ALL_NON_SYSTEM))).getDataObjects().get(0).getIdentity();
    }
    
    public ObjectIdentity deleteObject(ObjectIdentity objectIdentity) throws SerializableException {                
        port.delete(createObjectIdentitySet(objectIdentity), createOperationOptions(createDeleteProfile(true, true)));
        return objectIdentity;
    }
    
    public ObjectIdentity copyObject(ObjectIdentity objectIdentity, ObjectIdentity folderIdentity) throws SerializableException {      
        return port.copy(createObjectIdentitySet(objectIdentity), createObjectLocation(folderIdentity), new DataPackage(), null).getDataObjects().get(0).getIdentity();
    }
    
    public ObjectIdentity moveObject(ObjectIdentity objectIdentity, ObjectIdentity toFolderIdentity, ObjectIdentity fromFolderIdentity) throws SerializableException {
        return port.move(createObjectIdentitySet(objectIdentity), createObjectLocation(fromFolderIdentity), createObjectLocation(toFolderIdentity), new DataPackage(), null).getDataObjects().get(0).getIdentity();
    }
    
    private void setObjectServicePort(final ServiceContext context, String target) {
        ObjectService objectService = new ObjectService();
        objectService.setHandlerResolver(new HandlerResolver() {
            @SuppressWarnings("rawtypes")
            public List<Handler> getHandlerChain(PortInfo info) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new HeaderHandler(context));
                return handlerList;
            }
        });
        if (transferMode == ContentTransferMode.MTOM) {
            port = objectService.getObjectServicePort(new MTOMFeature());
        }
        else {
            port = objectService.getObjectServicePort();
        }
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, target + "core/ObjectService");
    }
    
}
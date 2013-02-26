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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.apache.cxf.attachment.ByteDataSource;

import com.emc.documentum.fs.datamodel.core.DataObject;
import com.emc.documentum.fs.datamodel.core.ObjectIdentity;
import com.emc.documentum.fs.datamodel.core.ObjectIdentitySet;
import com.emc.documentum.fs.datamodel.core.OperationOptions;
import com.emc.documentum.fs.datamodel.core.content.BinaryContent;
import com.emc.documentum.fs.datamodel.core.content.ContentTransferMode;
import com.emc.documentum.fs.datamodel.core.content.DataHandlerContent;
import com.emc.documentum.fs.datamodel.core.profiles.Profile;

public class Util {
    
    protected void addContent(DataObject dataObject, ContentTransferMode transferMode, byte[] byteArray) {
        if (transferMode == ContentTransferMode.MTOM) {
            dataObject.getContents().add(getDataHandlerContent(byteArray));
        }
        else if (transferMode == ContentTransferMode.BASE_64) {
            dataObject.getContents().add(getBinaryContent(byteArray));
        }
    }
    
    protected DataHandlerContent getDataHandlerContent(byte[] byteArray) {
        DataSource byteDataSource = new ByteDataSource(byteArray);
        DataHandler dataHandler = new DataHandler(byteDataSource);
        DataHandlerContent dataHandlerContent = new DataHandlerContent();
        dataHandlerContent.setValue(dataHandler);
        return dataHandlerContent;
    }

    protected BinaryContent getBinaryContent(byte[] byteArray) {
        BinaryContent binaryContent = new BinaryContent();
        binaryContent.setValue(byteArray);
        return binaryContent;
    }
    
    protected byte[] fileToByteArray(File file) throws IOException {
        byte[] byteArray = new byte[(int) file.length()];
        InputStream fis = new FileInputStream(file);
        fis.read(byteArray);
        fis.close();
        return byteArray;
    }
    
    protected ObjectIdentitySet createObjectIdentitySet(ObjectIdentity objectIdentity) {
        ObjectIdentitySet objIdSet = new ObjectIdentitySet();
        objIdSet.getIdentities().add(objectIdentity);
        return objIdSet;
    }
    
    protected OperationOptions createOperationOptions(List<Profile> profiles) {
        OperationOptions operationOptions = new OperationOptions();
        for(Profile profile: profiles){
            operationOptions.getProfiles().add(profile); 
        }
        return operationOptions;
    }
    
    protected OperationOptions createOperationOptions(Profile profile) {
        OperationOptions operationOptions = new OperationOptions();
        operationOptions.getProfiles().add(profile); 
        return operationOptions;
    }

}
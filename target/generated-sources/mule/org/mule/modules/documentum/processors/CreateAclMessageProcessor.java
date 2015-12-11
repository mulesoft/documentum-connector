
package org.mule.modules.documentum.processors;

import com.emc.documentum.fs.datamodel.core.acl.Acl;
import com.emc.documentum.fs.datamodel.core.acl.AclEntry;
import com.emc.documentum.fs.datamodel.core.acl.AclType;
import com.emc.documentum.fs.datamodel.core.acl.AclVisibility;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultMetaDataKey;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.internal.metadata.fixes.STUDIO7157;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.modules.documentum.DocumentumConnector;
import org.mule.modules.documentum.DocumentumConnectorException;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * CreateAclMessageProcessor invokes the {@link org.mule.modules.documentum.DocumentumConnector#createAcl(java.lang.String, java.lang.String, java.util.List, com.emc.documentum.fs.datamodel.core.acl.AclVisibility, com.emc.documentum.fs.datamodel.core.acl.AclType)} method in {@link DocumentumConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class CreateAclMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object aclName;
    protected String _aclNameType;
    protected Object aclDescription;
    protected String _aclDescriptionType;
    protected Object aclEntries;
    protected List<AclEntry> _aclEntriesType;
    protected Object aclVisibility;
    protected AclVisibility _aclVisibilityType;
    protected Object aclType;
    protected AclType _aclTypeType;

    public CreateAclMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets aclName
     * 
     * @param value Value to set
     */
    public void setAclName(Object value) {
        this.aclName = value;
    }

    /**
     * Sets aclType
     * 
     * @param value Value to set
     */
    public void setAclType(Object value) {
        this.aclType = value;
    }

    /**
     * Sets aclEntries
     * 
     * @param value Value to set
     */
    public void setAclEntries(Object value) {
        this.aclEntries = value;
    }

    /**
     * Sets aclDescription
     * 
     * @param value Value to set
     */
    public void setAclDescription(Object value) {
        this.aclDescription = value;
    }

    /**
     * Sets aclVisibility
     * 
     * @param value Value to set
     */
    public void setAclVisibility(Object value) {
        this.aclVisibility = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedAclName = ((String) evaluateAndTransform(getMuleContext(), event, CreateAclMessageProcessor.class.getDeclaredField("_aclNameType").getGenericType(), null, aclName));
            final String _transformedAclDescription = ((String) evaluateAndTransform(getMuleContext(), event, CreateAclMessageProcessor.class.getDeclaredField("_aclDescriptionType").getGenericType(), null, aclDescription));
            final List<AclEntry> _transformedAclEntries = ((List<AclEntry> ) evaluateAndTransform(getMuleContext(), event, CreateAclMessageProcessor.class.getDeclaredField("_aclEntriesType").getGenericType(), null, aclEntries));
            final AclVisibility _transformedAclVisibility = ((AclVisibility) evaluateAndTransform(getMuleContext(), event, CreateAclMessageProcessor.class.getDeclaredField("_aclVisibilityType").getGenericType(), null, aclVisibility));
            final AclType _transformedAclType = ((AclType) evaluateAndTransform(getMuleContext(), event, CreateAclMessageProcessor.class.getDeclaredField("_aclTypeType").getGenericType(), null, aclType));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return Arrays.asList(((Class<? extends Exception> []) new Class[] {DocumentumConnectorException.class }));
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((DocumentumConnector) object).createAcl(_transformedAclName, _transformedAclDescription, _transformedAclEntries, _transformedAclVisibility, _transformedAclType);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        MetaDataModel metaDataPayload = getPojoOrSimpleModel(Acl.class);
        DefaultMetaDataKey keyForStudio = new DefaultMetaDataKey("OUTPUT_METADATA", null);
        metaDataPayload.addProperty(STUDIO7157 .getStructureIdentifierMetaDataModelProperty(keyForStudio, false, false));
        return new DefaultResult<MetaData>(new DefaultMetaData(metaDataPayload));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at DocumentumConnector at createAcl retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}

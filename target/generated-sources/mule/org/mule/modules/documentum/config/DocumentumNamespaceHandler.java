
package org.mule.modules.documentum.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/documentum</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class DocumentumNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(DocumentumNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [documentum] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [documentum] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new DocumentumConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-document", new CreateDocumentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-document", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-folder", new CreateFolderDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-folder", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-path", new CreatePathDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-path", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-object", new GetObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-document", new UpdateDocumentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-document", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-folder", new UpdateFolderDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-folder", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-object", new DeleteObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("copy-object", new CopyObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("copy-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("move-object", new MoveObjectDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("move-object", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-checkout-info", new GetCheckoutInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-checkout-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("checkout", new CheckoutDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("checkout", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("checkin", new CheckinDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("checkin", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("cancel-checkout", new CancelCheckoutDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("cancel-checkout", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-version", new DeleteVersionDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-version", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-all-versions", new DeleteAllVersionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-all-versions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-current", new GetCurrentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-current", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-version-info", new GetVersionInfoDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-version-info", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query", new QueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("create-acl", new CreateAclDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("create-acl", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-acl", new GetAclDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-acl", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("update-acl", new UpdateAclDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("update-acl", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("delete-acl", new DeleteAclDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("delete-acl", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("apply-acl", new ApplyAclDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("apply-acl", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("get-acls", new GetAclsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("get-acls", "@Processor", ex);
        }
    }

}

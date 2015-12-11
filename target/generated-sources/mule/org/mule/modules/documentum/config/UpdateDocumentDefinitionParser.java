
package org.mule.modules.documentum.config;

import com.emc.documentum.fs.datamodel.core.holders.CompositeObjectIdExpressionHolder;
import com.emc.documentum.fs.datamodel.core.holders.ObjectIdExpressionHolder;
import com.emc.documentum.fs.datamodel.core.holders.ObjectIdentityExpressionHolder;
import com.emc.documentum.fs.datamodel.core.holders.ObjectKeyExpressionHolder;
import com.emc.documentum.fs.datamodel.core.holders.ObjectPathExpressionHolder;
import com.emc.documentum.fs.datamodel.core.holders.QualificationExpressionHolder;
import com.emc.documentum.fs.datamodel.core.properties.holders.PropertySetExpressionHolder;
import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.documentum.processors.UpdateDocumentMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser.ParseDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.xml.DomUtils;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class UpdateDocumentDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(UpdateDocumentDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(UpdateDocumentMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [update-document] within the connector [documentum] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [update-document] within the connector [documentum] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("updateDocument");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [update-document] within the connector [documentum] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "object-identity", "objectIdentity", "#[payload]")) {
            BeanDefinitionBuilder objectIdentityBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdentityExpressionHolder.class.getName());
            Element objectIdentityChildElement = DomUtils.getChildElementByTagName(element, "object-identity");
            if (objectIdentityChildElement!= null) {
                if (!parseObjectRef(objectIdentityChildElement, objectIdentityBuilder, "object-id", "objectId")) {
                    BeanDefinitionBuilder _objectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdExpressionHolder.class.getName());
                    Element _objectIdChildElement = DomUtils.getChildElementByTagName(objectIdentityChildElement, "object-id");
                    if (_objectIdChildElement!= null) {
                        parseProperty(_objectIdBuilder, _objectIdChildElement, "id", "id");
                        objectIdentityBuilder.addPropertyValue("objectId", _objectIdBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objectIdentityChildElement, objectIdentityBuilder, "object-key", "objectKey")) {
                    BeanDefinitionBuilder _objectKeyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectKeyExpressionHolder.class.getName());
                    Element _objectKeyChildElement = DomUtils.getChildElementByTagName(objectIdentityChildElement, "object-key");
                    if (_objectKeyChildElement!= null) {
                        if (!parseObjectRef(_objectKeyChildElement, _objectKeyBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_objectKeyChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _objectKeyBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_objectKeyBuilder, _objectKeyChildElement, "objectType", "objectType");
                        objectIdentityBuilder.addPropertyValue("objectKey", _objectKeyBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objectIdentityChildElement, objectIdentityBuilder, "object-path", "objectPath")) {
                    BeanDefinitionBuilder _objectPathBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectPathExpressionHolder.class.getName());
                    Element _objectPathChildElement = DomUtils.getChildElementByTagName(objectIdentityChildElement, "object-path");
                    if (_objectPathChildElement!= null) {
                        parseProperty(_objectPathBuilder, _objectPathChildElement, "path", "path");
                        objectIdentityBuilder.addPropertyValue("objectPath", _objectPathBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objectIdentityChildElement, objectIdentityBuilder, "qualification", "qualification")) {
                    BeanDefinitionBuilder _qualificationBuilder = BeanDefinitionBuilder.rootBeanDefinition(QualificationExpressionHolder.class.getName());
                    Element _qualificationChildElement = DomUtils.getChildElementByTagName(objectIdentityChildElement, "qualification");
                    if (_qualificationChildElement!= null) {
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "string", "string");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "qualificationValueType", "qualificationValueType");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "objectType", "objectType");
                        objectIdentityBuilder.addPropertyValue("qualification", _qualificationBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objectIdentityChildElement, objectIdentityBuilder, "composite-object-id", "compositeObjectId")) {
                    BeanDefinitionBuilder _compositeObjectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompositeObjectIdExpressionHolder.class.getName());
                    Element _compositeObjectIdChildElement = DomUtils.getChildElementByTagName(objectIdentityChildElement, "composite-object-id");
                    if (_compositeObjectIdChildElement!= null) {
                        if (!parseObjectRef(_compositeObjectIdChildElement, _compositeObjectIdBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_compositeObjectIdChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _compositeObjectIdBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_compositeObjectIdBuilder, _compositeObjectIdChildElement, "objectType", "objectType");
                        objectIdentityBuilder.addPropertyValue("compositeObjectId", _compositeObjectIdBuilder.getBeanDefinition());
                    }
                }
                parseProperty(objectIdentityBuilder, objectIdentityChildElement, "stringUri", "stringUri");
                parseProperty(objectIdentityBuilder, objectIdentityChildElement, "valueType", "valueType");
                parseProperty(objectIdentityBuilder, objectIdentityChildElement, "repositoryName", "repositoryName");
                builder.addPropertyValue("objectIdentity", objectIdentityBuilder.getBeanDefinition());
            }
        }
        parseProperty(builder, element, "newContentFilePath", "newContentFilePath");
        parseProperty(builder, element, "transferMode", "transferMode");
        parseMapAndSetProperty(element, builder, "newProperties", "new-properties", "new-property", new ParseDelegate<String>() {


            public String parse(Element element) {
                return element.getTextContent();
            }

        }
        );
        if (!parseObjectRef(element, builder, "old-parent-folder", "oldParentFolder")) {
            BeanDefinitionBuilder oldParentFolderBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdentityExpressionHolder.class.getName());
            Element oldParentFolderChildElement = DomUtils.getChildElementByTagName(element, "old-parent-folder");
            if (oldParentFolderChildElement!= null) {
                if (!parseObjectRef(oldParentFolderChildElement, oldParentFolderBuilder, "object-id", "objectId")) {
                    BeanDefinitionBuilder _objectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdExpressionHolder.class.getName());
                    Element _objectIdChildElement = DomUtils.getChildElementByTagName(oldParentFolderChildElement, "object-id");
                    if (_objectIdChildElement!= null) {
                        parseProperty(_objectIdBuilder, _objectIdChildElement, "id", "id");
                        oldParentFolderBuilder.addPropertyValue("objectId", _objectIdBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(oldParentFolderChildElement, oldParentFolderBuilder, "object-key", "objectKey")) {
                    BeanDefinitionBuilder _objectKeyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectKeyExpressionHolder.class.getName());
                    Element _objectKeyChildElement = DomUtils.getChildElementByTagName(oldParentFolderChildElement, "object-key");
                    if (_objectKeyChildElement!= null) {
                        if (!parseObjectRef(_objectKeyChildElement, _objectKeyBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_objectKeyChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _objectKeyBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_objectKeyBuilder, _objectKeyChildElement, "objectType", "objectType");
                        oldParentFolderBuilder.addPropertyValue("objectKey", _objectKeyBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(oldParentFolderChildElement, oldParentFolderBuilder, "object-path", "objectPath")) {
                    BeanDefinitionBuilder _objectPathBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectPathExpressionHolder.class.getName());
                    Element _objectPathChildElement = DomUtils.getChildElementByTagName(oldParentFolderChildElement, "object-path");
                    if (_objectPathChildElement!= null) {
                        parseProperty(_objectPathBuilder, _objectPathChildElement, "path", "path");
                        oldParentFolderBuilder.addPropertyValue("objectPath", _objectPathBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(oldParentFolderChildElement, oldParentFolderBuilder, "qualification", "qualification")) {
                    BeanDefinitionBuilder _qualificationBuilder = BeanDefinitionBuilder.rootBeanDefinition(QualificationExpressionHolder.class.getName());
                    Element _qualificationChildElement = DomUtils.getChildElementByTagName(oldParentFolderChildElement, "qualification");
                    if (_qualificationChildElement!= null) {
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "string", "string");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "qualificationValueType", "qualificationValueType");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "objectType", "objectType");
                        oldParentFolderBuilder.addPropertyValue("qualification", _qualificationBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(oldParentFolderChildElement, oldParentFolderBuilder, "composite-object-id", "compositeObjectId")) {
                    BeanDefinitionBuilder _compositeObjectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompositeObjectIdExpressionHolder.class.getName());
                    Element _compositeObjectIdChildElement = DomUtils.getChildElementByTagName(oldParentFolderChildElement, "composite-object-id");
                    if (_compositeObjectIdChildElement!= null) {
                        if (!parseObjectRef(_compositeObjectIdChildElement, _compositeObjectIdBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_compositeObjectIdChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _compositeObjectIdBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_compositeObjectIdBuilder, _compositeObjectIdChildElement, "objectType", "objectType");
                        oldParentFolderBuilder.addPropertyValue("compositeObjectId", _compositeObjectIdBuilder.getBeanDefinition());
                    }
                }
                parseProperty(oldParentFolderBuilder, oldParentFolderChildElement, "stringUri", "stringUri");
                parseProperty(oldParentFolderBuilder, oldParentFolderChildElement, "valueType", "valueType");
                parseProperty(oldParentFolderBuilder, oldParentFolderChildElement, "repositoryName", "repositoryName");
                builder.addPropertyValue("oldParentFolder", oldParentFolderBuilder.getBeanDefinition());
            }
        }
        if (!parseObjectRef(element, builder, "new-parent-folder", "newParentFolder")) {
            BeanDefinitionBuilder newParentFolderBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdentityExpressionHolder.class.getName());
            Element newParentFolderChildElement = DomUtils.getChildElementByTagName(element, "new-parent-folder");
            if (newParentFolderChildElement!= null) {
                if (!parseObjectRef(newParentFolderChildElement, newParentFolderBuilder, "object-id", "objectId")) {
                    BeanDefinitionBuilder _objectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdExpressionHolder.class.getName());
                    Element _objectIdChildElement = DomUtils.getChildElementByTagName(newParentFolderChildElement, "object-id");
                    if (_objectIdChildElement!= null) {
                        parseProperty(_objectIdBuilder, _objectIdChildElement, "id", "id");
                        newParentFolderBuilder.addPropertyValue("objectId", _objectIdBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(newParentFolderChildElement, newParentFolderBuilder, "object-key", "objectKey")) {
                    BeanDefinitionBuilder _objectKeyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectKeyExpressionHolder.class.getName());
                    Element _objectKeyChildElement = DomUtils.getChildElementByTagName(newParentFolderChildElement, "object-key");
                    if (_objectKeyChildElement!= null) {
                        if (!parseObjectRef(_objectKeyChildElement, _objectKeyBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_objectKeyChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _objectKeyBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_objectKeyBuilder, _objectKeyChildElement, "objectType", "objectType");
                        newParentFolderBuilder.addPropertyValue("objectKey", _objectKeyBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(newParentFolderChildElement, newParentFolderBuilder, "object-path", "objectPath")) {
                    BeanDefinitionBuilder _objectPathBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectPathExpressionHolder.class.getName());
                    Element _objectPathChildElement = DomUtils.getChildElementByTagName(newParentFolderChildElement, "object-path");
                    if (_objectPathChildElement!= null) {
                        parseProperty(_objectPathBuilder, _objectPathChildElement, "path", "path");
                        newParentFolderBuilder.addPropertyValue("objectPath", _objectPathBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(newParentFolderChildElement, newParentFolderBuilder, "qualification", "qualification")) {
                    BeanDefinitionBuilder _qualificationBuilder = BeanDefinitionBuilder.rootBeanDefinition(QualificationExpressionHolder.class.getName());
                    Element _qualificationChildElement = DomUtils.getChildElementByTagName(newParentFolderChildElement, "qualification");
                    if (_qualificationChildElement!= null) {
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "string", "string");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "qualificationValueType", "qualificationValueType");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "objectType", "objectType");
                        newParentFolderBuilder.addPropertyValue("qualification", _qualificationBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(newParentFolderChildElement, newParentFolderBuilder, "composite-object-id", "compositeObjectId")) {
                    BeanDefinitionBuilder _compositeObjectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompositeObjectIdExpressionHolder.class.getName());
                    Element _compositeObjectIdChildElement = DomUtils.getChildElementByTagName(newParentFolderChildElement, "composite-object-id");
                    if (_compositeObjectIdChildElement!= null) {
                        if (!parseObjectRef(_compositeObjectIdChildElement, _compositeObjectIdBuilder, "property-set", "propertySet")) {
                            BeanDefinitionBuilder __propertySetBuilder = BeanDefinitionBuilder.rootBeanDefinition(PropertySetExpressionHolder.class.getName());
                            Element __propertySetChildElement = DomUtils.getChildElementByTagName(_compositeObjectIdChildElement, "property-set");
                            if (__propertySetChildElement!= null) {
                                parseProperty(__propertySetBuilder, __propertySetChildElement, "isInternal", "isInternal");
                                _compositeObjectIdBuilder.addPropertyValue("propertySet", __propertySetBuilder.getBeanDefinition());
                            }
                        }
                        parseProperty(_compositeObjectIdBuilder, _compositeObjectIdChildElement, "objectType", "objectType");
                        newParentFolderBuilder.addPropertyValue("compositeObjectId", _compositeObjectIdBuilder.getBeanDefinition());
                    }
                }
                parseProperty(newParentFolderBuilder, newParentFolderChildElement, "stringUri", "stringUri");
                parseProperty(newParentFolderBuilder, newParentFolderChildElement, "valueType", "valueType");
                parseProperty(newParentFolderBuilder, newParentFolderChildElement, "repositoryName", "repositoryName");
                builder.addPropertyValue("newParentFolder", newParentFolderBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}

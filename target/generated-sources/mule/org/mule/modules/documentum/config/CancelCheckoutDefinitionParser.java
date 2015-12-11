
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
import org.mule.modules.documentum.processors.CancelCheckoutMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
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
public class CancelCheckoutDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(CancelCheckoutDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(CancelCheckoutMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [cancel-checkout] within the connector [documentum] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [cancel-checkout] within the connector [documentum] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("cancelCheckout");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [cancel-checkout] within the connector [documentum] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        if (!parseObjectRefWithDefault(element, builder, "obj-identity", "objIdentity", "#[payload]")) {
            BeanDefinitionBuilder objIdentityBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdentityExpressionHolder.class.getName());
            Element objIdentityChildElement = DomUtils.getChildElementByTagName(element, "obj-identity");
            if (objIdentityChildElement!= null) {
                if (!parseObjectRef(objIdentityChildElement, objIdentityBuilder, "object-id", "objectId")) {
                    BeanDefinitionBuilder _objectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectIdExpressionHolder.class.getName());
                    Element _objectIdChildElement = DomUtils.getChildElementByTagName(objIdentityChildElement, "object-id");
                    if (_objectIdChildElement!= null) {
                        parseProperty(_objectIdBuilder, _objectIdChildElement, "id", "id");
                        objIdentityBuilder.addPropertyValue("objectId", _objectIdBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objIdentityChildElement, objIdentityBuilder, "object-key", "objectKey")) {
                    BeanDefinitionBuilder _objectKeyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectKeyExpressionHolder.class.getName());
                    Element _objectKeyChildElement = DomUtils.getChildElementByTagName(objIdentityChildElement, "object-key");
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
                        objIdentityBuilder.addPropertyValue("objectKey", _objectKeyBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objIdentityChildElement, objIdentityBuilder, "object-path", "objectPath")) {
                    BeanDefinitionBuilder _objectPathBuilder = BeanDefinitionBuilder.rootBeanDefinition(ObjectPathExpressionHolder.class.getName());
                    Element _objectPathChildElement = DomUtils.getChildElementByTagName(objIdentityChildElement, "object-path");
                    if (_objectPathChildElement!= null) {
                        parseProperty(_objectPathBuilder, _objectPathChildElement, "path", "path");
                        objIdentityBuilder.addPropertyValue("objectPath", _objectPathBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objIdentityChildElement, objIdentityBuilder, "qualification", "qualification")) {
                    BeanDefinitionBuilder _qualificationBuilder = BeanDefinitionBuilder.rootBeanDefinition(QualificationExpressionHolder.class.getName());
                    Element _qualificationChildElement = DomUtils.getChildElementByTagName(objIdentityChildElement, "qualification");
                    if (_qualificationChildElement!= null) {
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "string", "string");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "qualificationValueType", "qualificationValueType");
                        parseProperty(_qualificationBuilder, _qualificationChildElement, "objectType", "objectType");
                        objIdentityBuilder.addPropertyValue("qualification", _qualificationBuilder.getBeanDefinition());
                    }
                }
                if (!parseObjectRef(objIdentityChildElement, objIdentityBuilder, "composite-object-id", "compositeObjectId")) {
                    BeanDefinitionBuilder _compositeObjectIdBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompositeObjectIdExpressionHolder.class.getName());
                    Element _compositeObjectIdChildElement = DomUtils.getChildElementByTagName(objIdentityChildElement, "composite-object-id");
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
                        objIdentityBuilder.addPropertyValue("compositeObjectId", _compositeObjectIdBuilder.getBeanDefinition());
                    }
                }
                parseProperty(objIdentityBuilder, objIdentityChildElement, "stringUri", "stringUri");
                parseProperty(objIdentityBuilder, objIdentityChildElement, "valueType", "valueType");
                parseProperty(objIdentityBuilder, objIdentityChildElement, "repositoryName", "repositoryName");
                builder.addPropertyValue("objIdentity", objIdentityBuilder.getBeanDefinition());
            }
        }
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}

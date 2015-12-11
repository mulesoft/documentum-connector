
package com.emc.documentum.fs.datamodel.core.content.transformers;

import com.emc.documentum.fs.datamodel.core.content.ContentTransferMode;
import javax.annotation.Generated;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class ContentTransferModeEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public ContentTransferModeEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(ContentTransferMode.class);
        setName("ContentTransferModeEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        ContentTransferMode result = null;
        result = Enum.valueOf(ContentTransferMode.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}

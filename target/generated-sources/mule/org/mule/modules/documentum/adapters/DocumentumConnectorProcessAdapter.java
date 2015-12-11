
package org.mule.modules.documentum.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.documentum.DocumentumConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DocumentumConnectorProcessAdapter</code> is a wrapper around {@link DocumentumConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.2", date = "2015-12-11T05:10:50-03:00", comments = "Build 3.7.x.2633.51164b9")
public class DocumentumConnectorProcessAdapter
    extends DocumentumConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DocumentumConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DocumentumConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DocumentumConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DocumentumConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DocumentumConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DocumentumConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}

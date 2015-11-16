/**
 * (c) 2003-2015 MuleSoft, Inc. This software is protected under international copyright law. All use of this software is subject to MuleSoft’s Master Subscription Agreement (or other Terms of Service) separately entered into between you and MuleSoft. If such an agreement is not in place, you may not use the software.
 */
package org.mule.modules.documentum.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.documentum.DocumentumConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({})
public class FunctionalTestSuite {

    @BeforeClass
    public static void initialiseSuite() {
        ConnectorTestContext.initialize(DocumentumConnector.class);
    }

    @AfterClass
    public static void shutdownSuite() throws Exception {
        ConnectorTestContext.shutDown();
    }
}

/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2011 Vincent Massol, 2012-2015 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.sample.maven2.weblogic;

import java.net.URL;

import junit.framework.TestCase;

import org.codehaus.cargo.sample.java.PingUtils;
import org.codehaus.cargo.util.log.Logger;
import org.codehaus.cargo.util.log.SimpleLogger;

/**
 * Test WebLogic container.
 */
public class WebLogicTest extends TestCase
{

    /**
     * Project version.
     */
    private final String projectVersion = System.getProperty("project.version");

    /**
     * Logger.
     */
    private Logger logger = new SimpleLogger();

    /**
     * Test changing of classpath with the WebSphere container.
     * @throws Exception If anything fails.
     */
    public void testClasspathWar() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/classpath-war-" + projectVersion + "/test");
        final String expected = "Got class!";

        PingUtils.assertPingTrue(url.getPath() + " not started", expected, url, logger);
    }

    /**
     * Test deploying a simple EAR.
     * @throws Exception If anything fails.
     */
    public void testSimpleEar() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/simpleweb");
        final String expected = "Sample page for testing";

        PingUtils.assertPingTrue(url.getPath() + " not started", expected, url, logger);
    }

    /**
     * Test deploying a simple WAR.
     * @throws Exception If anything fails.
     */
    public void testSimpleWar() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/simple-war-" + projectVersion);
        final String expected = "Sample page for testing";

        PingUtils.assertPingTrue(url.getPath() + " not started", expected, url, logger);
    }

    /**
     * Test verifying datasource.
     * @throws Exception If anything fails.
     */
    public void testDatasource() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/datasource-war-" + projectVersion + "/test");
        final String expected = "Got connection!";

        PingUtils.assertPingTrue(url.getPath() + " not started", expected, url, logger);
    }

    /**
     * Test verifying JMS.
     * @throws Exception If anything fails.
     */
    public void testJms() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/jms-war-" + projectVersion + "/test");
        final String expected = "Got queue!";

        PingUtils.assertPingTrue(url.getPath() + " not started", expected, url, logger);
    }
}

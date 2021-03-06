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
package org.codehaus.cargo.container.wildfly.internal;

import org.codehaus.cargo.container.jboss.JBossPropertySet;
import org.codehaus.cargo.container.jboss.internal.JBoss72xStandaloneLocalConfigurationCapability;

/**
 * Capabilities of the WildFly's
 * {@link org.codehaus.cargo.container.jboss.JBossStandaloneLocalConfiguration} configuration.
 * 
 */
public class WildFlyStandaloneLocalConfigurationCapability
    extends JBoss72xStandaloneLocalConfigurationCapability
{

    /**
     * Initialize WildFly-specific configuration Map.
     */
    public WildFlyStandaloneLocalConfigurationCapability()
    {
        super();

        this.propertySupportMap.remove(JBossPropertySet.JBOSS_MANAGEMENT_NATIVE_PORT);
        this.propertySupportMap.remove(JBossPropertySet.JBOSS_REMOTING_TRANSPORT_PORT);
    }

}

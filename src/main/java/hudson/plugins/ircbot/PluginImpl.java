package hudson.plugins.ircbot;

import hudson.Plugin;
import hudson.model.UserProperties;
import hudson.tasks.Publisher;

/**
 * Entry point of the plugin.
 *
 * @author Renaud Bruyeron
 * @version $Id: PluginImpl.java 1415 2006-12-22 16:49:11Z bruyeron $
 * @plugin
 */
public class PluginImpl extends Plugin {
    public void start() throws Exception {
        // plugins normally extend Hudson by providing custom implementations
        // of 'extension points'. In this case, we'll add one publisher.
        Publisher.PUBLISHERS.add(IrcPublisher.DESCRIPTOR);
        UserProperties.LIST.add(IrcUserProperty.DESCRIPTOR);
    }

	/**
	 * @see hudson.Plugin#stop()
	 */
	@Override
	public void stop() throws Exception {
		IrcPublisher.DESCRIPTOR.stop();
	}
    
    
}
/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.view.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory;
import org.obeonetwork.dsl.environment.providers.MetadataCptPropertiesEditionProvider;

/**
 * 
 * 
 */
public class ViewEEFAdapterFactory extends ViewAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createObeoDSMObjectAdapter()
	 * 
	 */
	public Adapter createObeoDSMObjectAdapter() {
		return new MetadataCptPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createViewContainerAdapter()
	 * 
	 */
	public Adapter createViewContainerAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewContainerPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createViewElementAdapter()
	 * 
	 */
	public Adapter createViewElementAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewElementPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createViewActionAdapter()
	 * 
	 */
	public Adapter createViewActionAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewActionPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createViewEventAdapter()
	 * 
	 */
	public Adapter createViewEventAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewEventPropertiesEditionProvider(providers);
	}
	/**
	 * {@inheritDoc}
	 * @see org.obeonetwork.dsl.cinematic.view.util.ViewAdapterFactory#createViewContainerReferenceAdapter()
	 * 
	 */
	public Adapter createViewContainerReferenceAdapter() {
		List<PropertiesEditingProvider> providers = new ArrayList<PropertiesEditingProvider>(1);
		providers.add((PropertiesEditingProvider)createObeoDSMObjectAdapter());
		return new ViewContainerReferencePropertiesEditionProvider(providers);
	}

}

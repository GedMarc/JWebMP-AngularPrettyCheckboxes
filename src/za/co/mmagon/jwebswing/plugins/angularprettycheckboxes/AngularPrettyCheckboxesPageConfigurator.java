package za.co.mmagon.jwebswing.plugins.angularprettycheckboxes;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular Pretty Checkboxes",
		pluginDescription = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginUniqueName = "jwebswing-angular-pretty-checkboxes",
		pluginVersion = "1.7.4",
		pluginCategories = "angular,forms, checkboxes, ui,web ui, framework",
		pluginSubtitle = "Pure angular pretty checkbox / radio directive. Makes it incredibly simple to have pretty checkboxes / radios in angular.",
		pluginSourceUrl = "https://github.com/itslenny/angular-pretty-checkable",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-AngularPrettyCheckboxes/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-AngularPrettyCheckboxes",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/guide/animations",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularAnimate.jar/download"
) class AngularPrettyCheckboxesPageConfigurator extends PageConfigurator
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularPrettyCheckboxesPageConfigurator
	 */
	public AngularPrettyCheckboxesPageConfigurator()
	{
		//Nothing needed
	}
	
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getBody().addJavaScriptReference(AngularPrettyCheckboxesReferencePool.AngularAnimations.getJavaScriptReference());
			page.getAngular().getAngularModules().add(new AngularPrettyCheckboxesModule());
		}
		return page;
	}
}

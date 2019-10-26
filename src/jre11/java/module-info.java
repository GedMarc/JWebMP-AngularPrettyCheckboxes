module com.jwebmp.plugins.angularprettycheckboxes {
	exports com.jwebmp.plugins.angularprettycheckboxes;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesModule;

	opens com.jwebmp.plugins.angularprettycheckboxes to com.fasterxml.jackson.databind, com.jwebmp.core;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularprettycheckboxes.implementations.AngularPrettyCheckboxesExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularprettycheckboxes.implementations.AngularPrettyCheckboxesExclusionsModule;

}

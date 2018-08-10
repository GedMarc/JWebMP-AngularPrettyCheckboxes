import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesModule;
import com.jwebmp.plugins.angularprettycheckboxes.AngularPrettyCheckboxesPageConfigurator;

module com.jwebmp.plugins.angularprettycheckboxes {
	exports com.jwebmp.plugins.angularprettycheckboxes;

	requires com.jwebmp.core;
	requires java.validation;

	provides IPageConfigurator with AngularPrettyCheckboxesPageConfigurator;
	provides IAngularModule with AngularPrettyCheckboxesModule;

	opens com.jwebmp.plugins.angularprettycheckboxes to com.fasterxml.jackson.databind,com.jwebmp.core;
}

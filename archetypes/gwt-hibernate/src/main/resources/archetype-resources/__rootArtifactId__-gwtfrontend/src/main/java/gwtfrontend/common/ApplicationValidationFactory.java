package ${package}.gwtfrontend.common;

import javax.validation.Validator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.AbstractGwtValidatorFactory;
import com.google.gwt.validation.client.GwtValidation;
import com.google.gwt.validation.client.impl.AbstractGwtValidator;

public class ApplicationValidationFactory extends AbstractGwtValidatorFactory {
	/**
	 * Validator marker for the Validation Sample project. Only the classes and groups listed
	 * in the {@link GwtValidation} annotation can be validated.
	 */

	/* You will need to uncomment the following annotation and add here your VOs to be validated like in the example */
	// PLEASE UNCOMMENT THIS: @GwtValidation({YourClass1VO.class, YourClass2VO.class})
	public interface GwtValidator extends Validator {
		
	}
	
	@Override
	public AbstractGwtValidator createValidator() {
		return GWT.create(GwtValidator.class);
	}

}
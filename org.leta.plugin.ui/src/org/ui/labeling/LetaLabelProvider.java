/*
* generated by Xtext
*/
package org.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.leta.Complement;
import org.leta.Fact;
import org.leta.FactComposite;
import org.leta.FactExt;
import org.leta.Formula;
import org.leta.Term;
import org.leta.TermComposite;
import org.leta.TermInstance;
import org.leta.TermWithAssociation;
import org.leta.VerifyClause;
import org.leta.WhenClause;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class LetaLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public LetaLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	@Override
	public Object text(Object element) {
	    
	    if (element instanceof VerifyClause) {
		return "Verify";
	    } else if (element instanceof WhenClause) {
		return "When";
	    } else if (element instanceof Term) {
		return "Term";
	    } else if (element instanceof TermInstance) {
		return "TermInstance";
	    } else if (element instanceof TermWithAssociation) {
		return "TermWithAssociation";
	    } else if (element instanceof TermComposite) {
		return "TermComposite";
	    } else if (element instanceof Complement) {
		return "Complement";
	    } else if (element instanceof Fact) {
		return "Fact";
	    } else if (element instanceof FactExt) {
		return "FactExt";
	    } else if (element instanceof FactComposite) {
		return "FactComposite";
	    } else if (element instanceof Formula) {
		return "FactComposite";
	    }

	    return null;
	}

/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}

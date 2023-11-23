package it.univaq.disim.mde2324.serializer;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Juri.Book;
import Juri.JuriFactory;
import Juri.JuriPackage;
import Juri.Library;
import Juri.Loan;
import Juri.Member;

public class Util {
	public static Library create() {
		Library model = JuriFactory.eINSTANCE.createLibrary();
		model.setName("JURI LIB");
		Book entity1 = JuriFactory.eINSTANCE.createBook();
		entity1.setName("Harry Potter 1");
		entity1.setCopies(BigInteger.valueOf(3));
		Book entity2 = JuriFactory.eINSTANCE.createBook();
		entity2.setName("Harry Potter 2");
		entity2.setCopies(BigInteger.valueOf(3));
		model.getBooks().addAll(Arrays.asList(entity1, entity2));

		Member m1 = JuriFactory.eINSTANCE.createMember();
		m1.setName("Juri");
		m1.setLibrary(model);

		Loan loan = JuriFactory.eINSTANCE.createLoan();
		loan.setBook(entity2);
		loan.setMember(m1);

		model.getLoans().add(loan);
		return model;
	}

	public final static String FILENAME = "testLiveMDE.xmi";

	public static Diagnostic validate(Library wm) {
		return Diagnostician.INSTANCE.validate(wm);
	}

	public static void main(String[] args) {
		Library app = create();
		serializeModel(app, FILENAME);
		Library libl = load(FILENAME);
		
		Diagnostic d = validate(libl);
		if(d.getSeverity() != Diagnostic.ERROR)
			System.out.println("the model is valid");
		else
			System.out.println("The model is not invalid");
		System.out.println(app.getBooks().size());
		app.getBooks().forEach(z -> System.out.println(z.getName()));
	}

	public static Library load(String fileName) {
		EPackage.Registry.INSTANCE.put(JuriPackage.eNS_URI, JuriPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Library myWeb = (Library) resource.getContents().get(0);
		System.out.println(myWeb);
		return myWeb;
	}

	public static void serializeModel(Library wm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

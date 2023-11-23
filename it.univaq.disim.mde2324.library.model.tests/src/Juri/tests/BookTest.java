/**
 */
package Juri.tests;

import Juri.Book;
import Juri.JuriFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link Juri.Book#getLoans() <em>Loans</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Juri.Book#isAvailable() <em>Is Available</em>}</li>
 *   <li>{@link Juri.Book#SufficientCopies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sufficient Copies</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BookTest extends TestCase {

	/**
	 * The fixture for this Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Book fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BookTest.class);
	}

	/**
	 * Constructs a new Book test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Book fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Book test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Book getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JuriFactory.eINSTANCE.createBook());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link Juri.Book#getLoans() <em>Loans</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Juri.Book#getLoans()
	 * @generated
	 */
	public void testGetLoans() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Juri.Book#isAvailable() <em>Is Available</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Juri.Book#isAvailable()
	 * @generated
	 */
	public void testIsAvailable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Juri.Book#SufficientCopies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sufficient Copies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Juri.Book#SufficientCopies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testSufficientCopies__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BookTest

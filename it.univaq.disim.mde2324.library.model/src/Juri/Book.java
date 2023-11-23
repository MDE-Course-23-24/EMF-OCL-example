/**
 */
package Juri;

import java.math.BigInteger;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Juri.Book#getName <em>Name</em>}</li>
 *   <li>{@link Juri.Book#getCopies <em>Copies</em>}</li>
 *   <li>{@link Juri.Book#getLibrary <em>Library</em>}</li>
 *   <li>{@link Juri.Book#getLoans <em>Loans</em>}</li>
 * </ul>
 *
 * @see Juri.JuriPackage#getBook()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SufficientCopies'"
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Juri.JuriPackage#getBook_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Juri.Book#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' attribute.
	 * @see #setCopies(BigInteger)
	 * @see Juri.JuriPackage#getBook_Copies()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCopies();

	/**
	 * Sets the value of the '{@link Juri.Book#getCopies <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copies</em>' attribute.
	 * @see #getCopies()
	 * @generated
	 */
	void setCopies(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Juri.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see Juri.JuriPackage#getBook_Library()
	 * @see Juri.Library#getBooks
	 * @model opposite="books" transient="false"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link Juri.Book#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' reference list.
	 * The list contents are of type {@link Juri.Loan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' reference list.
	 * @see Juri.JuriPackage#getBook_Loans()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='loans-&gt;size() &lt; copies'"
	 * @generated
	 */
	Boolean isAvailable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n       \t\tlibrary.loans-&gt;select(book=self)-&gt;size() &lt;= copies'"
	 * @generated
	 */
	boolean SufficientCopies(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Book

/**
 */
package Juri;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Juri.Member#getName <em>Name</em>}</li>
 *   <li>{@link Juri.Member#getLibrary <em>Library</em>}</li>
 *   <li>{@link Juri.Member#getLoan <em>Loan</em>}</li>
 *   <li>{@link Juri.Member#getLoans <em>Loans</em>}</li>
 *   <li>{@link Juri.Member#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @see Juri.JuriPackage#getMember()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueLoans'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Juri.JuriPackage#getMember_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Juri.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Juri.Library#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see Juri.JuriPackage#getMember_Library()
	 * @see Juri.Library#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link Juri.Member#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Loan</b></em>' reference list.
	 * The list contents are of type {@link Juri.Loan}.
	 * It is bidirectional and its opposite is '{@link Juri.Loan#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loan</em>' reference list.
	 * @see Juri.JuriPackage#getMember_Loan()
	 * @see Juri.Loan#getMember
	 * @model opposite="member"
	 * @generated
	 */
	EList<Loan> getLoan();

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' reference list.
	 * The list contents are of type {@link Juri.Loan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' reference list.
	 * @see Juri.JuriPackage#getMember_Loans()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link Juri.Book}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see Juri.JuriPackage#getMember_Books()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n      \t\tloans-&gt;size() &lt;= 2'"
	 * @generated
	 */
	boolean AtMostTwoLoans(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n      \t\tloans-&gt;isUnique(book)'"
	 * @generated
	 */
	boolean UniqueLoans(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Member

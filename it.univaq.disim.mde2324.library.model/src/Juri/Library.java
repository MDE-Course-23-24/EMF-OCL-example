/**
 */
package Juri;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Juri.Library#getName <em>Name</em>}</li>
 *   <li>{@link Juri.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link Juri.Library#getLoans <em>Loans</em>}</li>
 *   <li>{@link Juri.Library#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see Juri.JuriPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Juri.JuriPackage#getLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Juri.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link Juri.Book}.
	 * It is bidirectional and its opposite is '{@link Juri.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see Juri.JuriPackage#getLibrary_Books()
	 * @see Juri.Book#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' containment reference list.
	 * The list contents are of type {@link Juri.Loan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' containment reference list.
	 * @see Juri.JuriPackage#getLibrary_Loans()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link Juri.Member}.
	 * It is bidirectional and its opposite is '{@link Juri.Member#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see Juri.JuriPackage#getLibrary_Members()
	 * @see Juri.Member#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Member> getMembers();

} // Library
